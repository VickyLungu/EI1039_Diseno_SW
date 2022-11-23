package Command;

public class TurnLeft implements Comando{
    BeeBot bot;

    public TurnLeft(BeeBot bot){
        this.bot = bot;
    }
    @Override
    public void ejecuta() {
        bot.turnLeft();
    }
}
