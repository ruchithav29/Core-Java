class VacuumCleanerExecutor
{
    public static void main(String[] args)
    {
        VacuumCleaner.powerOn(true);
        VacuumCleaner.increasePower();
        VacuumCleaner.increasePower();
        VacuumCleaner.decreasePower();
    }
}