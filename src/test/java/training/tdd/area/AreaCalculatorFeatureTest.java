package training.tdd.area;

import org.junit.Test;
import training.tdd.area.shapes.Circle;
import training.tdd.area.shapes.Square;

import static org.junit.Assert.*;

public class AreaCalculatorFeatureTest {
   private static final double FUDGE_DELTA = 0.00001;

   // these are "integration" tests... to verify when using real objects as opposed to mocks things work
   // normally would write these as part of a "feature" test (JBehave, Cucumber, Spock) -- not units

   @Test
   public void shouldComputeAreaWithARealSquare() {
      Board board = new Board().add(new Square(3)).add(new Square(2));

      double area = board.areaOfShapes();

      assertEquals(13.0, area, FUDGE_DELTA);
   }

   @Test
   public void canAddDifferentTypesOfShapes() {
      Board board = new Board().add(new Square(3)).add(new Circle(5));

      int count = board.shapeCount();

      assertEquals(2, count);
   }

   @Test
   public void canComputerAreaForTypesOfShapes() {
      Board board = new Board().add(new Square(10)).add(new Circle(2));

      double area = board.areaOfShapes();

      assertEquals(112.56637, area, FUDGE_DELTA);
   }

   @Test
   public void canRemoveAnObjectById() {

      Circle circleToRemove = new Circle(4);
      Board board = new Board().add(new Circle(10)).add(new Square(2)).add(circleToRemove).add(new Circle((5)));

      board.remove(circleToRemove);

      assertEquals(3, board.shapeCount());
      assertFalse(board.contains(circleToRemove));
   }
}
