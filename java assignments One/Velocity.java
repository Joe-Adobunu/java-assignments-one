import java.util.Scanner;
public class Physics{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Starting Velocity");

        double startingVelocity = userInput.nextDouble();
        
        System.out.println("Enter Ending Velocity");

        double endingVelocity = userInput.nextDouble();

        System.out.println("Enter Time Span");

        double timeSpan = userInput.nextDouble();

        double averageAcceleration = (startingVelocity - endingVelocity) / timeSpan;

    
        System.out.println("The average acceleration is " + averageAcceleration);

    }


}


    
    
    

    

    
