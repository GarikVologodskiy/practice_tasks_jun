public class Variable_x {
    static void bar() {
        int[] nums = {1, 2, 3};
        int x; //created outside the cycle
        for (x = 0; x < nums.length; x++) {
            x += nums[x];
        }
        System.out.println(x);
    }
}
