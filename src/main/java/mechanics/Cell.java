package mechanics;

/**
 * @author apomosov
 */
public class Cell implements Locatable, Edible {
  private final LocatorComponent locatorComponent;
  private final EdibleComponent eater;


  public Cell(int size, int x, int y) {
    this.locatorComponent = new LocatorComponent(x, y);
    this.eater = new EdibleComponent(size);
  }

  public int getX() {
    return locatorComponent.getX();
  }

  public int getY() {
    return locatorComponent.getY();
  }

  public int size() {
    return eater.size();
  }
}
