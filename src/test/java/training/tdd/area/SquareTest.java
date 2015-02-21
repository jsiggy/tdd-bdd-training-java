package training.tdd.area;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest extends ShapeTest {

   @Test
   public void canComputeArea() {
      double length = 5.0;
      Shape shape = createShape(length);

      double area = shape.area();

      assertEquals(length * length, area, 0.000001);
   }

   @Override protected Shape createShape(double length) {
      return new Square(length);
   }
}
