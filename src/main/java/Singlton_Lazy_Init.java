public class Singlton_Lazy_Init {

    private static Singlton_Lazy_Init instance;

    private Singlton_Lazy_Init () {

    }

    public static Singlton_Lazy_Init getInstance() {
        if (instance == null) {
            instance = new Singlton_Lazy_Init();
        }
        return instance;
    }

    public void print () {
        System.out.println ("This is a singleton print method");
    }

    public static void main(String[] args) {
        Singlton_Lazy_Init singlton_lazy_init = new Singlton_Lazy_Init();
        Singlton_Lazy_Init instance = Singlton_Lazy_Init.getInstance();
        System.out.println(instance);
        singlton_lazy_init.print();
        System.out.println(singlton_lazy_init.equals(Singleton.class));
    }
}
