public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    Customer(String firstName, String lastName, String userName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = id;


    }

    public String toString() {
        return " First name: " + firstName + ". Last name: " + lastName + ". Username: " + userName + ". Id-number: " + id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public int getid() {
        return this.id;
    }
}
