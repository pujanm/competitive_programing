import java.io.*;
import java.util.*;

class maxEP {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String ins = sc.nextLine();
    String[] in = ins.split(" ");
    int n = Integer.parseInt(in[0]);
    int c = Integer.parseInt(in[1]);
    int ci = 1000;

    Random rand=new Random();
    int y = rand.nextInt((n+1) - 1) + 1;

    System.out.println(y);
    System.out.flush();
  }
}
