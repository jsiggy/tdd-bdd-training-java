package training.tdd.area.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultIdProviderTest {
   @Test
   public void shouldProvideUniqueIdOnSuccessiveCalls() {
      DefaultIdProvider idProvider = new DefaultIdProvider();
      assertNotEquals(idProvider.next(), idProvider.next());
   }
}
