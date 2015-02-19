package training.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {
   @Test
   public void canAddZeroAndZero() {
      Fraction expected = new Fraction(0);

      Fraction result = new Fraction(0).plus(new Fraction(0));

      assertEquals(expected, result);
   }

   @Test
   public void canAddNonZeroAndZero() {
      Fraction expected = new Fraction(5);

      Fraction result = new Fraction(5).plus(new Fraction(0));

      assertEquals(expected, result);
   }
}
