import java.util.Scanner;
import java.util.ArrayList;

public class Workshop3Project1GroceryList {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int length = 0, stopLevel = 0;
        ArrayList<String> groceryList = new ArrayList<String>();
        while (stopLevel < 3) {
            if (stopLevel == 0) System.out.println("Please type an item to add to your grocery list (or 'stop' to stop). ");
            else if (stopLevel == 1) System.out.println("Are you sure you want to stop? (type 'stop' to stop or continue typing grocery list items. ) ");
            else if (stopLevel == 2) System.out.println("Are you absolutely sure you want to stop? Consider carefully. (type 'stop' to stop or continue typing grocery list items. ) ");
            String item = in.nextLine();
            if (item.equals("stop")) {
                stopLevel++;
            }
            else {
                groceryList.add(item);
                length++;
            }
        }
        System.out.println("You have stoppped with a total of " + length + " items on your list. They are ");
        for (int i = 0; i < length; i++) {
            System.out.println(groceryList.get(i));
        }
    }
}