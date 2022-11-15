package Strategy;

public class DemoStrategy2 {
    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance---");
        Context2 context = new Context2(new ClassifierKnn());
        context.setDistancia(new EuclideanDist());
        context.run();


        System.out.println("--- KNN with Manhattan distance---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.setDistancia(new ManhattanDist());
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.setDistancia(new ManhattanDist());
        context.run();

        System.out.println("--- SOM with Euclidean distance---");
        context.setClassifierStrategy(new ClassifierSOM());
        context.setDistancia(new EuclideanDist());
        context.run();
    }
}
