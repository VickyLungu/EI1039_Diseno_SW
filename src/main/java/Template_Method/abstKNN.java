package Template_Method;

public abstract class abstKNN {

    public void run(){
        leerDatos();
        calculaDist();
        ordenarCerc();
        clasificar();
        devolver();
    }

    public void leerDatos() {
        System.out.println("Leyendo datos");
    }

    public void calculaDist() {
        System.out.println("Calculando distancias");
    }

    public void ordenarCerc() {
        System.out.println("Ordenando por cercanía");
    }

    public void clasificar() {
        System.out.println("Clasificando el dato");
    }

    public void devolver() {
        System.out.println("Devolver genérico");
    }
}