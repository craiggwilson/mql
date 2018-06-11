package com.craiggwilson.mql.ast

import java.math.BigDecimal

sealed class Expression : Node()
sealed class ConstantExpression : Expression()
sealed class NumberExpression : ConstantExpression() {
    abstract fun negate(): NumberExpression
}

sealed class BinaryExpression : Expression() {
    abstract val left: Expression
    abstract val right: Expression
}

// Expressions
data class AddExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): AddExpression {
        return if (left !== this.left || right !== this.right) {
            AddExpression(left, right)
        } else this
    }
}

data class AndExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): AndExpression {
        return if (left !== this.left || right !== this.right) {
            AndExpression(left, right)
        } else this
    }
}

data class ArrayAccessExpression(val array: Expression, val accessor: Expression) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(array: Expression, accessor: Expression): ArrayAccessExpression {
        return if (array !== this.array || accessor !== this.accessor) {
            ArrayAccessExpression(array, accessor)
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

data class DivideExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): DivideExpression {
        return if (left !== this.left || right !== this.right) {
            DivideExpression(left, right)
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

data class EqualsExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): EqualsExpression {
        return if (left !== this.left || right !== this.right) {
            EqualsExpression(left, right)
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

data class GreaterThanExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): GreaterThanExpression {
        return if (left !== this.left || right !== this.right) {
            GreaterThanExpression(left, right)
        } else this
    }
}

data class GreaterThanOrEqualsExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): GreaterThanOrEqualsExpression {
        return if (left !== this.left || right !== this.right) {
            GreaterThanOrEqualsExpression(left, right)
        } else this
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

data class LessThanExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): LessThanExpression {
        return if (left !== this.left || right !== this.right) {
            LessThanExpression(left, right)
        } else this
    }
}

data class LessThanOrEqualsExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): LessThanOrEqualsExpression {
        return if (left !== this.left || right !== this.right) {
            LessThanOrEqualsExpression(left, right)
        } else this
    }
}

data class ModExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): ModExpression {
        return if (left !== this.left || right !== this.right) {
            ModExpression(left, right)
        } else this
    }
}

data class MultiplyExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): MultiplyExpression {
        return if (left !== this.left || right !== this.right) {
            MultiplyExpression(left, right)
        } else this
    }
}

data class NotEqualsExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): NotEqualsExpression {
        return if (left !== this.left || right !== this.right) {
            NotEqualsExpression(left, right)
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

data class OrExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): OrExpression {
        return if (left !== this.left || right !== this.right) {
            OrExpression(left, right)
        } else this
    }
}

data class RangeExpression(val start: Expression, val end: Expression, val step: Expression? = null) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(start: Expression, end: Expression, step: Expression?): RangeExpression {
        return if (start !== this.start || end !== this.end || step !== this.step) {
            RangeExpression(start, end, step)
        } else this
    }
}

data class SubtractExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): SubtractExpression {
        return if (left !== this.left || right !== this.right) {
            SubtractExpression(left, right)
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
