package Command;

public class TurnRight implements Comando{
    BeeBot bot;

    public TurnRight(BeeBot bot){
        this.bot = bot;
    }

    @Override
    public void ejecuta() {
        bot.turnRight();
    }
}
