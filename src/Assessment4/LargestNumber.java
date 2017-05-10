package Assessment4;
//Create a method that returns back the largest number in an array of int
/**
 * Created by NFP01 on 5/7/2017.
 */
public class LargestNumber {
    public static void main(String[] args){

    int [] numbers = {19,16,0,63,53};
    int largest = numbers[0];

        for(int i = 1; i <numbers.length; i++){

        if (numbers[i] > largest) {
            largest = numbers[i];

        }
    }

     System.out.println("The largest number in the array is " +largest);

        }
}

