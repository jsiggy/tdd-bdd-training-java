package training.tdd.area;

public class Board {
   private Shape shape;

   public int shapeCount() {
      return 0;
   }

   public Board add(Shape shape) {
      this.shape = shape;
      return this;
   }

   public boolean contains(Shape shape) {
      return this.shape == shape;
   }
}
