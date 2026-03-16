class Substack
{
    static void publishNewsletter(String writer)
    {
        System.out.println("Publishing newsletter:");
        System.out.println(writer);
    }

    static void publishNewsletter(String writer, int subscribers, int comments)
    {
        System.out.println("Writer: " + writer);
        System.out.println("Subscribers: " + subscribers);
        System.out.println("Comments: " + comments);
    }
}

