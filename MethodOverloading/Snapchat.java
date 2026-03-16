class Snapchat
{
    static void sendSnap(String user)
    {
        System.out.println("Sending snap:");
        System.out.println(user);
    }

    static void sendSnap(String user,String friend,int streak)
    {
        System.out.println("User: " + user);
        System.out.println("Friend: " + friend);
        System.out.println("Snap Streak: " + streak);
    }
}

