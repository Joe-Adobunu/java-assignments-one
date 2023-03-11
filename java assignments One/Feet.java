import java.util.Scanner;
public class Feet{

    public static void main(String[] args){

    Scanner foot = new Scanner(System.in);
    System.out.println("Enter a value for feet");

    double ft = foot.nextDouble(); 
    double meters = ft * 0.305;

    System.out.println("feet in meters is " + meters);

    


    }


}

