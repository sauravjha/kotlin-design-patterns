package sample.visitor

val perimeterVisitor = { shape: Shape ->
    when(shape) {
        is Square -> 4 * shape.side
        is Rectangle -> 2 * (shape.width + shape.height)
        is Circle -> 2 * Math.PI * shape.radius
    }
}