import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("Rebecca", "Sorensen", "rebeccaburon", 1);
        Customer c2 = new Customer("Lukas", "Zeimer", "zeimer", 2);

        customers.add(c1);
        customers.add(c2);
        System.out.println(customers);
    }

    public static void printCustomers (ArrayList <Customer> customers){
        for(Customer customer : customers ){
            System.out.println(customer);
        }

    }

}
