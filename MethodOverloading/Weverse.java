class Weverse
{
    static void fanPost(String fan)
    {
        System.out.println("Fan posting message:");
        System.out.println(fan);
    }

    static void fanPost(String fan, int likes, int comments)
    {
        System.out.println("Fan: " + fan);
        System.out.println("Likes: " + likes);
        System.out.println("Comments: " + comments);
    }
}

