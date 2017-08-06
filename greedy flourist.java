import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMinimumCost(int n, int k, int[] c){
        Arrays.sort(c);
        int[] arr = new int[n];
        //descending order
        for (int g=0; g< n ; g++){
            arr[g] = c[n-g-1];
            }
        int ari = 0; //arr index
        int bs = 0;  //bought sofar
        int cost = 0;
        while (ari < n ){
            cost += ( bs + 1)*arr[ari];
            if ((ari+1)%k ==0)
            {
            bs ++;
            }
            ari++;
            }        
        return cost;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }
}

