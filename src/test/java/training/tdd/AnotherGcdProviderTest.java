package training.tdd;

public class AnotherGcdProviderTest extends GcdProviderTest {
   @Override protected GcdProvider createGcdProvider() {
      return new AnotherGcdProvider();
   }
}
