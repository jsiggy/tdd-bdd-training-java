package training.tdd.area.shapes;

public class DefaultIdProvider implements IdProvider {
   private static int id = 0;

   @Override public long next() {
      return id++;
   }
}
