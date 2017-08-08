import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q =  sc.nextInt();//no. of queries
        for (int t = 0 ; t < q ; t++){
            int m  = sc.nextInt()-1;
            int n  = sc.nextInt()-1;
            
            long [] M = new long[m];
            long [] N = new long[n];
            
            for (int i = 0 ; i< m ; i++){
                M[i] = sc.nextLong();
            }
            
            for (int j = 0 ; j< n ; j++){
                N[j] = sc.nextLong();
             }
            Arrays.sort(N);
            Arrays.sort(M);
            
            long [] ms = new long [m];
            for(int p = 0 ; p < m ; p++){
                ms[p] = M[m-p-1];
            }
        
            long [] ns = new long [n];
            for(int po = 0 ; po < n ; po++){
                ns[po] = N[n-po-1];
            }
            
            
            int x_cuts= 1;
            int y_cuts = 1;
            
            int xi = 0;
            int yi = 0 ;
            long cost = 0 ;
            for(int l = 0 ; l < n+m ; l++){
                if(xi > m-1 ){
                cost+= (x_cuts*ns[yi]);
                    y_cuts++;
                    yi++;
                }
                else if(yi > n-1){
                    cost+= (y_cuts*ms[xi]);
                    xi++;
                    x_cuts++;
                }
                else if(ms[xi] >= ns[yi]){
                    cost += (y_cuts*ms[xi]);
                    xi++;
                    x_cuts++;
                 } 
                else {
                    cost  += (x_cuts * ns[yi]);
                    y_cuts++;
                    yi++;
                }
            }
            long k = (long) Math.pow(10,9)+7;
            cost = Math.min(cost,cost%k);
            System.out.println(cost);
        }
    
    }
}
