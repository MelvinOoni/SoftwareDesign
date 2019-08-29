package Game;


public class Helper {

//    public static void Say(String msg)
//    {
//        System.out.println(msg);
//    }

//    public int GetNumber(int from, int to)
//    {
////        return java.util.Random(from, to + 1);
//    }

    while(true && areThereAnyDaysLeft())
    {
        String cmd = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        switch (cmd)
        {
            // close command
            case "close": case "quit": case "exit":
            zoo.CloseApp();
            break;

            // feed penguin command
            case "feed penguin":
                zoo.FeedPenguin();
                break;

            // feed penguin command
            case "feed polar bear":
                zoo.FeedPolarBear();
                break;

            // help command
            case "help": case "?":
            zoo.ShowInstructions();
            break;

            // new day command
            case "new day":
                zoo.DayChange();
                zoo.ShowStatus();
                break;

            // unknown command
            default:
                zoo.ShowWhatDoYouWant(cmd);
                break;

        }
    }
}

