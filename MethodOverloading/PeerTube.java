class PeerTube
{
	static void streamVideo(String user)
	{
		System.out.println("Streaming video:");
		System.out.println(user);
	}

	static void streamVideo(String user,int viewers,int comments)
	{
		System.out.println("User: " + user);
		System.out.println("Viewers: " + viewers);
		System.out.println("Comments: " + comments);
	}
}

