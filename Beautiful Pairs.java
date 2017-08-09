import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[1001];
        int [] arr2 = new int[1001];
        for(int i = 0 ; i< n ; i++)
        {
            arr1[sc.nextInt()]++ ;
        }
         for(int i = 0 ; i< n ; i++)
        {
            arr2[sc.nextInt()]++ ;
        }
        int count = 0;
        for (int h = 0 ; h < 1001 ; h++){
         count+= Math.min(arr1[h],arr2[h]);
        }
        if(count < n){count++;}
        else {count--;}
        System.out.println(count);
        

    }
}
