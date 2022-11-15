package Strategy;

public class ClassifierKnn implements Classifier {
    Distance distancia = new EuclideanDist();
    @Override
    public void run() {
        distancia.calcula();
        System.out.println("ClassifierKnn executed");
    }

    public void setDistancia(Distance dist){
        distancia = dist;
    }
}
