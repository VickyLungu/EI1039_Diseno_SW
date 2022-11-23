package Command;

public class BeeBotDemo {
    public static void main(String[] args) {
        Invocador invoker = new Invocador();
        BeeBot bot = new BeeBot();

        demo1(invoker, bot);
        demo2(invoker, bot);
    }

    public static void demo1(Invocador invoker, BeeBot bot){
        System.out.println("--------Demo 1--------");
        invoker.setCommand(new MoveForward(bot));
        invoker.buttonWasPressed();
        invoker.setCommand(new TurnLeft(bot));
        invoker.buttonWasPressed();
        invoker.setCommand(new MoveForward(bot));
        invoker.buttonWasPressed();
        invoker.buttonWasPressed();
        invoker.setCommand(new TurnRight(bot));
        invoker.buttonWasPressed();
    }



    public static void demo2(Invocador invoker, BeeBot bot) {
        System.out.println("--------Demo 2--------");
        invoker.addCommand(new MoveForward(bot));
        invoker.addCommand(new TurnLeft(bot));
        invoker.addCommand(new MoveForward(bot));
        invoker.addCommand(new MoveBack(bot));
        invoker.undo();
        invoker.addCommand(new MoveForward(bot));
        invoker.addCommand(new TurnRight(bot));
        invoker.go();
    }
}
