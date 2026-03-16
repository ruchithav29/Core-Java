class Triller
{
    static void recordVideo(String user)
    {
        System.out.println("Recording video by:");
        System.out.println(user);
    }

    static void recordVideo(String user, int views, int followers)
    {
        System.out.println("User: " + user);
        System.out.println("Views: " + views);
        System.out.println("Followers: " + followers);
    }
}

