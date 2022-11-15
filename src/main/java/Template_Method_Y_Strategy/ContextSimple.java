package Template_Method_Y_Strategy;

public class ContextSimple {
    Classifier strategy;
    public ContextSimple(Classifier classifier) {
        strategy = classifier;
    }

    public void setClassifierStrategy(Classifier classifier) {
        strategy = classifier;
    }

    public void run() {
    }
}
