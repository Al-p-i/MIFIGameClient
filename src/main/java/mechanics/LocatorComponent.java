package mechanics;

/**
 * @author apomosov
 */
public class LocatorComponent implements Locatable {
  private int x;
  private int y;

  public LocatorComponent(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
