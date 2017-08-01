import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int min = Math.abs(a[0]-a[1]);
        int i=0;    
        for(int j=0; j< a.length -1; j++){
                if (Math.abs(a[j] - a[j+1]) < min){min = Math.abs(a[j] - a[j+1]); }
            }
        System.out.println(min);
    }
}

