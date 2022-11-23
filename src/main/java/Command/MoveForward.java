package Command;

public class MoveForward implements Comando{
    BeeBot bot;

    public MoveForward(BeeBot bot){
        this.bot = bot;
    }

    @Override
    public void ejecuta() {
        bot.moveForward();
    }
}
