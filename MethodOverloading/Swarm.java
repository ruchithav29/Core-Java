class Swarm
{
    static void shareLocation(String user)
    {
        System.out.println("Sharing location:");
        System.out.println(user);
    }

    static void shareLocation(String user,String place,int friends)
    {
        System.out.println("User: " + user);
        System.out.println("Place: " + place);
        System.out.println("Friends Nearby: " + friends);
    }
}

