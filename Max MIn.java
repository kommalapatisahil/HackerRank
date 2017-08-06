import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Solution {
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(in.readLine());
      int K = Integer.parseInt(in.readLine());
      int[] list = new int[N];
      for(int i = 0; i < N; i ++)
         list[i] = Integer.parseInt(in.readLine());
      Arrays.sort(list);
      int min = (list[K-1]-list[0]);
      for(int h =0; K-1+h< N ; h++){
          min = Math.min(min,list[K-1+h]-list[0+h]);
      }
    System.out.println(min);
    }
}

