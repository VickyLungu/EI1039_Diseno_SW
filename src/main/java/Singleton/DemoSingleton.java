package Singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        long t1 = System.currentTimeMillis();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        long t2 = System.currentTimeMillis();
        System.out.println("t2-t1 = " + (t2-t1));
        long t3 = System.currentTimeMillis();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);
        long t4 = System.currentTimeMillis();
        System.out.println("t4-t3 = " + (t4-t3));
    }
}
