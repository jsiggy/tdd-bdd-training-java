package training.tdd.area;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class BoardTest {
   @Test
   public void shouldInitializeEmptyBoard() {
      assertEquals(0, new Board().shapeCount());
   }

   @Test
   public void shouldContainAShapeThatWasAdded() {
      Shape shape = mock(Shape.class);
      assertTrue(new Board().add(shape).contains(shape));
   }

   @Test
   public void shouldNotContainAShapeThatWasNotAdded() {
      Shape shape = mock(Shape.class);
      assertFalse(new Board().contains(shape));
   }

   @Test
   public void canAddMultipleShapes() {
      Shape shape1 = mock(Shape.class);
      Shape shape2 = mock(Shape.class);

      Board board = new Board().add(shape1).add(shape2);

      assertTrue(board.contains(shape1));
      assertTrue(board.contains(shape2));
   }
}
