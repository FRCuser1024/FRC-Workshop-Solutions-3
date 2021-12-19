import java.util.Scanner;
import java.util.HashMap;

public class Workshop3Project3Login {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        //String[] censored = new String[13];
        HashMap<String, String> accounts = new HashMap<>();
        boolean stop = false, loggedIn = false;
        while (!stop) {
            System.out.println("What would you like to do?\n\tCreate Account\n\tLogin\n\tExit");
            String option = in.nextLine(), username, password;
            switch (option) {
                case "Create Account":
                    while (true) {
                        System.out.println("Please type a username: ");
                        username = in.nextLine();
                        if (!accounts.containsKey(username)) break;
                        System.out.println("That username is taken. ");
                    }
                    System.out.println("Great job! Now type a password: ");
                    password = in.nextLine();
                    accounts.put(username, password);
                    System.out.println("You created an account! Congratulations! ");
                    break;
                case "Login":
                    while (true) {
                        System.out.println("Please type a username: ");
                        username = in.nextLine();
                        if (accounts.containsKey(username)) break;
                        System.out.println("That username is not valid. ");
                    }
                    loggedIn = false;
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Please type the password: ");
                        password = in.nextLine();
                        if (accounts.get(username).equals(password)) {
                            loggedIn = true;
                            break;
                        }
                        System.out.println("The username and password do not match. ");
                    }
                    if (loggedIn) System.out.println("You are now logged in! Success! And you are now logged out. ");
                    break;
                case "Exit":
                    stop = true;
                    System.out.println("You have successfully exited. ");
                    break;
                case default:
                    System.out.println("Please type one of the valid options. ");
            }
        }
    }
}