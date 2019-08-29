package Game;

public class Game extends Main {


    public static void main() {

//        Helper helper = new Helper();

        WelcomeAndClosing welcomeAndClosing = new WelcomeAndClosing();
        Animal animal = new Animal();
        animal.MakeAnimals();
        welcomeAndClosing.showWelcome();



    public void feedPolarBear(int energy)
    {
        this.polarBearEnergy += energy;
        System.out.println("Polar bear snatches a fish.");
    }

    public void feedPolarBear()
    {
        int fish = 50;

        this.polarBearEnergy += fish;
    }

    public void feedPenguinOne(int energy)
    {
        this.penguinOneEngergy += energy;
        System.out.println("Penguin 1 snatches a fish.");
    }
    public void feedPenguin()
    {
        int fish = 50;

        int penguinNumber = GetNumber(1, 3);

        switch(penguinNumber)
        {
            case 1:
                if(isPenguinOneAlive() ) feedPenguinOne(fish); break;

            case 2:
                if (isPenguinTwoAlive()) feedPenguinTwo(fish); break;

            case 3:
                if (isPenguinThreeAlive()) feedPenguinThree(fish); break;

            default: ShowNoPenguinFeeded(); break;
        }
    }
    public void dayChange()
    {
        this.numberOfDaysLeft -= 1;

        if(isGameWon())
        {
            showFullScreen();
            return;
        }

        if(isGameOver())
        {
            System.out.println("You loose!! Try again.");
            return;
        }

        int penguinEnergyUsedForADay = 30;
        int polarBearEgnergyUsedForADay = 300;


        this.penguinOneEngergy -= penguinEnergyUsedForADay;
        this.penguinTwoEngergy -= penguinEnergyUsedForADay;
        this.penguinThreeEngergy -= penguinEnergyUsedForADay;

        this.polarBearEnergy -= polarBearEngergyUsedForADay;


        if (isPolarBearStarving()) polarBearHunts();

        System.out.println(" *** A new day is comming. ***");
    }


    dayChange

}

