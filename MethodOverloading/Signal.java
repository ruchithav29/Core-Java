class Signal 
{
    static void secureChat(String friend)
	{
        System.out.println("Secure chatting with:");
        System.out.println(friend);
    }

    static void secureChat(String friend, int messages, boolean encrypted)
	{
        System.out.println("Friend: " + friend);
        System.out.println("Messages Sent: " + messages);
        System.out.println("Encryption Enabled: " + encrypted);
    }
}

