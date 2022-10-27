package Class04;

public class Task2WithIfElse {
    public static void main(String[] args) {
/*
 * Create a Java program and name it Temperature Check.
 * Create variable to store temperature. Your program
should check if
 * temperature is below 32 then it should print ,
otherwise .
 */
        double temperature=35;
        if(temperature<32)
        {
            System.out.println("Water will freeze with  temperature "+ temperature);
        }
        else
        {
            System.out.println("Water will NOT freeze with temperature "+ temperature);
        }
    }

}
