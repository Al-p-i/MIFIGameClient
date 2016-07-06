package mechanics;

/**
 * @author apomosov
 */
public class Eater {
  public static boolean eat(Edible eater, Edible edible) {
    if (eater.size() / edible.size() < 1.2) {
      return true;
    }
    return false;
  }
}
