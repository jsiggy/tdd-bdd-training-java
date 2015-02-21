package training.tdd.area;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
   @Test
   public void canComputeArea() {
      Square square = createShape(5.0);

      double area = square.area();

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

   private Square createShape(double length) {
      return new Square(length);
   }
}
