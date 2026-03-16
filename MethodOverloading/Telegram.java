class Telegram
{
    static void sendMessage(String user)
    {
        System.out.println("Sending message:");
        System.out.println(user);
    }

    static void sendMessage(String user,int messages,int groups)
    {
        System.out.println("User: " + user);
        System.out.println("Messages: " + messages);
        System.out.println("Groups: " + groups);
    }
}

