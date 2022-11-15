package Strategy;

public class ClassifierKmeans implements Classifier {
    Distance distancia = new EuclideanDist();
    @Override
    public void run() {
        distancia.calcula();
        System.out.println("ClassifierKmneas executed");
    }

    public void setDistancia(Distance dist){
        distancia = dist;
    }
}
