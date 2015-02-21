package training.tdd.area.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest extends ShapeTest {

   @Test
   public void canComputeArea() {
      double radius = 5.0;
      Shape shape = createShape(radius, UNUSED_DIMENSION, null);

      double area = shape.area();

      assertEquals(Math.PI * radius * radius, area, 0.000001);
   }

   @Override protected Shape createShape(double radius, double optionalDimension2, IdProvider idProvider) {
      return new Circle(radius, idProvider);
   }
}
