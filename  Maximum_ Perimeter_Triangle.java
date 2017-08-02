import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int [] narr = new int [n];
        for (int i = 0 ; i < n ; i++){
            narr[i] = sc.nextInt();
        }
        Arrays.sort(narr);
        int[] arr = new int [n];
        for(int m  = 0 ; m< n ; m++){
            arr[m] = narr[n-1-m];
        }
        int g = 0 ; 
       try{
            int i =0 ;
        while(arr[i] >= arr[i+1]+arr[i+2]){
                i++    ;
        }
        System.out.println(arr[i+2]+" "+arr[i+1]+" "+arr[i]);
           g=1;
        }
        finally {
            if(g==0){
        System.out.println(-1);
            }
        }
        
        
    }
}
