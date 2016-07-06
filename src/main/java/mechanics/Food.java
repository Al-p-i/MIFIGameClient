package mechanics;

/**
 * @author apomosov
 */
public class Food implements Locatable, Edible {
  private EdibleComponent edibleComponent;
  private LocatorComponent locatorComponent;

  public Food(int size, int x, int y) {
    this.edibleComponent = new EdibleComponent(size);
    this.locatorComponent = new LocatorComponent(x, y);
  }

  public int getX() {
    return locatorComponent.getX();
  }

  public int getY() {
    return locatorComponent.getY();
  }

  @Override
  public int size() {
    return edibleComponent.size();
  }
}
