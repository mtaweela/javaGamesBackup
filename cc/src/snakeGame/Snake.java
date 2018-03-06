package snakeGame;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

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
        
    
    
    
    public Snake(){
        lbl = new Label();
        lbl.setFont(Font.font(48));
        snakeGameBase.hBox.getChildren().add(lbl);
        timer = new MyTimer();
        timer.start();
    }
    
    private class MyTimer extends AnimationTimer {
        

        
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
                sleepFunc(1000);
                count--;
                System.out.println(count);
            }else if(count == 0){
                lbl.setText("Go");
                sleepFunc(2000);
                lbl.setText("");
                count--;
                System.out.println(count);
            }else{
                lbl.setText("play");
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