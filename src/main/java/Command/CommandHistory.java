package Command;

import java.util.ArrayList;

public class CommandHistory {
    private ArrayList<Comando> comandos;

    public CommandHistory(){
        comandos = new ArrayList<>();
    }

    public void add(Comando comando) {
        comandos.add(comando);
    }

    public void ejecuta() {
        for (Comando c: comandos) {
            c.ejecuta();
        }
    }
}
