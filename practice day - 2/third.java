// 10. In a town, the percentage of men is 52. The percentage of total literacy is 48.
//  If total percentage of literate men is 35 of the total population, 
// write a program to find the total number of illiterate men and women if the population of the town is 80,000.


public class third {
    public static void main(String[] args) {
        double population= 80000;

        double men_population = population*(52.0/100);
        double women_population = population - men_population;
        double literate_men = population*(35.0/100);
        double literate_women = population*((48.0-35.0)/100);
        double illiterate_men=men_population-literate_men;
        double illiterate_women = women_population - literate_women;

        System.out.println("Total iliterate men: "+illiterate_men);
        System.out.println("Total iliterate women: "+illiterate_women);
    }
    
}
