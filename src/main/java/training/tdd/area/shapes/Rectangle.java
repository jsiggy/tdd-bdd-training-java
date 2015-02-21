package training.tdd.area.shapes;

public class Rectangle implements Shape {
   private final double length;
   private final double width;
   IdProvider idProvider = new DefaultIdProvider();

   public Rectangle(double length, double width) {
      if (length <= 0.0 || width <= 0.0)
         throw new IllegalArgumentException("Both length and width of rectangle must be positive values: " + length + ", " + width);
      this.length = length;
      this.width = width;
   }

   @Override public long id() {
      return idProvider.next();
   }

   @Override public double area() {
      return length * width;
   }
}
