package training.tdd.area.shapes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public abstract class ShapeTest {
   @Test
   public abstract void canComputeArea();

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowNegativeSizedShape() {
      createShape(-5.0, null);
   }

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowZeroSizedShape() {
      createShape(0.0, null);
   }

   @Test
   public void shouldUseIdProviderForAllShapes() {
      IdProvider idProvider = mock(IdProvider.class);

      createShape(5, idProvider).id();

      verify(idProvider, atLeastOnce()).next();
   }

   @Test
   public void shouldCreateShapesWithUniqueId() {
      IdProvider idProvider = mock(IdProvider.class);
      when(idProvider.next()).thenReturn(1l).thenReturn(2l);
      assertNotEquals(createShape(5, idProvider).id(), createShape(5, idProvider).id());
   }

   protected abstract Shape createShape(double length, IdProvider idProvider);
}
