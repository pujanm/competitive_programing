import java.io.*;
import java.util.*;

class HP18 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    // System.out.println(t);
    for(int z = 0; z < t; z++) {
      String inps = sc.nextLine();
      String[] in = inps.split(" ");

      int n = Integer.parseInt(in[0]);
      int a = Integer.parseInt(in[1]);
      int b = Integer.parseInt(in[2]);

      int bob = 0;
      int alice = 0;
      int intersection = 0;
      ArrayList<Integer> arrlist = new ArrayList<>();
      int inp;

      for(int i = 0; i < n; i++) {
        inp = sc.nextInt();
        arrlis.add(inp);
      }

      for(int j = 0; j < arrlist.size(); j++) {
        if(arrlist.get(j) % a == 0) {
          bob += 1;
        }
        if(arrlist.get(j) % b == 0) {
          alice += 1;
        }
        if(arrlist.get(j) % a == 0 && arrlist.get(j) % b == 0) {
          intersection += 1;
        }
      }

      alice = alice - intersection;
      int a = bob - intersection + 1;
      int b = bob - intersection;
      bob =  intersection > 0 ? a : b;

      if(alice < bob) {
        System.out.println("BOB");
      } else {
        System.out.println("ALICE");
      }
      sc.nextLine();
    }
  }
}
