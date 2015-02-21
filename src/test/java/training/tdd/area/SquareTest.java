package training.tdd.area;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
   @Test
   public void shouldReturnSquareOfSideAsArea() {
      Square square = new Square(5.0);

      double area = square.area();

      assertEquals(5.0 * 5.0, area, 0.000001);
   }

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowNegativeSizedShape() {
      new Square(-5.0);
   }
}
