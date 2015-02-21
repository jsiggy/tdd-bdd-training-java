package training.tdd.area;

import java.util.ArrayList;
import java.util.List;

public class Board {
   private Shape shape;
   private final List<Shape> shapes = new ArrayList<Shape>();

   public int shapeCount() {
      return 0;
   }

   public Board add(Shape shape) {
      shapes.add(shape);
      this.shape = shape;
      return this;
   }

   public boolean contains(Shape shape) {
      return shapes.contains(shape);
   }
}
