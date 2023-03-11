import java.util.Scanner;
public class Bodymassindex{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your  weight in Pounds");
        double pounds = userInput.nextDouble();


        System.out.println("Enter your Height in Inches");
        double inches = userInput.nextDouble();

        double kilogram = pounds * 0.45359237;
        System.out.println("Weight in kilogram is" + kilogram);

        double meter = (inches * 0.0254) * (inches * 0.0254);
        System.out.println("the height in meter is" + meter);

        double bmi = kilogram / meter;
        System.out.println("the BMI is" + bmi);


        

      }




}
