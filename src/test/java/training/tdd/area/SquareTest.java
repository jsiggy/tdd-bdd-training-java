package training.tdd.area;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
   @Test
   public void shouldReturnSquareOfSideAsArea() {
      assertEquals(5.0 * 5.0, new Square(5.0).area(), 0.000001);
   }
}
