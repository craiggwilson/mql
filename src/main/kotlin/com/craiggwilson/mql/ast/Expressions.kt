package com.craiggwilson.mql.ast

import java.math.BigDecimal

sealed class Expression : Node()
sealed class ConstantExpression : Expression()
sealed class NumberExpression : ConstantExpression() {
    abstract fun negate(): NumberExpression
}

// Expressions
data class AndExpression(val left: Expression, val right: Expression) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): AndExpression {
        return if (left !== this.left || right !== this.right) {
            AndExpression(left, right)
        } else this
    }
}

data class BooleanExpression(val value: Boolean) : ConstantExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(value: Boolean): BooleanExpression {
        return if (value != this.value) {
            BooleanExpression(value)
        } else this
    }
}

data class DecimalExpression(val value: BigDecimal) : NumberExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    override fun negate(): DecimalExpression {
        return DecimalExpression(value.negate())
    }

    fun update(value: BigDecimal): DecimalExpression {
        return if (value != this.value) {
            DecimalExpression(value)
        } else this
    }
}

data class DoubleExpression(val value: Double) : NumberExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    override fun negate(): DoubleExpression {
        return DoubleExpression(-value)
    }

    fun update(value: Double): DoubleExpression {
        return if (value != this.value) {
            DoubleExpression(value)
        } else this
    }
}

data class FieldReferenceExpression(val parent: Expression?, val name: FieldName) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(parent: Expression?, name: FieldName): FieldReferenceExpression {
        if (parent !== this.parent || name !== this.name) {
            return FieldReferenceExpression(parent, name)
        }
        return this
    }
}

data class Int32Expression(val value: Int) : NumberExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    override fun negate(): Int32Expression {
        return Int32Expression(-value)
    }

    fun update(value: Int): Int32Expression {
        return if (value != this.value) {
            Int32Expression(value)
        } else this
    }
}

data class Int64Expression(val value: Long) : NumberExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    override fun negate(): Int64Expression {
        return Int64Expression(-value)
    }

    fun update(value: Long): Int64Expression {
        return if (value != this.value) {
            Int64Expression(value)
        } else this
    }
}

data class NotExpression(val expression: Expression) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(expression: Expression): NotExpression {
        return if (expression !== this.expression) {
            NotExpression(expression)
        } else this
    }
}

object NullExpression : ConstantExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)
}

data class OrExpression(val left: Expression, val right: Expression) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): OrExpression {
        return if (left !== this.left || right !== this.right) {
            OrExpression(left, right)
        } else this
    }
}

data class StringExpression(val value: String) : ConstantExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(value: String): StringExpression {
        return if (value != this.value) {
            StringExpression(value)
        } else this
    }
}
