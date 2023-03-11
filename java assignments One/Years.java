import java.util.Scanner;
public class Years{

    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

         System.out.println("Enter time in Minutes: " );
         int minutes = input.nextInt(); 
     
         int years = minutes/525600;
      
         int remainder = minutes % 525600;
       
         int days = remainder/1440;
        
         System.out.println(minutes + " minutes is approximately " + years + "    years and " + days + " days");
    
        
    }



}
