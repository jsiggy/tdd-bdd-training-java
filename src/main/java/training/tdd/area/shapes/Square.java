package training.tdd.area.shapes;

public class Square implements Shape {

   private double length;

   public Square(double length) {
      if (length <= 0.0)
         throw new IllegalArgumentException("Square side must be greater than 0: " + length);
      this.length = length;
   }

   @Override public long id() {
      return 0;
   }

   public double area() {
      return this.length * this.length;
   }
}
