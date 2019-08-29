package Game;

public class Game extends Main
{
    public static void main() {

//        Helper helper = new Helper();

        WelcomeAndClosing welcomeAndClosing = new WelcomeAndClosing();
        Animal animal = new Animal();
        animal.MakeAnimals();
        welcomeAndClosing.showWelcome();


    }

}