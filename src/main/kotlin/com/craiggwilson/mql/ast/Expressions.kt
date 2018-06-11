package com.craiggwilson.mql.ast

import java.math.BigDecimal

sealed class Expression : Node()
sealed class ConstantExpression : Expression()
sealed class NumberExpression : ConstantExpression() {
    abstract fun negate(): NumberExpression
}

// Expressions
data class BooleanExpression(val value: Boolean) : ConstantExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(value: Boolean): BooleanExpression {
        if (value != this.value) {
            return BooleanExpression(value)
        } else return this
    }
}

data class DecimalExpression(val value: BigDecimal) : NumberExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    override fun negate(): DecimalExpression {
        return DecimalExpression(value.negate())
    }

    fun update(value: BigDecimal): DecimalExpression {
        if (value != this.value) {
            return DecimalExpression(value)
        } else return this
    }
}

data class DoubleExpression(val value: Double) : NumberExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    override fun negate(): DoubleExpression {
        return DoubleExpression(-value)
    }

    fun update(value: Double): DoubleExpression {
        if (value != this.value) {
            return DoubleExpression(value)
        } else return this
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
        if (value != this.value) {
            return Int32Expression(value)
        } else return this
    }
}

data class Int64Expression(val value: Long) : NumberExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    override fun negate(): Int64Expression {
        return Int64Expression(-value)
    }

    fun update(value: Long): Int64Expression {
        if (value != this.value) {
            return Int64Expression(value)
        } else return this
    }
}

object NullExpression : ConstantExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)
}

data class StringExpression(val value: String) : ConstantExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(value: String): StringExpression {
        if (value != this.value) {
            return StringExpression(value)
        } else return this
    }
}
