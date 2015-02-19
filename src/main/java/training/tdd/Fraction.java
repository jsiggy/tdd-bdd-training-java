package training.tdd;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Fraction {
   private int numerator;
   private int denominator;

   public Fraction(int numerator) {
      this(numerator, 1);
   }

   public Fraction(int numerator, int denominator) {
      this.numerator = numerator;
      this.denominator = denominator;
   }

   public Fraction plus(Fraction that) {
      if (this.denominator == 0 || that.denominator == 0)
         throw new IllegalArgumentException("Cannot add illegal fractions(zero divisor):" + this + that);

      if (this.denominator != that.denominator)
         return new Fraction((this.numerator * that.denominator) + (this.denominator * that.numerator), this.denominator * that.denominator);
      else
         return new Fraction(this.numerator + that.numerator, this.denominator);
   }

   @Override public String toString() {
      return numerator + "/" + denominator;
   }
}
