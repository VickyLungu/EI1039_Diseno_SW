package Template_Method;

public class algA extends abstKNN{
    @Override
    public void devolver(){
        localizacion();
    }

    private void localizacion(){
        System.out.println("Devuelvo la localización donde se encuentra");
    }
}
