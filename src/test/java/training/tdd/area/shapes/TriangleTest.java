package training.tdd.area.shapes;

import static org.junit.Assert.*;

public class TriangleTest extends ShapeTest {
   @Override public void canComputeArea() {
      double base = 5.0;
      double height = 10.0;
      Shape shape = createShape(base, height, null);

      double area = shape.area();

      assertEquals(25.0, area, 0.000001);
   }

   @Override protected Shape createShape(double length, double height, IdProvider idProvider) {
      Triangle triangle = new Triangle(length, height);
      triangle.idProvider = idProvider;
      return triangle;
   }
}
