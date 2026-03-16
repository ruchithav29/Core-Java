class Reddit
{
    static void postThread(String user)
    {
        System.out.println("Posting thread:");
        System.out.println(user);
    }

    static void postThread(String user,String subreddit,int upvotes)
    {
        System.out.println("User: " + user);
        System.out.println("Subreddit: " + subreddit);
        System.out.println("Upvotes: " + upvotes);
    }
}

