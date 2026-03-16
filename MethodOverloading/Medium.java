class Medium
{
    static void publishArticle(String author)
    {
        System.out.println("Publishing article by:");
        System.out.println(author);
    }

    static void publishArticle(String author, int claps, int reads)
    {
        System.out.println("Author: " + author);
        System.out.println("Claps: " + claps);
        System.out.println("Reads: " + reads);
    }
}

