class Tumblr
{
    static void postBlog(String user)
    {
        System.out.println("Posting blog by:");
        System.out.println(user);
    }

    static void postBlog(String user, int likes, int reblogs)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Reblogs: " + reblogs);
    }
}

