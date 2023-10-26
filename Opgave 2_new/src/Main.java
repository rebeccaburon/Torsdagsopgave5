import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        ArrayList<String> cofeeMenu = cafe.coffeeMenu;

        for( int i = 0; i < cofeeMenu.size(); i++ ) {
            String input = cofeeMenu.get(i) ;
            System.out.println(input);
        }

    }
}