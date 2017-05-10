package Assessment5;
//return a random number from 1 - 100
/**
 * Created by NFP01 on 5/5/2017.
 */
import java.util.Random;
class RandomNumber {

    public static void main(String[] args){
    Random oneHundred = new Random();
    int number;

    for(int counter =1; counter <=100; counter++){
    number = oneHundred.nextInt(100);
    System.out.println(number + " ");

        }
    }
}
