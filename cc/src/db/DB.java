package db;

import java.sql.*;

public class DB {

    private static final String url = "jdbc:mysql://localhost:3306/gameSystem";
    private static final String user = "toe";
    private static final String password = "123";
    private String queryString;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
 
    public static void main(String args[]) {
        DB db = new DB();
//        /* 
//            create the tables
//        */
        db.createTables();
//        
//        /*
//            create new player .. returns string (true or false)
//            if it returns ture .. player is saved
//            if it returns false .. then this name exists
//        */ 
//        String name;
//        String ip;
//        name = "player2"; ip = "100.093.029.333";
////         Boolean ok = db.newPlayer(name , ip);
////         System.out.println(ok);
//        
//        /*
//            get player id .. returns 0 or player id in database
//            if 0 .. player name doesnot exist
//        */
//        String playername = "playerl";
//        Integer playerid;
//         playerid = db.getPlayerId(playername);
//         System.out.println(playerid);
//
//        /*
//            get player ip
//        */
//        String playerip;
//        // playerip = db.getPlayerIp(playername);
//        // System.out.println(playerip);
//
//        /*
//            get game moves
//        */
//        String gameMoves;
//        // gameMoves = db.getGameMoves();
//        // System.out.println(gameMoves);
//
//        /*
//            save match
//        */
//        Integer result;
//        String moves;
//        Integer gameId;
//        Integer playerId;
//        playerId = 1; result = 10; moves = "123456789"; gameId = 1;
//        
//        // db.saveMatch(playerId, result, moves, gameId);
//
//        /*
//            create new game
//        */
//        String gameName;
//        gameName = "toe tao";
//        // db.newGame(gameName);
    }

    public DB(){
        
    }
        
    public void startConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement() ;            
        
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public void closeConnection(){
            try{
                stmt.close();
                con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
    }
    
    public void createTables(){
        this.startConnection();
        try {
            // CREATE TABLE animals ( id MEDIUMINT NOT NULL AUTO_INCREMENT,  name CHAR(30) NOT NULL, PRIMARY KEY (id) );
            queryString = "create table player ( id  MEDIUMINT NOT NULL AUTO_INCREMENT , name char(20) , ip char(15) , primary key(id) , unique(name) ) engine = MyISAM  charset utf8;";
            stmt.executeUpdate(queryString);
            newPlayer("dump" , "127.0.0.1");      
            queryString = "create table Game ( id  MEDIUMINT NOT NULL AUTO_INCREMENT , name char(20) not null , primary key(id) ) engine = MyISAM  charset utf8;";
            stmt.executeUpdate(queryString);
            queryString = "create table newMatch ( id  MEDIUMINT NOT NULL AUTO_INCREMENT , result smallint not null , moves char(9) not null , primary key(id) ) engine = MyISAM  charset utf8;";
            stmt.executeUpdate(queryString);
            queryString = "create table play ( match_id MEDIUMINT NOT NULL , player_id smallint not null , FOREIGN KEY (match_id) REFERENCES newMatch(id) , FOREIGN KEY (player_id) REFERENCES player(id) ) engine = MyISAM  charset utf8;";
            stmt.executeUpdate(queryString);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.closeConnection();            
        }
    }

    public Boolean newPlayer(String name , String ip){
        this.startConnection();
        try {
            queryString = "insert into player ( name, ip ) values ('" + name+ "', '" + ip+ "');";
            stmt.executeUpdate(queryString) ;
        } catch (SQLException e) {
            return false;
        }finally{
            this.closeConnection();            
        }
        return true;
    }

    public void saveMatch( Integer playerId, Integer result, String moves, Integer gameId){
        this.startConnection();
        try {
            queryString = "insert into newMatch (result, moves ) values (  "+ result+ ", '" + moves+ "');";
            stmt.executeUpdate(queryString) ;

            rs = stmt.executeQuery("select count(id) from newMatch;");
            rs.next();
            Integer matchId;
            matchId = new Integer(rs.getString(1));
            matchId++;
            
            queryString = "insert into play (match_id, player_id ) values ( " + matchId+ ", " + playerId + ");";
            stmt.executeUpdate(queryString) ;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.closeConnection();            
        }
    }

    public void newGame(String gameName){
        this.startConnection();
        try {
            queryString = "insert into Game ( name ) values ( '" + gameName+ "');";
            stmt.executeUpdate(queryString);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.closeConnection();            
        }
    }

    public Integer getPlayerId(String playername){
        Integer player;
        this.startConnection();
        try {
            queryString = "select id from player where name = '" + playername + "';";
            rs = stmt.executeQuery(queryString);
            rs.next();
            player =  new Integer(rs.getString(1));
            this.closeConnection();
            return player;
        } catch (SQLException e) {
            return 0;
        }finally{
            this.closeConnection();            
        }
    }

    public String getPlayerIp(String playername){
        String playerip;
        this.startConnection();
        try {
            queryString = "select ip from player where name = '" + playername + "';";
            rs = stmt.executeQuery(queryString);
            rs.next();
            playerip =  rs.getString(1);
            this.closeConnection();
            return playerip;         
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.closeConnection();            
        }

        return "";
    }

    public String getGameMoves(){
        String movesSeq;
        this.startConnection();
        try {
            queryString = "select moves from newMatch where id = (select count(id) from newMatch );";
            rs = stmt.executeQuery(queryString);
            rs.next();
            movesSeq =  rs.getString(1);
            return movesSeq;  
        } catch (SQLException e) {
            return "there is no matches";
        }finally{
            this.closeConnection();            
        }
    }
    
}