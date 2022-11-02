package Composite;

import java.util.ArrayList;

public class PlayList implements Component{
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
                System.out.println("-----" + nombre +"-----");
                component.play();
            }
        }else{
            System.out.println("Playlist "+nombre+ " vacía");
        }
    }

    public void add(Component c){
        lista.add(c);
    }
}
