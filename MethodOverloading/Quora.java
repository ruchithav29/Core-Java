class Quora
{
    static void askQuestion(String user)
    {
        System.out.println("User asking question:");
        System.out.println(user);
    }

    static void askQuestion(String user, int answers, int views)
    {
        System.out.println("User: " + user);
        System.out.println("Answers: " + answers);
        System.out.println("Views: " + views);
    }
}

