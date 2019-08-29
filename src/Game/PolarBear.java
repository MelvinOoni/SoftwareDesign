package Game;

public class PolarBear extends Animal {
    private int polarBearEnergy;
    private int polarBearStarvationEngergyThreshold = 150;

    public boolean IsPolarBearAlive()
    {
        return this.polarBearEnergy > 0;
    }
    public static void Say(String msg)
    {
        System.out.println("msg");
    }

    public void FeedPolarBear(int energy)
    {
        this.polarBearEnergy += energy;
        Say("Polar bear snatches a fish.");
    }
}
