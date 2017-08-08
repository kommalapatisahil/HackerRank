import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int nn = sc.nextInt();
        for (int g =0 ; g<nn ; g++){
            int n =sc.nextInt();
            int k = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for(int i = 0 ; i< n ; i++) {
               A[i] = sc.nextInt();
                } 
            for(int i = 0 ; i< n ; i++) {
               B[i] = sc.nextInt();
                }
            Arrays.sort(A);
            Arrays.sort(B);
            int[] AA = new int [n]; 
            for(int j=0 ; j < n; j++){
                AA[j] = A[n-j-1];
            }
            int y = 0;
            for (int h =0 ; h< n ; h++){
                if (AA[h] + B[h] < k)
                { 
                    y = 0 ;
                    System.out.println("NO");
                    break;
                }
                else {y++;}
            }
            if(y==n){System.out.println("YES");}
            }
    }
}
