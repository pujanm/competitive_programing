import java.io.*;
import java.util.*;

class pointsEq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        ArrayList<Long> x = new ArrayList<>();
        ArrayList<Long> y = new ArrayList<>();

        sc.nextLine();

        for(int i = 0; i < n; i++) {
            String inp = sc.nextLine();
            String[] inpArr = inp.split(" ");

            x.add(Long.parseLong(inpArr[0]));
            y.add(Long.parseLong(inpArr[1]));
        }

        long s = sc.nextLong();
        long count = 0;
        // System.out.println("X: " + x);
        // System.out.println("Y: " + y);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    long eqn = (x.get(i) - x.get(j)) + (y.get(i) - y.get(j));
                    if(eqn == s)
                        count++;

                    System.out.prinlnt("Pair " + (count+1) + " : " + x.get(i) + " , " + y.get())
                }
            }
        }

        System.out.println(count);
    }
}