package training.tdd;

public class Fraction {
   private int integerValue;

   public Fraction(int integerValue) {
      this.integerValue = integerValue;
   }

   public Fraction plus(Fraction fraction) {
      if (fraction.integerValue != 0)
         return fraction;
      return this;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Fraction fraction = (Fraction) o;
      return integerValue == fraction.integerValue;
   }

   @Override public String toString() {
      return "Fraction{" +
         "integerValue=" + integerValue +
         '}';
   }
}
