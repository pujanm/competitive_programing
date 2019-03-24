import java.io.*;
import java.util.*;

class Solution {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // N and M
    int n = sc.nextInt();
    int m = sc.nextInt();

    ArrayList<Integer> first_upper =  new ArrayList<Integer>(n);
    ArrayList<Integer> first_lower =  new ArrayList<Integer>(n);
    ArrayList<Integer> second_upper =  new ArrayList<Integer>(n);
    ArrayList<Integer> second_lower =  new ArrayList<Integer>(n);

    // Regquired K, A, B, C, D and for Type 1 say X, Y
    int x, y; // 1
    int k, old_k = 0; // 2
    int a,b,c,d; // 3

    int i, j;
    for(i=0; i<n; i++) {
      first_upper.add(1);
      first_lower.add(-1);
    }
    for(i=0; i<n; i++) {
      int val = sc.nextInt();
      second_upper.add(val);
    }
    for(i=0; i<n; i++) {
      int val = sc.nextInt();
      second_lower.add(val);
    }
    for(j=1; j<=m; j++){
      int type = sc.nextInt();
      if(type == 1) {
        x = sc.nextInt();
        y = sc.nextInt();

        ArrayList<Integer> second_u_1 =  new ArrayList<Integer>(n);
        ArrayList<Integer> second_l_1 =  new ArrayList<Integer>(n);

        for(i=x-1; i < y; i++) {
          second_u_1.add(second_upper.get(i));
          second_l_1.add(second_lower.get(i));
        }

        Collections.reverse(second_u_1);
        Collections.reverse(second_l_1);

        k = 0;
        for(i=x-1; i < y; i++) {
          second_upper.set(i, second_l_1.get(k));
          second_lower.set(i, second_u_1.get(k));
          k++;
        }

      }
      if(type == 2) {
        k = sc.nextInt();
          ArrayList<Integer> first_u_2 =  new ArrayList<Integer>(n);
          ArrayList<Integer> first_l_2 =  new ArrayList<Integer>(n);

          for(i=0; i<k; i++) {
            first_u_2.add(first_upper.get(i));
            first_l_2.add(first_lower.get(i));
          }

          Collections.reverse(first_u_2);
          Collections.reverse(first_l_2);

          for(i=0; i<k; i++) {
            first_lower.set(i, first_u_2.get(i));
            first_upper.set(i, first_l_2.get(i));
          }
          old_k = k;
      }
      if(type == 3) {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if(b-a == d-c) {
          int sum = 0;

          while(c != d+1) {
            sum += first_upper.get(c-1) * second_upper.get(a-1);
            c += 1;
            a += 1;
          }
          System.out.println(sum);
        }
      }
    }
  }
}
