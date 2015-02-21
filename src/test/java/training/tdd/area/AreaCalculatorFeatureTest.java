package training.tdd.area;

import org.junit.Test;
import training.tdd.area.shapes.Square;

import static org.junit.Assert.*;

public class AreaCalculatorFeatureTest {
   private static final double FUDGE_DELTA = 0.00001;

   // these are "integration" tests... to verify when using real objects as opposed to mocks things work
   // normally would write these as part of a "feature" test (JBehave, Cucumber, Spock) -- not units

   @Test
   public void shouldComputeAreaWithARealSquare() {
      assertEquals(13.0, new Board().add(new Square(3)).add(new Square(2)).areaOfShapes(), FUDGE_DELTA);
   }
}
