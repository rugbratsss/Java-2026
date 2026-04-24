import java.util.Scanner;
import java.util.Random;
public class StreamingServicesApplication {
    public static void populateRatings(int[] userRatings, String[] serviceProviders)
    {
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < userRatings.length; i++)
        {
                System.out.print("Enter user ratings(1-5) for " + serviceProviders[i] + ": ");
                userRatings[i] = kb.nextInt();
                while(userRatings[i] > 1 || userRatings[i] < 5)
                {
                    System.out.print("Invalid input, enter a number from 1 to 5 for " + serviceProviders[i] + ": ");
                    userRatings[i] = kb.nextInt();
                }
              
        }
    }
    public static void populateSubscribers(int[] subscribers)
    {
        Random rand = new Random();

        for(int i = 0; i < subscribers.length; i++)
        {
            subscribers[i] = rand.nextInt(400001) + 100000;
        }
    }
    public static void main(String[] args)
    {
        String[] serviceProviders = {"YouTube", "Netflix","DSTV", "ShowMax", "PrimeTV", "SABC"};
        String[] originCountry = {"United States", "United States", "South Africa", "South Africa", "United States", "South Africa"}; 

        int[] subscribers = new int [serviceProviders.length];
        int[] userRatings = new int [serviceProviders.length];

        populateSubscribers(subscribers);
        populateRatings(userRatings,serviceProviders);
    }
}
