
public class Financialapp{

    public static void main(String[] args){



    System.out.println("Enter Balance");
    int balance = userInput.nextInt();

    System.out.println("Enter Annual interest rate");
    int annualInterest = userInput.nextInt();
    
    double interest = (double)balance * (double)(annualInterest/1200);

    System.out.print("the interest is " + interest);


    }



}
