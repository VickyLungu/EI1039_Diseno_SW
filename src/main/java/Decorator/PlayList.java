package Decorator;

import java.util.ArrayList;

public class PlayList implements Component {
    private String nombre;
    private ArrayList<Component> lista;
    public PlayList(String nombre) {
        this.nombre = nombre;
        lista = new ArrayList<>();
    }

    @Override
    public void play() {
        if (lista.size() > 0){
            for (Component component : lista) {
                System.out.println("-----" + getName() +"-----");
                component.play();
            }
        }else{
            System.out.println("Playlist " + getName() + " vacía");
        }
    }

    @Override
    public String getName() {
        return nombre;
    }

    public void add(Component c){
        lista.add(c);
    }

    public void remove(Component c){
        lista.remove(c);
    }
}
