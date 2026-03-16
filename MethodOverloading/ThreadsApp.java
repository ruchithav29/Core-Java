class ThreadsApp
{
    static void postThread(String user)
    {
        System.out.println("Posting thread:");
        System.out.println(user);
    }

    static void postThread(String user,int likes,int replies)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Replies: " + replies);
    }
}

