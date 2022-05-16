public class Variable_x {
    static void bar() {
        int[] numbs = {3, 2, 3};
        int x; //created outside the cycle
        for (x = 0; x < numbs.length; x++) {
            x += numbs[x];
        }
        System.out.println(x);
    }
}
