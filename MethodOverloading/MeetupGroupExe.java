class MeetupGroupExe
{
    public static void main(String[] args)
    {
        System.out.println("Using MeetupGroup social app:");
        MeetupGroup.createMeetup("Ram");
        MeetupGroup.createMeetup("Ram,Sita,Shiva","Java Developers Meetup",120);
    }
}