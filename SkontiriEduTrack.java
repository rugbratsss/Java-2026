
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