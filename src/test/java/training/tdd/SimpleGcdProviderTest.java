package training.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleGcdProviderTest {
   @Test
   public void canCalculateGcd() {
      assertEquals(2, new SimpleGcdProvider().gcd(6, 4));
   }
}
