package Decorator;

public class SongDecoratorMP4 extends SongDecorator{
    private String reproductor;

    public SongDecoratorMP4(Song c) {
        super(c);
        reproductor = "MP4";
    }

    public void reproduciendo(){
        System.out.println("ON " + reproductor);
    }
}
