package utils;
import classes.Player;
import java.sql.*;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class PlayerUtils {
    public static boolean createPlayer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter player name: ");
        String name = in.nextLine();
        System.out.println("Enter player last name: ");
        String lastName = in.nextLine();
        System.out.println("Enter player id: ");
        int id = parseInt(in.nextLine());
        System.out.println("Enter player phone number: ");
        String phoneNumber = in.nextLine();
        System.out.println("Enter player email: ");
        String email = in.nextLine();

        System.out.println("Enter player country id: ");
        CountryUtils.listCountries();
        System.out.println("\n");
        int countryID = parseInt(in.nextLine());

        while (!CountryUtils.idExists(countryID)){
            countryID = in.nextInt();
        }

        Player p = new Player(name, lastName, id, phoneNumber, email, countryID);
        System.out.println(p.toString());
        System.out.println("Do you want to insert this player? (y/n)");
        String option = in.nextLine();
        if (option.equals("y")){
            return insertPlayer(p);
        }
        else{
            //copilot
            System.out.println("you are an idiot");
            return false;
        }
    }

    private static boolean insertPlayer(Player p){
        try (PreparedStatement stmt = Database.getConnection().prepareStatement("INSERT INTO futbolista (nombre, apellido, docIdentidad, telefono, email, idpais) VALUES (?, ?, ?, ?, ?, ?)")){
            stmt.setString(1, p.getName());
            stmt.setString(2, p.getLastName());
            stmt.setInt(3, p.getDocID());
            stmt.setString(4, p.getPhoneNumber());
            stmt.setString(5, p.getEmail());
            stmt.setInt(6, p.getCountryID());
            stmt.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void listPlayers(){
        try (Statement stmt = Database.getConnection().createStatement()){
            ResultSet rs = stmt.executeQuery("SELECT * FROM futbolista");
            while (rs.next()){
                System.out.println(rs.getString("nombre") + " " + rs.getString("pais"));
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}