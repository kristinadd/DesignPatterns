/**
 *****************************************************************************
 *
 * Design Pattern
 * 
 * Factory
 * 
 *****************************************************************************
 * Revision History
 *****************************************************************************
 * Date              Author      Description
 * 01-December-2022  Fred Y      Initial release
 *****************************************************************************
 */
package abstractfactory;

public interface Shape {
    public void draw();

    public enum Type {
        POLYGON, RECTANGLE, SQUARE, OVAL, CIRCLE;   
    }
}