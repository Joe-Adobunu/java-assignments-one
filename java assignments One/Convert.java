import java.util.Scanner;
public class Convert{

    public static void main(String[] args){

        Scanner con = new Scanner(System.in);
        System.out.println("Enter a number in pounds");

        double pounds = con.nextDouble(); 

        double kg = pounds * 0.454;

        System.out.println(pounds + " pounds to kilogram is " + kg);

           
    }


}

        
          
    
