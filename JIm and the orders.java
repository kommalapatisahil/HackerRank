import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new  Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    int [] arrs = new int [n];
        for (int i =0 ; i < n ; i++){
        int val = sc.nextInt() + sc.nextInt();
        arr[i] = val;
        arrs[i] = val;
        }
        Arrays.sort(arrs);
        int lo =n;
        for(int i = 0 ; i < n ; i++){
            if(i !=0 &&  arrs[i]== arrs[i-1]){continue;}
            for(int j = 0; j<n ;j++){
                if(arrs[i]==arr[j] && lo>0){
                    System.out.print((j+1)+" ");
                    lo--;
                }
            }
        }
        
    }
}
