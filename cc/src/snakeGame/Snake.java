package snakeGame;

import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.animation.Transition;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 *
 * @author mtaweela
 */
public class Snake {
    private final MyTimer timer;
    private int snakeHead;
    private int applePosition;
    private Integer count = 3;
    public Label lbl;
    int x = 0 ;
    int y = 0;
        
    public Snake(){
        lbl = new Label();
        lbl.setFont(Font.font(48));
        lbl.setText("new");
        snakeGameBase.hBox.getChildren().add(lbl);
        
        Trans t = new Trans();
        t.initialize(null, null);
        timer = new MyTimer();
        timer.start();
    }

    
    private class Trans  implements Initializable{
        PathTransition transition = new PathTransition();
        
        @Override
        public void initialize(URL location, ResourceBundle resources) {
            System.out.println("ll");
            Circle circle = new Circle(100);    
            transition.setNode(lbl);
            transition.setDuration(Duration.seconds(3));
            transition.setPath(circle);
            transition.setCycleCount(PathTransition.INDEFINITE);
            transition.play();
        }
    }
    
    private class MyTimer extends AnimationTimer{
        

        
        public MyTimer(){
            moveApple();
        }
        
        @Override
        public void handle(long now) {
            doHandle();
        }

        private void doHandle() {
            if(count > 0){
                lbl.setText(count.toString());
                sleepFunc(2000);
                count--;
            }else if(count == 0){
                lbl.setText("Go");
                sleepFunc(2000);
                lbl.setText("play");
                count--;
            }else{
                
//                lbl.setTranslateY(x++);
//                lbl.setTranslateX(y++);
                System.out.println(lbl.getTranslateX() );
                moveSnake();
            }
        }
    }
    
    private void sleepFunc(int time){
        try {
            sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Snake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void moveSnake(){
        if(snakeHead == applePosition){
            addScore();
            moveApple();
        }
    }
    
    private void moveApple(){
        
    }
    
    private void addScore(){
        
    }
    
    
}