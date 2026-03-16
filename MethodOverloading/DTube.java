class DTube
{
	static void uploadVideo(String user)
	{
		System.out.println("Uploading video:");
		System.out.println(user);
	}

	static void uploadVideo(String user,int views,int likes)
	{
		System.out.println("User: " + user);
		System.out.println("Views: " + views);
		System.out.println("Likes: " + likes);
	}
}

