public class ShapeFactory{

    public Shape getShape(String shapeName){

        System.out.println("Creating "+shapeName+" shape object");

        return switch (shapeName){
            case ShapeConstant.CIRCLE -> new Circle();
            case ShapeConstant.RECTANGLE -> new Rectangle();
            case ShapeConstant.SQUARE -> new Square();
            default -> {
                System.out.println("No "+shapeName+" shape found in our db");
                yield null;
            }
        };
    }
}
