class Viber
{
	static void Chats(String friendsname)
	{
		System.out.println("Chating with friend :");
		System.out.println(friendsname);
	}
	static void Chats(String friendsname,int messages,int unreadMessages)
	{
		System.out.println("Reading messages and unreadMessages of friends :");
		System.out.println(friendsname);
		System.out.println(messages);
		System.out.println(unreadMessages);
	}
}