/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author menagabara
 */
public class Computer implements PlayerInterface{
    String [] board;
    String empty,stone;
    
    public Computer() {
        this.board =  new String[]{empty,empty,empty,empty,empty,empty,empty,empty,empty};  
        this.stone = empty;
    }
    
    @Override
    public int play(String []board, String stone, ArrayList<Integer> randomNo){
        this.board = board;
        this.stone = stone;
        
        Random rand = new Random();
        int x = randomNo.get(rand.nextInt(randomNo.size()));
        return x;
    }
    
}
