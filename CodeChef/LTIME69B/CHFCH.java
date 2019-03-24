import java.io.*;
import java.util.*;

class CHFCH {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    sc.nextLine();
    // System.out.prlongln(t);
    for(long z = 0; z < t; z++) {
      String ins = sc.nextLine();
      String[] in = ins.split(" ");

      long n = Long.parseLong(in[0]);
      long k = Long.parseLong(in[1]);

      ArrayList<Long> a = new ArrayList<>();
      HashMap<Long, Long> map = new HashMap<>();

      long inp;

      for(long i = 0; i < n; i++) {
        inp = sc.nextLong();
        a.add(inp);

        if(map.get(inp) == null) {
          map.put(inp, (long)1);
        } else {
          map.put(inp, (long)map.get(inp)+1);
        }
      }

      long flag = 0;

      Iterator it = map.entrySet().iterator();
      while(it.hasNext()){
        Map.Entry pair = (Map.Entry)it.next();
        if((long)pair.getValue() >= k) {
          flag = 1;
          break;
        }
        it.remove();
      }

      if(flag == 0) 
        System.out.println(-1);
      else {
        it = map.entrySet().iterator();
        while(it.hasNext()){
          Map.Entry pair = (Map.Entry)it.next();
          if((long)pair.getValue() >= k){
            long swaps = 0;
            for(int i = 0; i < a.size(); i++) {
              if(a.get(i) == (long)pair.getKey()) {
                swaps = Math.abs(swaps - i);
              }
            }
            System.out.println((long)pair.getKey() + " - " + swaps);
          }
          it.remove();
        }
      }
      // System.out.println(map);
      sc.nextLine();
    }
  }
}
