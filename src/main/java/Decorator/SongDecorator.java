package Decorator;


public class SongDecorator implements Component{
    protected Component songDecorated;
    private String reproductor;

    public SongDecorator(Component c){
        this.songDecorated = c;
    }

    @Override
    public void play() {
        System.out.println("Escuchando... "+ getName() + " BY "); //getAutor());
        reproduciendo();
    }


    public void reproduciendo(){
        System.out.println("ON " + reproductor);
    }

    @Override
    public String getName() {
        return songDecorated.getName();
    }
}
