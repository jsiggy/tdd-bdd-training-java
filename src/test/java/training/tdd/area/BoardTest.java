package training.tdd.area;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BoardTest {

   public static final double FUDGE_DELTA = 0.000001;

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

   @Test
   public void shouldIndicateNumberOfShapesOnTheBoard() {
      Shape shape = mock(Shape.class);
      assertEquals(1, new Board().add(shape).shapeCount());
   }

   @Test
   public void canRemoveAShapeFromTheBoard() {
      Shape shape = mock(Shape.class);
      Board board = new Board().add(shape);

      board.remove(shape);

      assertFalse(board.contains(shape));
   }

   @Test
   public void canRemoveASpecificShapeById() {
      Shape shape1 = mock(Shape.class);
      Shape shape2 = mock(Shape.class);
      when(shape2.id()).thenReturn(1030l);
      Board board = new Board().add(shape1).add(shape2);

      board.remove(shape2.id());

      assertTrue(board.contains(shape1));
      assertFalse(board.contains(shape2));
   }

   @Test
   public void canAddSameShapeTwice() {
      Shape shape1 = mock(Shape.class);

      Board board = new Board().add(shape1).add(shape1);

      assertEquals(2, board.shapeCount());
   }

   @Test
   public void shouldRemoveAllShapesWithSameId() {
      Shape shape1 = mock(Shape.class);
      when(shape1.id()).thenReturn(1030l);
      Board board = new Board().add(shape1).add(shape1).add(shape1).add(shape1);

      board.remove(shape1.id());

      assertEquals(0, board.shapeCount());
   }

   @Test
   public void shouldHaveAnAreaOfZeroForEmptyBoard() {
      double area = new Board().areaOfShapes();

      assertEquals(0.0, area, FUDGE_DELTA);
   }

   @Test
   public void shouldReturnAreaOfTheShapeIfOnlyOneShapeOnBoard() {
      Shape shape = mock(Shape.class);
      when(shape.area()).thenReturn(10.0);
      Board board = new Board().add(shape);

      double area = board.areaOfShapes();

      assertEquals(10.0, area, FUDGE_DELTA);
   }
}
