class TruthSocial
{
    static void postTruth(String user)
    {
        System.out.println("Posting truth:");
        System.out.println(user);
    }

    static void postTruth(String user,int likes,int reposts)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Reposts: " + reposts);
    }
}

