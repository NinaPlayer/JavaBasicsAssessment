package Assessment6;
//Create a method that receives an integer argument from 0-100 and returns your test grade in a String format
/**
 * Created by NFP01 on 5/7/2017.
 */
public class TestGrade {
    public static void main(String[]args){
        int grade = 65;

        if(grade >= 89){
            System.out.println("Your score of " + grade + " got you an A");

        }
            else if(grade >= 79 && grade <=88) {
            System.out.println("Your score of " + grade + " got you a B");
        }
                else if(grade >= 68 && grade <+78){
            System.out.println("Your score of " + grade + " got you a C");
            }
                else if(grade <=67){

                System.out.println("You rock!");
            }
        }
    }

