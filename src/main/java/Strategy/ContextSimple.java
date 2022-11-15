package Strategy;

public class ContextSimple {
    Classifier strategy;
    public ContextSimple(Classifier classifier) {
        strategy = classifier;
    }

    public void setClassifierStrategy(Classifier classifier) {
        strategy = classifier;
    }

    public void run() {
        strategy.run();
    }
}
