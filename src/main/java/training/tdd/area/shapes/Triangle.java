package training.tdd.area.shapes;

public class Triangle implements Shape {
   private final double base;
   private final double height;
   private final IdProvider idProvider;

   public Triangle(double base, double height) {
      this(base, height, new DefaultIdProvider());
   }

   Triangle(double base, double height, IdProvider idProvider) {
      if (base <= 0.0 || height <= 0.0)
         throw new IllegalArgumentException("Both base and height of triangle must be positive values: " + base + ", " + height);
      this.base = base;
      this.height = height;
      this.idProvider = idProvider;
   }

   @Override public long id() {
      return idProvider.next();
   }

   @Override public double area() {
      return 0.5 * base * height;
   }
}
