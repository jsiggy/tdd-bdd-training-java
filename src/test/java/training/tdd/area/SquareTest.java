package training.tdd.area;

public class SquareTest extends ShapeTest {

   @Override protected Shape createShape(double length) {
      return new Square(length);
   }
}
