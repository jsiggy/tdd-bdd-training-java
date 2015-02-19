package training.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FractionTest {

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

   @Test
   public void canAddTwoFractionsWithSameDenominator() {
      Fraction expected = new Fraction(3, 5);

      Fraction result = new Fraction(1, 5).plus(new Fraction(2, 5));

      assertEquals(expected, result);
   }

   @Test
   public void canAddTwoFractionsWithDifferentDenominatorsNoReductionNeeded() {
      Fraction expected = new Fraction(5, 6);

      Fraction result = new Fraction(1, 3).plus(new Fraction(1, 2));

      assertEquals(expected, result);
   }

   @Test
   public void canAddWholeNumberAndFraction() {
      Fraction expected = new Fraction(5, 4);

      Fraction result = new Fraction(1).plus(new Fraction(1, 4));

      assertEquals(expected, result);
   }

   @Test
   public void canReduceAFraction() {
      Fraction fraction = new Fraction(8, 4);
      fraction.gcdProvider = mock(GcdProvider.class);
      when(fraction.gcdProvider.gcd(8, 4)).thenReturn(4);

      Fraction reducedResult = fraction.reduce();

      assertEquals(new Fraction(2, 1), reducedResult);
   }

   @Test
   public void canAddTwoFractionsWithDifferentDenominatorsAndReduce() {
      Fraction expected = new Fraction(3, 4);

      Fraction result = new Fraction(1, 12).plus(new Fraction(2, 3));

      assertEquals(expected, result);
   }

   @Test
   public void canAddMoreThanTwoFractions() {
      Fraction expected = new Fraction(5, 2);

      Fraction result = new Fraction(1, 3).plus(new Fraction(2, 3)).plus(new Fraction(3, 2));

      assertEquals(expected, result);
   }

   @Test
   public void shouldAlwaysHaveNegativeValueOnNumerator() {
      Fraction expected = new Fraction(-6, 5);

      Fraction result = new Fraction(3, -5).plus(new Fraction(3, -5));

      assertEquals(expected, result);
   }

   @Test(expected = IllegalArgumentException.class)
   public void handlesDivideByZeroError() {
      new Fraction(1, 3).plus(new Fraction(8, 0));
   }

   @Test
   public void shouldOutputImproperFractionRatherThanProper() {
      Fraction expected = new Fraction(7, 5);

      Fraction result = new Fraction(4, 5).plus(new Fraction(3, 5));

      assertEquals(expected, result);
   }

   @Test
   public void shouldDefaultToNonNullGcdProvider() {
      Fraction fraction = new Fraction(5, 10);
      Fraction expected = fraction.reduce();
      assertNotNull(expected);
   }
}
