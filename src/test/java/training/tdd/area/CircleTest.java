package training.tdd.area;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest extends ShapeTest {
   @Test
   public void canComputeArea() {
      double radius = 5.0;
      Shape shape = createShape(radius);

      double area = shape.area();

      assertEquals(Math.PI * radius * radius, area, 0.000001);
   }

   @Override protected Shape createShape(double radius) {
      return new Circle(radius);
   }
}
