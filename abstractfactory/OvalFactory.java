package abstractfactory;

public class OvalFactory implements AbstractShapeFactory{
  private static OvalFactory instance = new OvalFactory();

  private OvalFactory() {}

  public static OvalFactory getInstance() {
    return instance;
  }

  public Shape create(Shape.Type type) {
    if (type == Shape.Type.CIRCLE)
      return new Circle();

    return null;
  }
}
