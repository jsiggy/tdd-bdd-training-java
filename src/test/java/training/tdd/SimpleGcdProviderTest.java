package training.tdd;

public class SimpleGcdProviderTest extends GcdProviderTest {

   @Override protected SimpleGcdProvider createGcdProvider() {
      return new SimpleGcdProvider();
   }
}
