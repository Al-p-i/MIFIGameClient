package mechanics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author apomosov
 */
public class WorldMap {
  private final HashSet<Cell> cells = new HashSet<>();
  private final HashSet<Food> foods = new HashSet<>();

  public HashSet<Cell> getCells() {
    return cells;
  }

  public HashSet<Food> getFoods() {
    return foods;
  }

  public void addFood(Food food) {
    foods.add(food);
  }

  public void removeFood(Food food) {
    foods.remove(food);
  }

  public void addCell(Cell cell) {
    cells.add(cell);
  }

  public void removeCell(Cell cell) {
    cells.remove(cell);
  }
}
