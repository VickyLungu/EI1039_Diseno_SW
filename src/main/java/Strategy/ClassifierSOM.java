package Strategy;

public class ClassifierSOM implements Classifier {
    Distance distancia = new EuclideanDist();
    @Override
    public void run() {
        distancia.calcula();
        System.out.println("ClassifierSOM executed");
    }

    public void setDistancia(Distance dist){
        distancia = dist;
    }
}
