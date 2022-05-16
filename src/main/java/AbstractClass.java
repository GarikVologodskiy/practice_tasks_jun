public abstract class AbstractClass {

    public AbstractClass() {
        System.out.println("This is an abstract class constructor");
    }

    static class SubClass extends AbstractClass {
        public SubClass() {
            System.out.println("This is a sub class constructor");
        }
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
    }
}
