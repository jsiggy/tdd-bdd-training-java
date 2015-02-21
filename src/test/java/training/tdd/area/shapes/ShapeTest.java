package training.tdd.area.shapes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public abstract class ShapeTest {

   private static final double LEGAL_OPTIONAL_DIMENSION = 1.0;
   private static final double ILLEGAL_OPTIONAL_DIMENSION = -1.0;
   static final double UNUSED_DIMENSION = ILLEGAL_OPTIONAL_DIMENSION;

   @Test
   public abstract void canComputeArea();

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowNegativeSizedDimensions() {
      createShape(-5.0, ILLEGAL_OPTIONAL_DIMENSION, null);
   }

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowZeroSizedDimensions() {
      createShape(0.0, ILLEGAL_OPTIONAL_DIMENSION, null);
   }

   @Test
   public void shouldUseIdProviderForAllShapes() {
      IdProvider idProvider = mock(IdProvider.class);

      createShape(5, LEGAL_OPTIONAL_DIMENSION, idProvider).id();

      verify(idProvider, atLeastOnce()).next();
   }

   @Test
   public void shouldCreateShapesWithUniqueId() {
      IdProvider idProvider = mock(IdProvider.class);
      when(idProvider.next()).thenReturn(1l).thenReturn(2l);
      assertNotEquals(createShape(5, LEGAL_OPTIONAL_DIMENSION, idProvider).id(), createShape(5, LEGAL_OPTIONAL_DIMENSION, idProvider).id());
   }

   protected abstract Shape createShape(double length, double optionalDimension2, IdProvider idProvider);
}
