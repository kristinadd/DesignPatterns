package abstractfactory;

public class Main {
  public static void main(String[] args) {
    Shape shape1 = AbstractShapeFactory.get(Shape.Type.OVAL).create(Shape.Type.CIRCLE);
    shape1.draw();

    Shape shape2 = AbstractShapeFactory.get(Shape.Type.POLYGON).create(Shape.Type.RECTANGLE);
    shape2.draw();

    Shape shape3 = AbstractShapeFactory.get(Shape.Type.POLYGON).create(Shape.Type.SQUARE);
    shape3.draw();


    shape1 = ShapeFactory.getInstance().create(Shape.Type.CIRCLE);
    shape2 = ShapeFactory.getInstance().create(Shape.Type.RECTANGLE);
    shape3 = ShapeFactory.getInstance().create(Shape.Type.SQUARE);

  }
}
