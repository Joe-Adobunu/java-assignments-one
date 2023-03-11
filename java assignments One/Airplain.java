import java.util.Scanner;
public class Airplain{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter speed");
        double speed = userInput.nextDouble();

        System.out.println("Enter acceleration");
        double a = userInput.nextDouble();

        double lenght = (speed * speed) / (2 * a);

        System.out.println("The minimum runaway lenght for this airplain is " + lenght);


    }


}


    
