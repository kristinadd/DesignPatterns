package abstractfactory;

public interface AbstractShapeFactory {
  public Shape create(Shape.Type type);

  public static AbstractShapeFactory get(Shape.Type type) {
    if (type == Shape.Type.OVAL)
      return OvalFactory.getInstance();
    else if (type == Shape.Type.POLYGON)
      return PolygonFactory.getInstance();
    
    return null;
  }
}
