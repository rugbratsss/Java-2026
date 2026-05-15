import java.util.Scanner;
import java.util.Random;

public class SkontiriEduTrack
{
    public static void displayPlatforms(String[] platform, String[] originCountries, int[] ratings, int[] users)
    {
        for (int i = 0; i < users.length; i++)
        {
            System.out.println("Platform: " + platform[i]);
            System.out.println("Country: " + originCountries[i]);
            System.out.println("Rating: " + ratings[i]);
            System.out.println("Users: " + users[i]);
            System.out.println();
        }
    }

    public static void sortPlatforms(String[] platform, String[] originCountries, int[] ratings, int[] users)
    {
        for (int i = 0; i < platform.length - 1; i++)
        {
            for (int x = 0; x < platform.length - i - 1; x++) 
            {
                if (platform[x].compareTo(platform[x + 1]) > 0)
                {
                    String tempPlatform = platform[x];
                    platform[x] = platform[x + 1];
                    platform[x + 1] = tempPlatform;

                    String tempCountry = originCountries[x];
                    originCountries[x] = originCountries[x + 1];
                    originCountries[x + 1] = tempCountry;

                    int tempRate = ratings[x];
                    ratings[x] = ratings[x + 1];
                    ratings[x + 1] = tempRate;

                    int tempUsers = users[x];
                    users[x] = users[x + 1];
                    users[x + 1] = tempUsers;
                }
            }
        }
    }
public static int mostUsedPlatforms(int[] users)
    {
        int indexOfMostUsed = 0;
        int highestUser = users[0];
        for (int i = 1; i < users.length; i++)
        {
            if (users[i] > highestUser)
            {
                highestUser = users[i];
                indexOfMostUsed = i;
            }
        }
        return indexOfMostUsed;
    }
public static void populateRatings(int[] ratings, String[] platform)
    {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < ratings.length; i++)
        {
            System.out.print("Enter the user rating (1 - 5) for " + platform[i] + ": ");
            ratings[i] = kb.nextInt();
        }
    }
public static void populateUsers(int[] users)
    {
        Random rand = new Random();
        for (int i = 0; i < users.length; i++)
        {
            users[i] = rand.nextInt((500000 - 100000) + 1) + 100000;
        }
    }
public static void main(String[] args)
    {
        String[] platform  = {"Coursera", "Udemy", "UnisaOnline", "Skillshare", "MindTheGap", "GetSmarter"};
        String[] originCountries = {"USA", "SA", "USA", "ENG", "SA", "SA"};

        int[] users   = new int[platform.length];
        int[] ratings = new int[platform.length];

        populateUsers(users);
        populateRatings(ratings, platform);

        int mostUsedPlat = mostUsedPlatforms(users);
        System.out.println("\nMost used platform: " + platform[mostUsedPlat]
                         + " (" + users[mostUsedPlat] + " users)\n");

        sortPlatforms(platform, originCountries, ratings, users);

        displayPlatforms(platform, originCountries, ratings, users);
    }
}
