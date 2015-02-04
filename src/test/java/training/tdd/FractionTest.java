package training.tdd;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {
   @Test
   public void canAddZeroAndZero() {

      Fraction expected = new Fraction(0);

      Fraction result = new Fraction(0).plus(new Fraction(0));

      Assert.assertEquals(expected, result);
   }
}
