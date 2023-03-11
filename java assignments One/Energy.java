import java.util.Scanner;
public class Energy{

    public static void main(String[] args){

        Scanner kg = new Scanner(System.in);

        System.out.println("Enter the amount of water in kg");
        double water = kg.nextDouble();

        System.out.println("Enter the initial temperature");
        double initialTemperature = kg.nextDouble();

        System.out.println("Enter the final temperature");
        double finalTemperature = kg.nextDouble();

        double energy = water * (finalTemperature - initialTemperature) * 4184;
        System.out.println("the energy needed is " +energy);



        

        
        

        




















    }

}

        
