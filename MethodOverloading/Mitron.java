class Mitron
{
    static void uploadShort(String user)
    {
        System.out.println("Uploading short video by:");
        System.out.println(user);
    }

    static void uploadShort(String user, int views, int likes)
    {
        System.out.println("User: " + user);
        System.out.println("Views: " + views);
        System.out.println("Likes: " + likes);
    }
}

