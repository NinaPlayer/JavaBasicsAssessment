package Assessment8;
import javax.management.monitor.StringMonitorMBean;
import java.util.Arrays;
import java.util.*;

//Create a method that replaces all vowels inside an array with a character
/**
 * Created by NFP01 on 5/7/2017.
 */
public class ReplaceVowels {

    public static void main(String[] args) {

        String statement = "The quick brown fox.";
        int n = 0;
        char c;
        String newStatement;
        newStatement = "";

        for (int i = 0, l = statement.length(); i < l; i++) {
            c = statement.charAt(i);
            if (c == 'a') {
                n = n + 1;
                newStatement = newStatement + '2';
            }
            //else newStatement = newStatement + c;

            else if (c == 'e') {
                n = n + 1;
                newStatement = newStatement + '2';
            }
            //else newStatement = newStatement + c;

            else if (c == 'i') {
                n = n + 1;
                newStatement = newStatement + '2';
            }
            //else newStatement = newStatement + c;

            else if (c == 'o') {
                n = n + 1;
                newStatement = newStatement + '2';
            }
            //else newStatement = newStatement + c;

            else if (c == 'u') {
                n = n + 1;
                newStatement = newStatement + '2';
            }
            else newStatement = newStatement + c;
            }

        System.out.println("After updating the vowels " + n + " replacements were made");

        System.out.println(newStatement);
    }

}

