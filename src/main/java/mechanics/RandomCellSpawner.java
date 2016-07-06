package mechanics;

/**
 * @author apomosov
 */
public class RandomCellSpawner implements CellSpawner {

  public Cell spawnRandomCell() {
    return new Cell(GameConstants.INITIAL_GAME_CELL_SIZE,
        GameConstants.INITIAL_GAME_CELL_SIZE + GameRandom.rnd.nextInt(GameConstants.WORLD_WIDTH - GameConstants.INITIAL_GAME_CELL_SIZE),
        GameConstants.INITIAL_GAME_CELL_SIZE + GameRandom.rnd.nextInt(GameConstants.WORLD_HEIGHT - GameConstants.INITIAL_GAME_CELL_SIZE));
  }
}
