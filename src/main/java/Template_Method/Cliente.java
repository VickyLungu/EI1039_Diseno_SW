package Template_Method;

public class Cliente {
    public static void main(String[] args) {
        abstKNN miKNN = new algA();
        miKNN.run();

        System.out.println("Cambiamos a algB");

        miKNN = new algB();
        miKNN.run();
    }
}
