class Steemit
{
	static void createPost(String user)
	{
		System.out.println("Creating blog post:");
		System.out.println(user);
	}

	static void createPost(String user,int upvotes,int rewards)
	{
		System.out.println("User: " + user);
		System.out.println("Upvotes: " + upvotes);
		System.out.println("Rewards: " + rewards);
	}
}

