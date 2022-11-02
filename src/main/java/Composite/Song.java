package Composite;

public class Song implements Component {
    private String cancion;
    private String cantante;
    public Song(String cancion, String cantante) {
        this.cancion = cancion;
        this.cantante = cantante;
    }

    @Override
    public void play() {
        System.out.println("Escuchando... "+ cancion + " BY " + cantante);
    }
}
