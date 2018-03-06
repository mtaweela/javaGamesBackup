package BoardGames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random ;
import java.util.Scanner;


public class Player implements PlayerInterface{

    String [] board;
    String empty,stone;
    
    public Player() {
        this.board =  new String[]{empty,empty,empty,empty,empty,empty,empty,empty,empty};  
        this.stone = empty;
    }
    
    @Override
    public int play(String []board, String stone, ArrayList<Integer> randomNo){
        this.board = board;
        this.stone = stone;
        
        Scanner scanner = new Scanner( System.in );
        System.out.println("please enter a field: ");
        String input = scanner.nextLine();
        while(!randomNo.contains(Integer.parseInt(input))){
            System.out.println("Please enter a valid number: ");
            input = scanner.nextLine();  
        }
        int x = Integer.parseInt(input);
        return x; 
    }
    
}
