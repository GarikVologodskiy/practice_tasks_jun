public class Print_Strings {
    static void foo() {
        String m = "Hello";
        System.out.println(m);
        bar(m);
        System.out.println(m);
    }

    static void bar(String m) {
        m += " World!";
        System.out.println(m);
    }

    public static void main(String[] args) {
      Print_Strings print_strings = new Print_Strings();
      System.out.println(print_strings.equals(print_strings));
      System.out.println("print_strings = " + print_strings);
      System.out.println(print_strings.getClass());
        System.out.println(print_strings.toString());
      foo();
      bar("Hello");
    }
}