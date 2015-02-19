package training.tdd;

import java.math.BigInteger;

public class SimpleGcdProvider implements GcdProvider {
   @Override public int gcd(int i1, int i2) {
      return BigInteger.valueOf(i1).gcd(BigInteger.valueOf(i2)).intValue();
   }
}
