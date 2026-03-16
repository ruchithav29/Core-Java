class Skype 
{
    static void call(String contact)
	{
        System.out.println("Calling contact:");
        System.out.println(contact);
    }

    static void call(String contact, int duration, boolean video)
	{
        System.out.println("Contact: " + contact);
        System.out.println("Call Duration: " + duration);
        System.out.println("Video Enabled: " + video);
    }
}

