class Meetup
{
    static void createEvent(String organizer)
    {
        System.out.println("Creating event:");
        System.out.println(organizer);
    }

    static void createEvent(String organizer, int attendees, String location)
    {
        System.out.println("Organizer: " + organizer);
        System.out.println("Attendees: " + attendees);
        System.out.println("Location: " + location);
    }
}

