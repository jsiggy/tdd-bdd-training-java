package training.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public abstract class GcdProviderTest {
   @Test
   public void canCalculateGcd() {
      int expected = 2;

      int actual = createGcdProvider().gcd(6, 4);

      assertEquals(expected, actual);
   }

   @Test
   public void shouldAlwaysReturnAPositiveResult() {
      int expected = 5;

      int actual = createGcdProvider().gcd(-10, -25);

      assertEquals(expected, actual);
   }

   @Test
   public void shouldReturnAbsoluteValueOfOriginalNumberForGcdOfAnythingAndZero() {
      int expected = 7;

      int actual = createGcdProvider().gcd(-7, 0);

      assertEquals(expected, actual);
   }

   protected abstract GcdProvider createGcdProvider();
}
