package com.craiggwilson.mql.ast

sealed class Stage : Node()

data class LimitStage(val limit: Long) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(limit: Long): LimitStage {
        if (limit != this.limit) {
            return LimitStage(limit)
        }

        return this
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

data class UnwindStage(val field: FieldReferenceExpression,
                       val indexField: FieldDeclaration?,
                       val preserveNullAndEmpty: Boolean) : Stage() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(field: FieldReferenceExpression,
               indexField: FieldDeclaration?,
               preserveNullAndEmpty: Boolean): UnwindStage {
        if (field !== this.field || indexField !== this.indexField || preserveNullAndEmpty != this.preserveNullAndEmpty) {
            return UnwindStage(field, indexField, preserveNullAndEmpty)
        }

        return this
    }
}