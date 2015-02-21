package training.tdd.area;

public class Square {

   private double length;

   public Square(double length) {
      this.length = length;
   }

   public double area() {
      return this.length * this.length;
   }
}
