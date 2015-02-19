package training.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleGcdProviderTest {
   @Test
   public void canCalculateGcd() {
      int expected = 2;

      int actual = createGcdProvider().gcd(6, 4);

      assertEquals(expected, actual);
   }

   private SimpleGcdProvider createGcdProvider() {
      return new SimpleGcdProvider();
   }
}
