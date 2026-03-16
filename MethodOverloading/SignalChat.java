class SignalChat
{
    static void secureMessage(String user)
    {
        System.out.println("Sending secure message:");
        System.out.println(user);
    }

    static void secureMessage(String user,int messages,boolean encrypted)
    {
        System.out.println("User: " + user);
        System.out.println("Messages: " + messages);
        System.out.println("Encrypted: " + encrypted);
    }
}

