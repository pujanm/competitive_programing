import java.io.*;
import java.util.*;

class DPAIRS {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String inp = sc.nextLine();
    String[] in = inp.split(" ");

    int n = Integer.parseInt(in[0]);
    int m = Integer.parseInt(in[1]);

    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    ArrayList<String> dpairs = new ArrayList<>();
    LinkedHashMap<Integer, Integer> sums = new LinkedHashMap<>();

    for(int i = 0; i < n; i++) {
      a.add(sc.nextInt());
    }

    for(int i = 0; i < m; i++) {
      b.add(sc.nextInt());
    }

    int flag = 0;

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        if(dpairs.size() == n+m-1) {
          flag = 1;
          break;
        }
        if(sums.get(a.get(i) + b.get(j)) == null){
          dpairs.add(i + " " + j);
          sums.put(a.get(i) + b.get(j), 1);
        }
      }
      if(flag == 1)
        break;
    }

    for(int i = 0; i < dpairs.size(); i++) {
      System.out.println(dpairs.get(i));
    }
  }
}
