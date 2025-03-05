package abstractfactory;

import java.io.IOException;
import java.util.Properties;

public class ShapeFactory {
  private static ShapeFactory instance = new ShapeFactory();
  private Properties properties;

  private ShapeFactory() {
    load("factory.properties");
  }

  public static ShapeFactory getInstance() {
    return instance;
  }

  public Shape create(Shape.Type type) {
    if (properties.get(type.name()).equals(Shape.Type.OVAL.name()))
      return OvalFactory.getInstance().create(type);
    else if (properties.get(type.name()).equals(Shape.Type.POLYGON.name()))
      return PolygonFactory.getInstance().create(type);

    return null;
  }
  
  private void load(String fileName) {
    properties = new Properties();

    try {
      properties.load(getClass().getClassLoader().getResourceAsStream(fileName));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
