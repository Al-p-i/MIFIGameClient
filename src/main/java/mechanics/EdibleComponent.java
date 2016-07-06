package mechanics;

/**
 * @author apomosov
 */
public class EdibleComponent implements Edible {
  private int size;
  public EdibleComponent(int size){
    this.size = size;
  }
  public int size() {
    return size;
  }
}
