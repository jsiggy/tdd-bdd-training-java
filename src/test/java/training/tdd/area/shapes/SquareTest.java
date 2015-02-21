package training.tdd.area.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest extends ShapeTest {

   @Test
   public void canComputeArea() {
      double length = 5.0;
      Shape shape = createShape(length, UNUSED_DIMENSION, null);

      double area = shape.area();

      assertEquals(length * length, area, 0.000001);
   }

   @Override protected Shape createShape(double length, double optionalDimension2, IdProvider idProvider) {
      return new Square(length, idProvider);
   }
}
