import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe {
    // attribute of type ArrayList
    public ArrayList<String> coffeeMenu;

    public Cafe() {
        this.coffeeMenu = new ArrayList<>();
    }

    public void loadMenuData() {
        File file = new File("coffeeList.txt.");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String coffeList = scanner.nextLine();
                System.out.println(coffeList);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found, try again.");
        }
    }
}
