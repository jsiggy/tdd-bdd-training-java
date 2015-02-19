package training.tdd;

import java.math.BigInteger;

public class SimpleGcdProvider implements GcdProvider {
   @Override public int gcd(int i1, int i2) {
      BigInteger bi1 = BigInteger.valueOf(i1);
      BigInteger bi2 = BigInteger.valueOf(i2);
      return bi1.gcd(bi2).intValue();
   }
}
