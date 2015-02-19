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

   @Test
   public void canAddZeroAndNonZero() {
      Fraction expected = new Fraction(3);

      Fraction result = new Fraction(0).plus(new Fraction(3));

      assertEquals(expected, result);
   }

   @Test
   public void canAddAnyIntegers() {
      Fraction expected = new Fraction(7);

      Fraction result = new Fraction(12).plus(new Fraction(-5));

      assertEquals(expected, result);
   }

   @Test
   public void canAddMoreThanTwoIntegers() {
      Fraction expected = new Fraction(6);

      Fraction result = new Fraction(1).plus(new Fraction(2)).plus(new Fraction(3));

      assertEquals(expected, result);
   }
}
