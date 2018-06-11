package com.craiggwilson.mql.ast

abstract class Visitor<T> {
    open fun visit(n: Node?): T? {
        if (n == null) {
            return null
        }

        return n.accept(this)
    }

    // Expressions

    open fun visit(n: AddExpression): T = throw NotImplementedError()
    open fun visit(n: AndExpression): T = throw NotImplementedError()
    open fun visit(n: ArrayAccessExpression): T = throw NotImplementedError()
    open fun visit(n: BooleanExpression): T = throw NotImplementedError()
    open fun visit(n: ConditionalExpression): T = throw NotImplementedError()
    open fun visit(n: DecimalExpression): T = throw NotImplementedError()
    open fun visit(n: DivideExpression): T = throw NotImplementedError()
    open fun visit(n: DoubleExpression): T = throw NotImplementedError()
    open fun visit(n: EqualsExpression): T = throw NotImplementedError()
    open fun visit(n: FieldReferenceExpression): T = throw NotImplementedError()
    open fun visit(n: GreaterThanExpression): T = throw NotImplementedError()
    open fun visit(n: GreaterThanOrEqualsExpression): T = throw NotImplementedError()
    open fun visit(n: Int32Expression): T = throw NotImplementedError()
    open fun visit(n: Int64Expression): T = throw NotImplementedError()
    open fun visit(n: LessThanExpression): T = throw NotImplementedError()
    open fun visit(n: LessThanOrEqualsExpression): T = throw NotImplementedError()
    open fun visit(n: MultiplyExpression): T = throw NotImplementedError()
    open fun visit(n: ModExpression): T = throw NotImplementedError()
    open fun visit(n: NewArrayExpression): T = throw NotImplementedError()
    open fun visit(n: NewDocumentExpression): T = throw NotImplementedError()
    open fun visit(n: NotEqualsExpression): T = throw NotImplementedError()
    open fun visit(n: NotExpression): T = throw NotImplementedError()
    open fun visit(n: NullExpression): T = throw NotImplementedError()
    open fun visit(n: OrExpression): T = throw NotImplementedError()
    open fun visit(n: PowerExpression): T = throw NotImplementedError()
    open fun visit(n: RangeExpression): T = throw NotImplementedError()
    open fun visit(n: SubtractExpression): T = throw NotImplementedError()
    open fun visit(n: StringExpression): T = throw NotImplementedError()

    // Nodes

    open fun visit(n: FieldDeclaration): T = throw NotImplementedError()
    open fun visit(n: Statement): T = throw NotImplementedError()

    // Stages

    open fun visit(n: LimitStage): T = throw NotImplementedError()
    open fun visit(n: ProjectStage): T = throw NotImplementedError()
    open fun visit(n: SkipStage): T = throw NotImplementedError()
    open fun visit(n: SortStage): T = throw NotImplementedError()
    open fun visit(n: UnwindStage): T = throw NotImplementedError()

    protected fun <T> visit(items: List<T>, visit: (T) -> T): List<T> {
        var newItems: MutableList<T>? = null
        for (i in items.indices) {
            val item = items[i]
            val newItem = visit(item)
            if (newItem !== item && newItems == null) {
                newItems = mutableListOf()
                newItems.addAll(items.subList(0, i))
            }

            if (newItems != null) {
                newItems.add(newItem)
            }
        }

        return if (newItems == null) items else newItems
    }

    @Suppress("UNCHECKED_CAST")
    protected fun <T : Node> visit(items: List<T>): List<T> = visit(items) { visit(it) as T }
}

abstract class NodeVisitor : Visitor<Node>() {
    // Expressions

    override fun visit(n: AddExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: AndExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: ArrayAccessExpression): Node = n.update(
        visit(n.array) as Expression,
        visit(n.accessor) as Expression
    )
    override fun visit(n: BooleanExpression): Node = n
    override fun visit(n: ConditionalExpression): Node = n.update(
        visit(n.cases) { case ->
            case.update(
                visit(case.condition) as Expression,
                visit(case.then ) as Expression
            )
        },
        visit(n.fallback) as Expression?
    )
    override fun visit(n: DecimalExpression): Node = n
    override fun visit(n: DivideExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: DoubleExpression): Node = n
    override fun visit(n: EqualsExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: FieldReferenceExpression): Node = n.update(
        visit(n.parent) as Expression?,
        n.name)
    override fun visit(n: GreaterThanExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: GreaterThanOrEqualsExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: Int32Expression): Node = n
    override fun visit(n: Int64Expression): Node = n
    override fun visit(n: LessThanExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: LessThanOrEqualsExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: ModExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: MultiplyExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: NewArrayExpression): Node = n.update(
        visit(n.items)
    )
    override fun visit(n: NewDocumentExpression): Node = n.update(
        visit(n.elements) { element ->
            element.update(
                visit(element.field) as FieldDeclaration,
                visit(element.expression) as Expression
            )
        }
    )
    override fun visit(n: NotEqualsExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: NotExpression): Node = n.update(
        visit(n.expression) as Expression
    )
    override fun visit(n: NullExpression): Node = n
    override fun visit(n: OrExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: PowerExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: RangeExpression): Node = n.update(
        visit(n.start) as Expression,
        visit(n.end) as Expression,
        visit(n.step) as Expression
    )
    override fun visit(n: SubtractExpression): Node = n.update(
        visit(n.left) as Expression,
        visit(n.right) as Expression
    )
    override fun visit(n: StringExpression): Node = n

    // Nodes

    override fun visit(n: FieldDeclaration): Node = n.update(
        visit(n.parent) as FieldDeclaration?,
        n.name)

    override fun visit(n: Statement): Node = n.update(
        n.collectionName,
        visit(n.pipeline))

    // Stages

    override fun visit(n: LimitStage): Node = n.update(n.limit)

    override fun visit(n: ProjectStage): Node = n.update(
        visit(n.items) { item ->
            item.update(
                visit(item.field) as FieldDeclaration,
                visit(item.expression) as Expression
            )
        }
    )

    override fun visit(n: SkipStage): Node = n.update(n.skip)

    override fun visit(n: SortStage): Node = n.update(
        visit(n.fields) { field ->
            field.update(
                visit(field.field) as FieldReferenceExpression,
                field.direction
            )
        }
    )

    override fun visit(n: UnwindStage): Node = n.update(n.field, n.indexField, n.preserveNullAndEmpty)
}