package utils;
import java.sql.*;
public class Database {
    private static Connection conn = null;

    public static boolean setConnection(String database, String username, String password){
        try{
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/" + database, username, password);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static Connection getConnection(){
        return conn;
    }

    public static boolean clear(){
        //erase all data from database
        try{
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM futbolista");
            stmt.executeUpdate("DELETE FROM pais");
            stmt.executeUpdate("DELETE FROM sede");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean close(){
        try{
            conn.close();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
