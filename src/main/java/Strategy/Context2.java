package Strategy;

public class Context2 {
    Classifier strategy;
    Distance distancia;
    public Context2(Classifier classifier) {
        strategy = classifier;
    }

    public void setClassifierStrategy(Classifier classifier) {
        strategy = classifier;
    }

    public void setDistancia(Distance dist){
        strategy.setDistancia(dist);
    }
    public void run() {
        strategy.run();
    }
}
