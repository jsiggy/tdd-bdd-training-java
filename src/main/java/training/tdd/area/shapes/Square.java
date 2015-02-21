package training.tdd.area.shapes;

public class Square implements Shape {

   private double length;
   private IdProvider idProvider;

   public Square(double length) {
      this(length, null);
   }

   Square(double length, IdProvider idProvider) {
      if (length <= 0.0)
         throw new IllegalArgumentException("Square side must be greater than 0: " + length);
      this.length = length;
      this.idProvider = idProvider;
   }

   @Override public long id() {
      return idProvider.next();
   }

   public double area() {
      return this.length * this.length;
   }
}
