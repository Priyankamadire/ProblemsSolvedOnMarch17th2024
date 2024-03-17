
/*
 * find unique 
 * i/o
 * [2,1,2,5,6,5,7,7,6]
 * out 1
 * as it is unique
 */
import java.util.*;

public class BitWiseXor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(solve(arr));
    }

    public static int solve(int arr[]){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}