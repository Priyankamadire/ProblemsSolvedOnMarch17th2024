
/*swap to numbers 
 * input 
 * a=5
 * b=7
 * output
 * a=7
 * b=5
 */
import java.util.*;

public class SwapNumBitWise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a " + a + " b " + b);
        System.out.println("After Updating");
        swap(a, b);

    }

    public static void swap(int a, int b) {
        /*
         * logic is
         * a=a^b
         * maan
         * a=5^7 presently
         * b=a^b
         * b=5^7^7 remains b=5
         * again a=a^b
         * a=5^7^5 become a = 7
         * so values of and b updated
         * a=7 b=5
         */
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a " + a + " b " + b);
    }
}