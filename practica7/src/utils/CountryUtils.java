package utils;
import classes.Country;
import java.sql.*;
import java.util.Scanner;

public class CountryUtils {
    public static boolean createCountry(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter country name: ");
        String name = in.nextLine();
        System.out.println("Enter country language: ");
        String language = in.nextLine();
        Country c = new Country(name, language);
        in.close();
        if (countryExists(name)){
            System.out.println("Country already exists");
            return false;
        }
        return insertCountry(c);
    }
    public static boolean insertCountry(Country c){
        try (PreparedStatement stmt = Database.getConnection().prepareStatement("INSERT INTO pais (nombre, idioma) VALUES (?, ?)")){
            stmt.setString(1, c.getName());
            stmt.setString(2, c.getLanguage());
            stmt.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean deleteCountry(String name){
        try{
            Statement stmt = Database.getConnection().createStatement();
            stmt.executeUpdate("DELETE FROM pais WHERE nombre = '" + name + "'");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean listCountries(){
        try(Statement stmt = Database.getConnection().createStatement();){
            ResultSet rs = stmt.executeQuery("SELECT * FROM pais");
            while (rs.next()){
                System.out.println(rs.getString("idpais") + " " + rs.getString("nombre") + " " + rs.getString("idioma"));
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean countryExists(String name){
        try{
            Statement stmt = Database.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pais WHERE nombre = '" + name + "'");
            if (rs.next()){
                return true;
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }

    public static boolean idExists(int id){
        try{
            Statement stmt = Database.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pais WHERE idpais = " + id);
            if (rs.next()){
                return true;
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }
}
