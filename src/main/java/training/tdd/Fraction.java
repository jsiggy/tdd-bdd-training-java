package training.tdd;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Fraction {
   private int integerValue;
   private int denominator;

   public Fraction(int integerValue) {
      this.integerValue = integerValue;
   }

   public Fraction(int numerator, int denominator) {
      this.denominator = denominator;
   }

   public Fraction plus(Fraction that) {
      return new Fraction(this.integerValue + that.integerValue);
   }

   @Override public String toString() {
      return integerValue + "/" + denominator;
   }
}
