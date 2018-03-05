package snakeGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author mtaweela
 */
public class Snake extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        snakeGameBase sg = new snakeGameBase() {};
        
        Scene mainScene = new Scene(sg,Color.TRANSPARENT);
        
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(mainScene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
