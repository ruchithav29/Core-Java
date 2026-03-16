class WeChat 
{
    static void message(String contact)
	{
        System.out.println("Messaging contact:");
        System.out.println(contact);
    }

    static void message(String contact, int messages, boolean payment)
	{
        System.out.println("Contact: " + contact);
        System.out.println("Messages: " + messages);
        System.out.println("Payment Feature Used: " + payment);
    }
}

