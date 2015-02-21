package training.tdd.area.shapes;

public class Circle implements Shape {

   private double radius;
   IdProvider idProvider = new DefaultIdProvider();

   public Circle(double radius) {
      if (radius <= 0.0)
         throw new IllegalArgumentException("Circle must have positive radius: " + radius);
      this.radius = radius;
   }
   
   @Override public long id() {
      return idProvider.next();
   }

   @Override public double area() {
      return Math.PI * radius * radius;
   }
}
