
/*
 * find num is even or odd
 * any odd numbers binayu form last digit will bw 1 that is 2^0
 * if we add binary 1 to it it resulths to 1 as 1+1=1 carry 1 in binary form
 * 12 binary 1100
 *             +1
 *            1100  //last digit wont change
 * 13 binary from 1101
 *                  +1
 *                1101 //last bit is onne 
 */
import java.util.*;

public class FindEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);

    }

    public static void solve(int n) {
        if ((n & 1) == 0) {
            System.out.print("Even");
        } else {
            System.out.print("ODD");
        }
    }
}