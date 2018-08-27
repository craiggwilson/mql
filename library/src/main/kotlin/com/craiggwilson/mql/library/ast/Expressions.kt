package com.craiggwilson.mql.library.ast

import org.bson.types.ObjectId
import java.math.BigDecimal
import java.util.UUID

sealed class Expression : Node()
sealed class LiteralExpression : Expression()
sealed class NumberExpression : LiteralExpression() {
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

    fun flatten(): List<Expression> {
        val parts = mutableListOf<Expression>()
        if (left is AndExpression) {
            parts += left.flatten()
        } else {
            parts += left
        }

        if (right is AndExpression) {
            parts += right.flatten()
        } else {
            parts += right
        }

        return parts
    }

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

data class BooleanExpression(val value: Boolean) : LiteralExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(value: Boolean): BooleanExpression {
        return if (value != this.value) {
            BooleanExpression(value)
        } else this
    }
}

data class ConcatExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun flatten(): List<Expression> {
        val parts = mutableListOf<Expression>()
        if (left is ConcatExpression) {
            parts += left.flatten()
        } else {
            parts += left
        }

        if (right is ConcatExpression) {
            parts += right.flatten()
        } else {
            parts += right
        }

        return parts
    }

    fun update(left: Expression, right: Expression): ConcatExpression {
        return if (left !== this.left || right !== this.right) {
            ConcatExpression(left, right)
        } else this
    }
}

data class ConditionalExpression(val cases: List<Case>, val fallback: Expression? = null) : Expression() {
    constructor(condition: Expression, then: Expression, fallback: Expression): this(listOf(Case(condition, then)), fallback)

    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(cases: List<Case>, fallback: Expression?): ConditionalExpression {
        return if (cases !== this.cases || fallback !== this.fallback) {
            ConditionalExpression(cases, fallback)
        } else this
    }

    data class Case(val condition: Expression, val then: Expression) {
        fun update(condition: Expression, then: Expression): Case {
            return if (condition !== this.condition || then !== this.then) {
                Case(condition, then)
            } else this
        }
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

    fun flatten(): FieldReferenceExpression {
        var name = this.name
        var parent = this.parent
        while (parent != null) {
            if (parent !is FieldReferenceExpression) {
                break
            }

            name = parent.name.append(name)
            parent = parent.parent
        }

        return update(parent, name)
    }

    fun update(parent: Expression?, name: FieldName): FieldReferenceExpression {
        return if (parent !== this.parent || name !== this.name) {
            FieldReferenceExpression(parent, name)
        } else this
    }
}

data class FunctionCallExpression(val name: FunctionName, val arguments: List<Argument>) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(name: FunctionName, arguments: List<Argument>): FunctionCallExpression {
        return if (name !== this.name || arguments !== this.arguments) {
            FunctionCallExpression(name, arguments)
        } else this
    }

    sealed class Argument {
        abstract val expression: Expression

        data class Positional(override val expression: Expression) : Argument() {
            fun update(expression: Expression): Positional {
                return if (expression !== this.expression) {
                    Positional(expression)
                } else this
            }
        }
        data class Named(val name: FunctionArgumentName, override val expression: Expression) : Argument() {
            fun update(name: FunctionArgumentName, expression: Expression): Named {
                return if (name !== this.name || expression !== this.expression) {
                    Named(name, expression)
                } else this
            }
        }
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

data class InExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): InExpression {
        return if (left !== this.left || right !== this.right) {
            InExpression(left, right)
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

data class LambdaExpression(val parameters: List<VariableName>, val expression: Expression) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(parameters: List<VariableName>, expression: Expression): LambdaExpression {
        return if (parameters !== this.parameters || expression !== this.expression) {
            LambdaExpression(parameters, expression)
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

data class LetExpression(val variables: List<Variable>, val expression: Expression) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(variables: List<Variable>, expression: Expression): LetExpression {
        return if (variables !== this.variables || expression !== this.expression) {
            LetExpression(variables, expression)
        } else this
    }

    data class Variable(val name: VariableName, val expression: Expression) {
        fun update(name: VariableName, expression: Expression): Variable {
            return if (name !== this.name || expression !== this.expression) {
                Variable(name, expression)
            } else this
        }
    }
}

data class LikeExpression(val left: Expression, val right: RegexExpression) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: RegexExpression): LikeExpression {
        return if (left !== this.left || right !== this.right) {
            LikeExpression(left, right)
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

data class NewArrayExpression(val items: List<Expression>) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(items: List<Expression>): NewArrayExpression {
        return if (items !== this.items) {
            NewArrayExpression(items)
        } else this
    }
}

data class NewDocumentExpression(val elements: List<Element>) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(elements: List<Element>): NewDocumentExpression {
        return if (elements !== this.elements) {
            NewDocumentExpression(elements)
        } else this
    }

    data class Element(val field: FieldDeclaration, val expression: Expression) {
        fun update(field: FieldDeclaration, expression: Expression): Element {
            return if (field !== this.field || expression !== this.expression) {
                Element(field, expression)
            } else this
        }
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

object NullExpression : LiteralExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)
}

data class NullCoalesceExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): NullCoalesceExpression {
        return if (left !== this.left || right !== this.right) {
            NullCoalesceExpression(left, right)
        } else this
    }
}

data class ObjectIdExpression(val value: ObjectId) : LiteralExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(value: ObjectId): ObjectIdExpression {
        return if (value != this.value) {
            ObjectIdExpression(value)
        } else this
    }
}

data class OrExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun flatten(): List<Expression> {
        val parts = mutableListOf<Expression>()
        if (left is OrExpression) {
            parts += left.flatten()
        } else {
            parts += left
        }

        if (right is OrExpression) {
            parts += right.flatten()
        } else {
            parts += right
        }

        return parts
    }

    fun update(left: Expression, right: Expression): OrExpression {
        return if (left !== this.left || right !== this.right) {
            OrExpression(left, right)
        } else this
    }
}

data class PowerExpression(override val left: Expression, override val right: Expression) : BinaryExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(left: Expression, right: Expression): PowerExpression {
        return if (left !== this.left || right !== this.right) {
            PowerExpression(left, right)
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

data class RegexExpression(val pattern: String, val options: String? = null) : LiteralExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(pattern: String, options: String): RegexExpression {
        return if (pattern != this.pattern || options != this.options) {
            RegexExpression(pattern, options)
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

data class StringExpression(val value: String) : LiteralExpression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(value: String): StringExpression {
        return if (value != this.value) {
            StringExpression(value)
        } else this
    }
}

data class VariableReferenceExpression(val name: VariableName) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(name: VariableName): VariableReferenceExpression {
        if (name !== this.name) {
            return VariableReferenceExpression(name)
        }
        return this
    }
}
