class MeetupGroup
{
    static void createMeetup(String user)
    {
        System.out.println("Creating meetup:");
        System.out.println(user);
    }

    static void createMeetup(String user,String topic,int members)
    {
        System.out.println("User: " + user);
        System.out.println("Topic: " + topic);
        System.out.println("Members: " + members);
    }
}