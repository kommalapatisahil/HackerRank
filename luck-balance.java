import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();//min
    
        int [] arri  = new int [n];
        int count = 0 ;
        int u =0 ;
        
        for (int h=0 ; h < n ; h++){
            int temp  = sc.nextInt();
            int tempi  = sc.nextInt();
             if(tempi == 1  ){
                arri[u] = temp;
                u++;
            } 
            count += temp;
            }
        
        Arrays.sort(arri);
        for (int g = n-u; g < n-u+u-m; g++)
        {
            count-= 2*arri[g];
        }
        
        System.out.println(count);
    }
}
