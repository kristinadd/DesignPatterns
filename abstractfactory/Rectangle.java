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

public class Rectangle implements Polygon {
    @Override
    public void draw() {
        System.out.println("Drawing polygon rectangle");
    }
}