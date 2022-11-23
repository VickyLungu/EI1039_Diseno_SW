package Command;

public class MoveBack implements Comando{
    BeeBot bot;

    public MoveBack(BeeBot bot){
        this.bot = bot;
    }

    @Override
    public void ejecuta() {
        bot.moveBack();
    }
}
