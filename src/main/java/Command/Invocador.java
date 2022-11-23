package Command;

public class Invocador {
    private Comando command;
    private CommandHistory listaComandos;

    public void setCommand(Comando command) {
        listaComandos = new CommandHistory();
        this.command = command;
    }

    public void buttonWasPressed() {
        command.ejecuta();
    }

    public void addCommand(Comando comando) {
        listaComandos.add(comando);
    }

    public void go() {
        listaComandos.ejecuta();
    }
}
