package training.tdd.area.shapes;

public class Circle implements Shape {

   private double radius;
   private IdProvider idProvider;

   public Circle(double radius) {
      this(radius, null);
   }

   public Circle(double radius, IdProvider idProvider) {
      if (radius <= 0.0)
         throw new IllegalArgumentException("Circle must have positive radius: " + radius);
      this.radius = radius;
      this.idProvider = idProvider;
   }

   @Override public long id() {
      return idProvider.next();
   }

   @Override public double area() {
      return Math.PI * radius * radius;
   }
}
