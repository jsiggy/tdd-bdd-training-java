package training.tdd.area;

import org.junit.Test;

import static org.junit.Assert.*;

public abstract class ShapeTest {
   @Test
   public void canComputeArea() {
      Shape shape = createShape(5.0);

      double area = shape.area();

      assertEquals(5.0 * 5.0, area, 0.000001);
   }

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowNegativeSizedShape() {
      createShape(-5.0);
   }

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowZeroSizedShape() {
      createShape(0.0);
   }

   protected abstract Shape createShape(double length);
}
