package training.tdd;

public class Fraction {
   private int integerValue;

   public Fraction(int integerValue) {
      this.integerValue = integerValue;
   }

   public Fraction plus(Fraction fraction) {
      return new Fraction(0);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Fraction fraction = (Fraction) o;

      if (integerValue != fraction.integerValue) return false;

      return true;
   }
}
