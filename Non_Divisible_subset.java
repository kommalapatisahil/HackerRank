import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i=0; i< n;i++){
            int temp = sc.nextInt();
            arr[temp%k]++;
        }
        int count = Math.min(arr[0],1);
        for(int j = 1 ; j< (k+1)/2 ;j++){
            if (j != k-j){
                count+= Math.max(arr[j],arr[k-j]);
            }
            }
        if(k%2 == 0 ){
            count++;
        }
        System.out.println(count);
    }
}
