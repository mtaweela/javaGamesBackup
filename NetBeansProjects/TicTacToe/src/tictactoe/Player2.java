package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Player2 implements PlayerInterface{
    String [] board;
    String empty,stone;
    
    public Player2() {
        this.board =  new String[]{empty,empty,empty,empty,empty,empty,empty,empty,empty};  
        this.stone = empty;
    }
    
    @Override
    public int play(String []board, String stone,  ArrayList<Integer> randomNo){
        this.board = board;
        this.stone = stone;
        
        Random rand = new Random();
        int x = randomNo.get(rand.nextInt(randomNo.size()));
        return x;
    }
    
}
