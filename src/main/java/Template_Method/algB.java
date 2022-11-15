package Template_Method;

public class algB extends abstKNN{
    @Override
    public void devolver(){
        esSpam();
    }

    private void esSpam(){
        System.out.println("Digo si el correo es Spam o no.");
    }
}
