package launcher;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import mechanics.*;

/**
 * @author apomosov
 */
public class Launcher extends Application {
  private WorldMap worldMap;

  public void start(Stage primaryStage) throws Exception {
    Group root = initRootVisualizationGroup(primaryStage);

    initGameState();

    gameLoop(root);
  }

  private void gameLoop(Group root) {
    //TODO
    redrawUsers(root);
    redrawFood(root);
  }

  private void redrawFood(Group root) {
    Group circles = new Group();
    for (Food food : this.worldMap.getFoods()) {
      Circle circle = new Circle(food.getX(), food.getY(), food.size(), Color.GREEN);
      circle.setStrokeType(StrokeType.OUTSIDE);
      circle.setStroke(Color.RED);
      circle.setStrokeWidth(1);
      circles.getChildren().add(circle);
    }
    root.getChildren().add(circles);
  }

  private void redrawUsers(Group root) {
    Group circles = new Group();
    for (Cell cell : this.worldMap.getCells()) {
      Circle circle = new Circle(cell.getX(), cell.getY(), cell.size(), Color.BLACK);
      circle.setStrokeType(StrokeType.OUTSIDE);
      circle.setStroke(Color.BLUE);
      circle.setStrokeWidth(2);
      circles.getChildren().add(circle);
    }
    root.getChildren().add(circles);
  }

  private Group initRootVisualizationGroup(Stage primaryStage) {
    Group root = new Group();
    Scene scene = new Scene(root, GameConstants.WORLD_WIDTH, GameConstants.WORLD_HEIGHT, Color.WHITE);
    primaryStage.setScene(scene);

    primaryStage.show();
    return root;
  }

  private void initGameState() {
    this.worldMap = new WorldMap();
    CellSpawner cellSpawner = new RandomCellSpawner();
    for (int i = 0; i < 5; i++) {
      worldMap.addCell(cellSpawner.spawnRandomCell());
    }
    FoodSpawner foodSpawner = new RandomFoodSpawner();
    for (int i = 0; i < GameConstants.INITIAL_FOOD_NUMBER; i++) {
      worldMap.addFood(foodSpawner.spawnFood());
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
