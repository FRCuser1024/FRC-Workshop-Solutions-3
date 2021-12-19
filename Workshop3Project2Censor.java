import java.util.Scanner;
import java.util.ArrayList;

public class Workshop3Project2Censor {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        //String[] censored = new String[13];
        String[] censored = {"piston", "flywheel", "performed well", "gearbox", "team", "PID", "prioritizing", "strange", "program", "censor", "254", "bumper", "battery"};
        int num = 13;
        String input = in.nextLine(), output = "";
        int inputLength = input.length();
        input = input + " ";
        int i = 0;
        while (i < inputLength) {
            boolean censor = false;
            for (int j = 0; j < num; j++) {
                if (i + censored[j].length() <= inputLength && censored[j].equals(input.substring(i, i + censored[j].length()))) {
                    output = output + "[REDACTED]";
                    i += censored[j].length();
                    censor = true;
                    break;
                }
            }
            if (!censor) {
                output = output + input.charAt(i);
                i++;
            }
        }
        System.out.println(output);
    }
}