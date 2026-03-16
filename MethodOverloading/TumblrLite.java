class TumblrLite
{
    static void writeBlog(String user)
    {
        System.out.println("Writing blog:");
        System.out.println(user);
    }

    static void writeBlog(String user,int views,int comments)
    {
        System.out.println("User: " + user);
        System.out.println("Views: " + views);
        System.out.println("Comments: " + comments);
    }
}

