import java.io.*;
import java.util.*;

class HP18 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    // System.out.println(t);
    for(int z = 0; z < t; z++) {
      String ins = sc.nextLine();
      String[] in = ins.split(" ");

      int n = Integer.parseInt(in[0]);
      int a = Integer.parseInt(in[1]);
      int b = Integer.parseInt(in[2]);

      int bob = 0;
      int alice = 0;
      int intersection = 0;
      ArrayList<Integer> arr = new ArrayList<>();
      int inp;

      for(int i = 0; i < n; i++) {
        inp = sc.nextInt();
        arr.add(inp);
      }

      for(int j = 0; j < arr.size(); j++) {
        if(arr.get(j) % a == 0) {
          bob += 1;
        }
        if(arr.get(j) % b == 0) {
          alice += 1;
        }
        if(arr.get(j) % a == 0 && arr.get(j) % b == 0) {
          intersection += 1;
        }
      }

      alice = alice - intersection;
      bob =  intersection > 0 ? bob - intersection + 1 : bob - intersection;

      if(alice < bob) {
        System.out.println("BOB");
      } else {
        System.out.println("ALICE");
      }
      sc.nextLine();
    }
  }
}
