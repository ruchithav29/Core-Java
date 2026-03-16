class Peach
{
    static void postStatus(String user)
    {
        System.out.println("Posting status:");
        System.out.println(user);
    }

    static void postStatus(String user,int likes,int shares)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Shares: " + shares);
    }
}

