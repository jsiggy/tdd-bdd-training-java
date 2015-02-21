package training.tdd.area;

import org.junit.Test;

public abstract class ShapeTest {
   @Test
   public abstract void canComputeArea();

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
