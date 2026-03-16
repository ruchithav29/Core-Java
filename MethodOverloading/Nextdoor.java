class Nextdoor
{
    static void postNeighbourUpdate(String user)
    {
        System.out.println("Neighbour update by:");
        System.out.println(user);
    }

    static void postNeighbourUpdate(String user, int replies, int views)
    {
        System.out.println("User: " + user);
        System.out.println("Replies: " + replies);
        System.out.println("Views: " + views);
    }
}

