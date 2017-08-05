import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int ret = k;
        int mp = 0 ; 
        for(int j = 0 ; j < prices.length ; j++){
                ret-= prices[j];
            if (ret > 0 ){
                mp++;
            }
            else{break;}
            }
        return mp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        for(int prices_i = 0; prices_i < n; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        int result = maximumToys(prices, k);
        System.out.println(result);
        in.close();
        
    }
}

