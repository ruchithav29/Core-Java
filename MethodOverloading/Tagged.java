class Tagged
{
    static void tagFriend(String user)
    {
        System.out.println("Tagging friend:");
        System.out.println(user);
    }

    static void tagFriend(String user,String friend,int posts)
    {
        System.out.println("User: " + user);
        System.out.println("Friend: " + friend);
        System.out.println("Posts: " + posts);
    }
}

