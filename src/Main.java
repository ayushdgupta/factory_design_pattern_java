public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Client
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape(ShapeConstant.CIRCLE);
        Shape squareShape = shapeFactory.getShape(ShapeConstant.SQUARE);
        Shape rectangleShape = shapeFactory.getShape(ShapeConstant.RECTANGLE);

        circleShape.draw();
        squareShape.draw();
        rectangleShape.draw();

        Shape triangleShape = shapeFactory.getShape("Triangle");
    }
}