package Game;

public class GameStatus {
    public void showNoPenguinToHunt()
    {
        System.out.println("There is no penguin left to hunt for the polar bear. You better be careful!");
    }

    public void showNoPenguinFeeded()
    {
        System.out.println("The zoo caretaker ate the fish himself.");
    }

    public void showWhatDoYouWant(String cmd)
    {
        String msg = "The Zoo caretaker does not understand" + cmd;

        System.out.println(msg);
    }

    public void showStatus()
    {
        int numberOfPenguins = getNumberOfLivingPenguins();

        String penguinMsg = "";

        switch(numberOfPinguins)
        {
            case 3:
                penguinMsg = "Three penguins and a polar bear."; break;
            case 2:
                penguinMsg = "Two penguins and a polar bear."; break;
            case 1:
                penguinMsg = "One penguin and a polar bear."; break;
            case 0:
                penguinMsg = "Just a lonely dead? polar bear."; break;
        }

        System.out.println(penguinMsg);
    }

    public boolean allAnimalsAreAlive()
    {
        boolean allPenguinsAreAlive = getNumberOfLivingPenguins() == 3;
        boolean polarBearIsAlive = this.polarBearEnergy > 0;

        return allPenguinsAreAlive && polarBearIsAlive;
    }

    public boolean areThereAnyDaysLeft()
    {
        return this.numberOfDaysLeft > 0;
    }

    public boolean isGameWon()
    {
        return ! areThereAnyDaysLeft() && allAnimalsAreAlive();
    }

    public boolean isGameOver()
    {
        return !( areThereAnyDaysLeft() || allAnimalsAreAlive());
    }
}
