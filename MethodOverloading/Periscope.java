class Periscope
{
    static void startLive(String host)
    {
        System.out.println("Starting live stream:");
        System.out.println(host);
    }

    static void startLive(String host,int viewers,int hearts)
    {
        System.out.println("Host: " + host);
        System.out.println("Viewers: " + viewers);
        System.out.println("Hearts: " + hearts);
    }
}

