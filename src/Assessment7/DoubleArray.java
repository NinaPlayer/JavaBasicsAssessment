package Assessment7;
//Create a main method that loops through a double array of integers.  The loop should output the value of the greatest number
/**
 * Created by NFP01 on 5/7/2017.
 */
public class DoubleArray {
    public static void main(String[] args) {

        int[][] temperatures = {{104, 90, 106, 92, 104, 97},
                {98, 96, 100, 100, 99, 93},
                {81, 82, 83, 84, 85, 80},
                {58, 57, 56, 55, 54, 43},
                {32, 48, 107, 88, 95, 30}};

        int greatest = 0;

         {

        }
        for (int row = 0; row < temperatures.length; row++) {
            for (int column = 0; column < temperatures[row].length; column++) {

                //int greatest = temperatures[row][column];

                if (temperatures[row][column] > greatest) {
                    greatest = temperatures[row][column];
                }
            }//print out the greatest temperature
        }
                    System.out.println("Greatest temperature is " + greatest);

                }
            }


