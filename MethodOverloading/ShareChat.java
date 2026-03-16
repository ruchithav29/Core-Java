class ShareChat
{
    static void post(String userName)
    {
        System.out.println("User posting content:");
        System.out.println(userName);
    }

    static void post(String userName, int likes, int comments)
    {
        System.out.println("User Name: " + userName);
        System.out.println("Likes: " + likes);
        System.out.println("Comments: " + comments);
    }
}

