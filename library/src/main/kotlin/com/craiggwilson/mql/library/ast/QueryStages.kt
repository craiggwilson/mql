package com.craiggwilson.mql.library.ast

sealed class Stage : Node()

data class GroupStage(val by: Expression?, val projection: NewDocumentExpression) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(by: Expression?, projection: NewDocumentExpression): GroupStage {
        if (by !== this.by || projection !== this.projection) {
            return GroupStage(by, projection)
        }

        return this
    }
}

data class LimitStage(val limit: Long) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(limit: Long): LimitStage {
        if (limit != this.limit) {
            return LimitStage(limit)
        }

        return this
    }
}

data class LookupStage(val field: FieldDeclaration, val variables: List<Variable>, val statement: QueryStatement) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(field: FieldDeclaration, variables: List<Variable>, statement: QueryStatement): LookupStage {
        return if (field !== this.field || variables !== this.variables || statement !== this.statement) {
            LookupStage(field, variables, statement)
        } else this
    }

    data class Variable(val name: VariableName, val expression: Expression) {
        fun update(variableName: VariableName, expression: Expression): Variable {
            return if (variableName != this.name || expression !== this.expression) {
                Variable(variableName, expression)
            } else this
        }
    }
}

data class MatchStage(val expression: Expression) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(expression: Expression): MatchStage {
        return if (expression !== this.expression) {
            MatchStage(expression)
        } else this
    }
}

data class ProjectStage(val items: List<Item>) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(items: List<Item>): ProjectStage {
        return if (items !== this.items) {
            ProjectStage(items)
        } else this
    }

    sealed class Item {
        abstract val field: FieldDeclaration

        data class Exclude(override val field: FieldDeclaration): ProjectStage.Item() {
            fun update(field: FieldDeclaration): Exclude {
                return if (field !== this.field) {
                    return Exclude(field)
                } else this
            }
        }
        data class Include(override val field: FieldDeclaration, val expression: Expression): ProjectStage.Item() {
            fun update(field: FieldDeclaration, expression: Expression): Include {
                return if (field !== this.field || expression !== this.expression) {
                    return Include(field, expression)
                } else this
            }
        }
    }
}

data class SkipStage(val skip: Long) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(skip: Long): SkipStage {
        if (skip != this.skip) {
            return SkipStage(skip)
        }

        return this
    }
}

data class SortStage(val fields: List<Field>) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(fields: List<Field>): SortStage {
        return if (fields !== this.fields) {
            SortStage(fields)
        } else this
    }

    data class Field(val field: FieldReferenceExpression, val direction: Direction) {
        fun update(field: FieldReferenceExpression, direction: Direction): Field {
            return if (field !== this.field || direction != this.direction) {
                Field(field, direction)
            } else this
        }
    }
}

data class UnwindStage(
    val field: FieldReferenceExpression,
    val indexField: FieldDeclaration?,
    val preserveNullAndEmpty: Boolean
) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(
        field: FieldReferenceExpression,
        indexField: FieldDeclaration?,
        preserveNullAndEmpty: Boolean
    ): UnwindStage {
        if (field !== this.field || indexField !== this.indexField || preserveNullAndEmpty != this.preserveNullAndEmpty) {
            return UnwindStage(field, indexField, preserveNullAndEmpty)
        }

        return this
    }
}
