package utils;
import classes.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class VenueUtils {
    public static boolean createVenue(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter venue name: ");
        String name = in.nextLine();
        System.out.println("Enter venue capacity: ");
        int capacity = parseInt(in.nextLine());

        CountryUtils.listCountries();
        System.out.println("Enter venue country ID: ");
        int countryID = in.nextInt();
        while (!CountryUtils.idExists(countryID)){
            System.out.println("Enter venue country ID: ");
            countryID = parseInt(in.nextLine());
        }
        in.close();
        Venue venue = new Venue(name,capacity,countryID);
        if (checkVenue(venue)){
            return insertVenue(venue);
        }
        return false;
    }

    private static boolean insertVenue(Venue venue){
        try (PreparedStatement st = Database.getConnection().prepareStatement("INSERT INTO sede (nombre, capacidad, idpais) VALUES (?, ?, ?)")){
            st.setString(1, venue.getName());
            st.setInt(2, venue.getCapacity());
            st.setInt(3, venue.getCountryID());
            st.executeUpdate();
            System.out.println("nashe");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
            return true;
    }

    private static boolean checkVenue(Venue venue) {
        try (PreparedStatement preparedStatement = Database.getConnection().prepareStatement("SELECT COUNT(*) FROM sede WHERE nombre = ? AND idpais = ?")) {
            preparedStatement.setString(1, venue.getName());
            preparedStatement.setInt(2, venue.getCountryID());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return (count == 0);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void listVenues() {
        try (Statement st = Database.getConnection().createStatement();
             ResultSet resultSet = st.executeQuery("SELECT * FROM sede")) {
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("idsede") +
                        " Nombre: " + resultSet.getString("nombre") +
                        " Capacidad: " + resultSet.getInt("capacidad") +
                        " ID Pais: " + resultSet.getInt("idpais"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean deleteVenue(){
        Scanner in = new Scanner (System.in);
        listVenues();
        System.out.println("Select a valid venue ID:");
        int venueID = parseInt(in.nextLine());
        in.close();
        try (Statement st = Database.getConnection().createStatement()){
            st.executeUpdate("DELETE FROM sede WHERE idsede = " + venueID);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println("Venue deleted successfully");
        return true;
    }
}