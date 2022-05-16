public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("This is a singleton print method");
    }
}
    class TestSinglton {
        public static void main(String[] args) {
            Singleton instance = Singleton.getInstance();
            System.out.println(Singleton.class);
            System.out.println(Singleton.getInstance());
            instance.print();
        }
    }