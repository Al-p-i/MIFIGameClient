package mechanics;

/**
 * @author apomosov
 */
public class RandomFoodSpawner implements FoodSpawner {

  @Override
  public Food spawnFood() {
    int size = GameConstants.MIN_FOOD_GAME_SIZE + GameRandom.rnd.nextInt(GameConstants.MAX_FOOD_GAME_SIZE - GameConstants.MIN_FOOD_GAME_SIZE);
    return new Food(size, size + GameRandom.rnd.nextInt(GameConstants.WORLD_WIDTH - size), size + GameRandom.rnd.nextInt(GameConstants.WORLD_HEIGHT - size));
  }
}
