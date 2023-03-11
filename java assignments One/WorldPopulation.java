public class WorldPopulation{

    public static void main(String[] args){

        double currentWorldPopulation = 7942645086L;
        double annualGrowthRate = 0.98 / 100;

        double estimatedWorldPopulationYear1  = (currentWorldPopulation * (1 + annualGrowthRate));
        double estimatedWorldPopulationYear2  = (estimatedWorldPopulationYear1 * (1 + annualGrowthRate));
        double estimatedWorldPopulationYear3  = (estimatedWorldPopulationYear2 * (1 + annualGrowthRate));
        double estimatedWorldPopulationYear4  = (estimatedWorldPopulationYear3 * (1 + annualGrowthRate));
        double estimatedWorldPopulationYear5  = (estimatedWorldPopulationYear4 * (1 + annualGrowthRate));

        System.out.println("Estimated world population after 1 Year: " + estimatedWorldPopulationYear1); 
        System.out.println("Estimated world population after 2 Year: " + estimatedWorldPopulationYear2);
        System.out.println("Estimated world population after 3 Year: " + estimatedWorldPopulationYear3);
        System.out.println("Estimated world population after 4 Year: " + estimatedWorldPopulationYear4);
        System.out.println("Estimated world population after 5 Year: " + estimatedWorldPopulationYear5);



        }



}
