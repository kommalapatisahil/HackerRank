import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        
        int l1 = s.length();
        int l2 = t.length();
        
        int min = Math.min(l1,l2);
        int ind = min;
        for (int g=0; g< min ; g++){
            if (s.charAt(g) != t.charAt(g)){ind = g;
                                           break;}
            }
        //System.out.println(ind);
        int fin = l2-2*ind + l1 ; 
        if (fin == k || k>= l1 +l2){System.out.println("Yes");}
        else if ((k-fin )%2 == 0 && k > fin){System.out.println("Yes");}
        else {System.out.println("No");}
    }
}

