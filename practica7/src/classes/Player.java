package classes;

public class Player {
    private String name;
    private String lastName;
    private int docID;
    private String phoneNumber;
    private String email;
    private int countryID;

    public Player(String name, String lastName, int docID, String phoneNumber, String email, int countryID) {
        this.name = name;
        this.lastName = lastName;
        this.docID = docID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.countryID = countryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setContryID(int countryID) {
        this.countryID = countryID;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", docID=" + docID +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", contryID=" + countryID +
                '}';
    }
}
