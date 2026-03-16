class Strava
{
    static void recordRun(String athlete)
    {
        System.out.println("Recording run:");
        System.out.println(athlete);
    }

    static void recordRun(String athlete,int distance,int calories)
    {
        System.out.println("Athlete: " + athlete);
        System.out.println("Distance: " + distance);
        System.out.println("Calories: " + calories);
    }
}

