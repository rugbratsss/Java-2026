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
        String[] platform        = {"Coursera", "Udemy", "UnisaOnline", "Skillshare", "MindTheGap", "GetSmarter"};
        String[] originCountries = {"USA", "SA", "USA", "ENG", "SA", "SA"};

        int[] users   = new int[platform.length];
        int[] ratings = new int[platform.length];

        populateUsers(users);
        populateRatings(ratings, platform);

        int mostUsedPlat = mostUsedPlatforms(users);
        System.out.println("\nMost used platform: " + platform[mostUsedPlat]
                         + " (" + users[mostUsedPlat] + " users)\n");

        sortPlatforms(platform, originCountries, ratings, users);

        displayPlatforms(platform, originCountries, ratings, users); // BUG 8 FIX: was never called
    }
}