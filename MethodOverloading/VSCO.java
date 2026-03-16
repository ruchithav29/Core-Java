class VSCO
{
    static void uploadPhoto(String user)
    {
        System.out.println("Uploading photo by:");
        System.out.println(user);
    }

    static void uploadPhoto(String user,int likes,int comments)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Comments: " + comments);
    }
}

