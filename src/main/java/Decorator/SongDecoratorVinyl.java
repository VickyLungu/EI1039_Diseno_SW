package Decorator;

public class SongDecoratorVinyl extends SongDecorator{
    private String reproductor;

    public SongDecoratorVinyl(Component c) {
        super(c);
        reproductor = "vinyl";
    }

    public void reproduciendo(){
        System.out.println("ON " + reproductor);
    }
}
