class Plurk
{
    static void postPlurk(String user)
    {
        System.out.println("Posting plurk:");
        System.out.println(user);
    }

    static void postPlurk(String user,int responses,int likes)
    {
        System.out.println("User: " + user);
        System.out.println("Responses: " + responses);
        System.out.println("Likes: " + likes);
    }
}

