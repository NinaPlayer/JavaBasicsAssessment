package Assessment10;

/**
 * Created by NFP01 on 5/8/2017.
 */
public interface Bedtime
{

    //abstract method
    void alarmSet(int hour, int minute);

    //default method
    default void BedtimeInterface() {
        System.out.println("This is Bedtime Interface");
    }
    //static method
    static void returnBedtimeInterface() {
        System.out.println("Bedtime is 10:30 p.m.");
        }
    }

