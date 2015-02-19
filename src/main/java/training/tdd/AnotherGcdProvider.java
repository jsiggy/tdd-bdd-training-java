package training.tdd;

public class AnotherGcdProvider implements GcdProvider {
   @Override public int gcd(int a, int b) {
      while (b != 0) {
         int temp = b;
         b = a % b;
         a = temp;
      }
      return Math.abs(a);
   }
}
