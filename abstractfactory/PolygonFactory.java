package abstractfactory;

public class PolygonFactory implements AbstractShapeFactory {
  private static PolygonFactory instance = new PolygonFactory();

  private PolygonFactory() {}

  public static PolygonFactory getInstance() {
    return instance;
  }

  public Shape create(Shape.Type type) {
    if (type == Shape.Type.RECTANGLE)
      return new Rectangle();
      
    else if (type == Shape.Type.SQUARE)
      return new Square();

    return null;
  }
}
