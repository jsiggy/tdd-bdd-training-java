package training.tdd.area;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {
   @Test
   public void shouldInitializeEmptyBoard() {
      assertEquals(0, new Board().shapeCount());
   }
}
