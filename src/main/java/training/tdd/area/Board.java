package training.tdd.area;

import training.tdd.area.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Board {
   private final List<Shape> shapes = new ArrayList<Shape>();

   public int shapeCount() {
      return shapes.size();
   }

   public Board add(Shape shape) {
      shapes.add(shape);
      return this;
   }

   public boolean contains(Shape shape) {
      return shapes.contains(shape);
   }

   public Board remove(Shape shape) {
      shapes.remove(shape);
      return this;
   }

   public Board remove(long id) {
      for (int i = shapes.size() - 1; i >= 0; i--) {
         Shape shape = shapes.get(i);
         if (shape.id() == id) {
            shapes.remove(shape);
         }
      }
      return this;
   }

   public double areaOfShapes() {
      double area=0.0;
      for (Shape shape : shapes) {
         area += shape.area();
      }
      return area;
   }
}
