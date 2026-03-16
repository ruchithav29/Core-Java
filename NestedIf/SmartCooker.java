class SmartCooker
{
    static int maxBrightness = 8;
    static int minBrightness = 3;
    static int currentBrightness = 4;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The smartwatch power is On");
        }
        else
        {
            System.out.println("The smartwatch power is Off");
        }
    }

    static void increaseBrightness()
    {
        if(powerOn)
        {
            if(currentBrightness < maxBrightness)
            {
                currentBrightness++;
                System.out.println("Brightness increased: " + currentBrightness);
            }
            else
            {
                System.out.println("Reached maximum brightness");
            }
        }
        else
        {
            System.out.println("The smartwatch is Off");
        }
    }

    static void decreaseBrightness()
    {
        if(powerOn)
        {
            if(currentBrightness > minBrightness)
            {
                currentBrightness--;
                System.out.println("Brightness decreased: " + currentBrightness);
            }
            else
            {
                System.out.println("Reached minimum brightness");
            }
        }
        else
        {
            System.out.println("The smartwatch is Off");
        }
    }
}

