import java.sql.*;
import utils.*;
import java.util.Scanner;
import utils.Database;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        while (true){
            if (createConnection()){
                break;
            }
        }
        while (menu()){
            System.out.println("Enter an option:");
        }
        Database.close();
        System.out.println("Connection closed");
  }

    private static boolean menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("""
                1. Create Country\s
                2. List Countries\\s
                3. Create Player\\s
                4. List Players\\s
                5. Create Venue\s
                6. Delete Venue\s
                7. List Venues\s
                8. exit\s
                """);
        int option = parseInt(in.nextLine());
        switch (option){
            case 1:
                CountryUtils.createCountry();
                break;
            case 2:
                CountryUtils.listCountries();
                break;
            case 3:
                PlayerUtils.createPlayer();
                break;
            case 4:
                PlayerUtils.listPlayers();
                break;
            case 5:
                VenueUtils.createVenue();
                break;
            case 6:
                VenueUtils.deleteVenue();
                break;
            case 7:
                VenueUtils.listVenues();
                break;
            case 8:
                return false;
            default:
                System.out.println("Invalid option");
        }
        in.close();
        return true;
    }

    private static boolean createConnection(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter database name: ");
        String database = in.nextLine();
        System.out.println("Enter user name: ");
        String userName = in.nextLine();
        System.out.println("Enter password: ");
        String password = in.nextLine();
        in.close();
        if (Database.setConnection(database, userName, password)){
            System.out.println("Connection established");
            return true;
        }
        else{
            System.out.println("Connection failed");
            return false;
        }
    }
}