package training.tdd.area.shapes;

import static org.junit.Assert.*;

public class RectangleTest extends ShapeTest {
   @Override public void canComputeArea() {
      Shape shape = createShape(12, 25, null);

      double area = shape.area();

      assertEquals(300, area, 0.000001);
   }

   @Override protected Shape createShape(double length, double optionalDimension2, IdProvider idProvider) {
      Rectangle rectangle = new Rectangle(length, optionalDimension2);
      rectangle.idProvider = idProvider;
      return rectangle;
   }
}
