package Assessment12;

/**
 * Created by NFP01 on 5/9/2017.
 */
public class DivideBy {
    public static void main (String[]args){

        int a = 100;
        int b = 50;
        try{
            if (b % a == 0 && a % b == 0 );


        }catch(ArithmeticException e){
           System.out.println("ArithmeticException" + e);
        }
    }

}
