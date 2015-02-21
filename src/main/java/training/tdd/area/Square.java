package training.tdd.area;

public class Square implements Shape {

   private double length;

   public Square(double length) {
      if (length <= 0.0)
         throw new IllegalArgumentException("Length must be greater than 0");
      this.length = length;
   }

   @Override public long id() {
      return 0;
   }

   public double area() {
      return this.length * this.length;
   }
}
