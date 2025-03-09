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

// The static method get is associated with the interface itself, 
// not with any instance of an implementing class. This means you 
// can call it directly as AbstractShapeFactory.get(someType). This 
// method contains logic to return a specific factory instance 
// (using the abstract factory design pattern) based on the 
// provided shape type.

// *******************************************************************

// The abstract method create(Shape.Type type) provides a contract 
// that any implementing class must fulfill by supplying its own implementation.

// The static method get(Shape.Type type) provides a utility method that 
// can be used to obtain an instance of the appropriate factory without 
// needing an already constructed instance of an implementing class.
