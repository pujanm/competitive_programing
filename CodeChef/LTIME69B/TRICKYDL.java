import java.io.*;
import java.util.*;

class TRICKYDL {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    sc.nextLine();
    // System.out.prlongln(t);
    for(long z = 0; z < t; z++) {
      
      long a = sc.nextLong();

      ArrayList<Long> nums = new ArrayList<>();

      long max = 0;
      long chef = 0;
      long friend = 0;

      for(long i = 0; true; i++) {
        chef += (long)Math.pow(2, i);
        friend += a;
        long diff = friend - chef;

        if(diff < 0)
          break;
        else
          nums.add(diff);

      }

      int d2 = nums.indexOf(Collections.max(nums)) + 1;  
      System.out.println(nums.size() + " " + d2);
      sc.nextLine();
    }
  }
}
