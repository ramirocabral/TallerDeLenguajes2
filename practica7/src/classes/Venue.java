package classes;

public class Venue {
    private String name;
    private int capacity;
    private int countryID;

    public Venue(String name, int capacity, int countryID) {
        this.name = name;
        this.capacity = capacity;
        this.countryID = countryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", countryID=" + countryID +
                '}';
    }
}
