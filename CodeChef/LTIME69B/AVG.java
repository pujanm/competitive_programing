import java.io.*;
import java.util.*;

class AVG {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    // System.out.println(t);
    for(int z = 0; z < t; z++) {
      String ins = sc.nextLine();
      String[] in = ins.split(" ");

      int n = Integer.parseInt(in[0]);
      int k = Integer.parseInt(in[1]);
      int v = Integer.parseInt(in[2]);

      ArrayList<Integer> a = new ArrayList<>();
      int inp;

      for(int i = 0; i < n; i++) {
        inp = sc.nextInt();
        a.add(inp);
      }

      int sum = 0;
      for(int i = 0; i < a.size(); i++) 
      	sum += a.get(i);


      float num = (float)(v*(n+k) - sum)/k;
      // System.out.println(num);
      
      if(num==Math.round(num) && num > 0)
      	System.out.println((int)num);
      else
      	System.out.println(-1);
 

      sc.nextLine();
    }
  }
}
