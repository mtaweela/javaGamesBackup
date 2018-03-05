package tictactoe;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//this is a class for saving an object of type player, his name and the turn("x" or "o").
class User{
    public PlayerInterface userPlayer;
    String name;
    String turn;

    public User(PlayerInterface userPlayer,String name, String turn) {
        this.userPlayer=userPlayer;
        this.name=name;
        this.turn=turn;
    }
    
}

//this is a custom return class.
class ReturnHandler {
    private String status;
    private String[] data;
  
    public void setStatus(String s){
        this.status = s;
    }
  
    public String getSatus(){
        return this.status;
    }

    public void setData(String[] d){
        this.data = d;
    }

    public String[] getData(){
        return this.data;
    }
    
}

public class TicTacToe {
    int removeNo= -1;
    ArrayList<Integer> availableList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
    String empty,x,o,turn,winner;
    String [] board;
    boolean isGameEnded, isWinner, isGameStarted;
    ArrayList<User> userPlayer;
    ArrayList<User> userPlayer2;
    int [][] winningStates = {
                                {0, 1, 2},
                                {3, 4, 5},
                                {6, 7, 8},
                                {0, 3, 6},
                                {1, 4, 7},
                                {2, 5, 8},
                                {0, 4, 8},
                                {2, 4, 6}
                            };

  
    TicTacToe(PlayerInterface userPlayer ,PlayerInterface userPlayer2){
        this.x = "x";
        this.o = "o";
        this.empty = empty;
        this.isGameEnded = false;
        this.isWinner = false;
        this.isGameStarted = false;
        this.winner = empty;
        this.turn = x;
        this.board =  new String[]{empty,empty,empty,empty,empty,empty,empty,empty,empty};  
        this.userPlayer = new ArrayList<>(Arrays.asList(new User(userPlayer,empty, empty)));
        this.userPlayer2 = new ArrayList<>(Arrays.asList(new User(userPlayer2,empty, empty)));
    }
    
    public static void main(String[] args) {
        Player player1=new Player();   
        Computer ai = new Computer();
        Player2 player2=new Player2();
        NetworkPlayer networkPlayer = new NetworkPlayer();

        Scanner scanner = new Scanner( System.in );
        System.out.println("please select your choice: 1- 2 players, 2- computer.");
        String input = scanner.nextLine();
        while(Integer.parseInt(input)>3){
            System.out.println("Please enter a valid number:");
            input = scanner.nextLine();    
        }
        switch (Integer.parseInt(input)) {
            case 1:{
                    System.out.print("player vs computer.\n");
                    TicTacToe t = new TicTacToe(player1, ai);
                    t.userPlayer2.get(0).name="pc";
                    t.userPlayer.get(0).name="player1";
                    ReturnHandler r = t.takeTurns();
                    System.out.println(r.getSatus()+"\n");
                    for (int i = 0; i < 9; i++) {
                        System.out.print(r.getData()[i] + "  ");
                        if((i==2) || (i==5) || (i==8)){
                            System.out.print("\n");
                        }
                    }
                    break;
                }
            case 2:{
                    System.out.print("player vs player - same machine.\n");
                    TicTacToe t = new TicTacToe(player1,player2);
                    t.userPlayer2.get(0).name="player 2";
                    t.userPlayer.get(0).name="player1";
                    ReturnHandler r = t.takeTurns();
                    System.out.println(r.getSatus()+"\n");
                    for (int i = 0; i < 9; i++) {
                        System.out.print(r.getData()[i] + "  ");
                        if((i==2) || (i==5) || (i==8)){
                            System.out.print("\n");
                        }
                    }
                    break;
                }
            case 3:{
                    System.out.print("player vs player - different machine.\n ");
                    TicTacToe t = new TicTacToe(player1,networkPlayer);
                    t.userPlayer2.get(0).name="netowork player";
                    t.userPlayer.get(0).name="player1";
                    ReturnHandler r = t.takeTurns();
                    System.out.println(r.getSatus()+"\n");
                    for (int i = 0; i < 9; i++) {
                        System.out.print(r.getData()[i] + "  ");
                        if((i==2) || (i==5) || (i==8)){
                            System.out.print("\n");
                        }
                    }
                    break;
                }
            default:
                break;
        }
        
    }
    
    
    public void display( ){
        for (int i = 0; i < 9; i++) {
            System.out.print(this.board[i] = "-");
            if((i==2) || (i==5) || (i==8)){
                System.out.print("\n");
            }
        }
    }
    
    public void whoGoFirst(){
        Random r = new Random();
        String c = r.nextBoolean() ? this.x : this.o;
        this.turn = c;
        if ("x".equals(c)){
            this.userPlayer.get(0).turn="x";
            this.userPlayer2.get(0).turn="o";
        }else{
            this.userPlayer2.get(0).turn="o";
            this.userPlayer.get(0).turn="x";
        }            
        this.isGameStarted = true;
    }
    
    public void makeMove(String stone, int pos){
        if (this.board[pos] == null ? this.empty == null : this.board[pos].equals(this.empty)){
            this.board[pos] = stone;
        }
        else{
            this.takeTurns();
        }  
    }
   
    public ReturnHandler takeTurns(){
        if (this.isGameStarted==false){
            this.whoGoFirst();
        }
        while(this.isGameEnded==false){
            if(availableList.size()>0){
                if (availableList.contains(removeNo)){
                    int x = availableList.indexOf(removeNo);
                    availableList.remove(x);
                }
            }
            
            if(this.userPlayer.get(0).turn.equals(this.turn)){
                int position = this.userPlayer.get(0).userPlayer.play(this.board, this.userPlayer.get(0).turn, availableList);
                removeNo = position;
                this.makeMove(this.userPlayer.get(0).turn, position);
                this.turn = this.userPlayer2.get(0).turn;
                this.isWinner(this.userPlayer.get(0).turn);
                
            }else{
                int position = this.userPlayer2.get(0).userPlayer.play(this.board, this.userPlayer.get(0).turn, availableList);
                removeNo = position;
                this.makeMove(this.userPlayer2.get(0).turn, position);
                this.turn = this.userPlayer.get(0).turn;
                this.isWinner(this.userPlayer2.get(0).turn);
            }
        }
        
        ReturnHandler r = new ReturnHandler();
        r.setData(this.board);
        r.setStatus(this.winner);
        return r;
        
        }
    

    public void isWinner(String turn){
        ArrayList<Integer> moves =new ArrayList<>();  
        outerloop:
        for(int stone=0; stone<this.board.length; stone++){
            if(this.board[stone] == null ? turn == null : this.board[stone].equals(turn)){
                moves.add(stone);
                
                for(int[]win:winningStates){
                    int counter = 0;
                    for(int j=0; j<win.length;j++){
                       if(moves.contains(win[j])){
                           counter++;
                           if(counter==3){
                               this.isWinner=true;
                               break outerloop;
                           }
                           else{
                                this.isWinner=false;
                            } 
                       }
                    }
                }
            }
        }
        if (this.isWinner==true){
            if (turn.equals(this.userPlayer.get(0).turn)){
                this.winner = this.userPlayer.get(0).name;
                this.isGameEnded=true;
                
            }
            else{
                this.winner = this.userPlayer2.get(0).name;
                this.isGameEnded=true;
            }

        }
        else{
            int counter = 0;
            for (String board1 : this.board) {
                if (board1 == null ? this.empty != null : !board1.equals(this.empty)) {
                    counter++;
                    if(counter==9){
                        this.winner="tie";
                        this.isGameEnded=true;
                    }
                }
            }
        }
        
        
    }
    
}
