package snakeGame;

import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class Snake {
    private final MyTimer timer;
    public List body;
    Node face;
    private int snakeHead;
    private int applePosition;
    private Integer count = 3;
    int x = 0;
    int y = 0;

    public Snake(Node face, List body){
        this.body = body;
        this.face = face;
//        Trans t = new Trans();
//        t.initialize(null, null);
        
        timer = new MyTimer();
        timer.start();
    }

    
    private class Trans implements Initializable{
        
        
        @Override
        public void initialize(URL location, ResourceBundle resources) {
//            Circle circle = new Circle(100);   
            Path path = new Path();
            path.getElements().add(new MoveTo(0,0));
            path.getElements().add(new HLineTo(300));
            path.getElements().add(new VLineTo(100));
//            addElement(path, (Node) body.get(0));
            addElement(path, face);
        }
        
        private void addElement(Path path, Node node){
            PathTransition transition = new PathTransition();
            transition.setNode(node);
            transition.setDuration(Duration.seconds(4));
            transition.setPath(path);
            transition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            transition.setCycleCount(PathTransition.INDEFINITE);
            transition.play();
        }
    }
    
    
    
    private void sleepFunc(int time){
        try {
            Thread.sleep(time);
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
    
        private class MyTimer extends AnimationTimer{
        

        
        public MyTimer(){
            moveApple();
        }
        
        @Override
        public void handle(long now) {
            doHandle();
        }

        private void doHandle() {
            Node node = (Node) body.get(0);
            System.out.println(node.getTranslateY());
            System.out.println(face.getTranslateX());
            node.setTranslateX(x++);
            face.setTranslateX(y++);
        }
    }
    
}