import java.io.*;
import java.util.*;

class seriesAp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        sc.nextLine();

        while(t-- != 0) {
            String inp = sc.nextLine();

            String[] inpArr = inp.split(" ");

            long ai = Long.parseLong(inpArr[0]);
            long aj = Long.parseLong(inpArr[1]);
            long di = Long.parseLong(inpArr[2]);
            long dj = Long.parseLong(inpArr[3]);

            long n = 100;
            
            ArrayList<Long> ser1 = new ArrayList<>();
            ArrayList<Long> ser2 = new ArrayList<>();

            for(long i = 0; i < n; i++) {
                ser1.add(ai + i*di);
                ser2.add(aj + i*dj);
            }

            ArrayList<Long> intersection = new ArrayList<>();

            
            // System.out.println("Ser 1: "+ ser1);
            // System.out.println("Ser 2: "+ ser2);
            HashMap<Long, Integer> ser2Hash = new HashMap<>();

            for(int i = 0; i < ser2.size(); i++)
            {
                if(!ser2Hash.containsKey(ser2.get((int)i)))
                    ser2Hash.put(ser2.get(i), 1);
            }

            for(Long i: ser1) {
                if(ser2Hash.containsKey(i)) 
                    intersection.add(i);
            }

            // System.out.println(intersection);

            if(intersection.size() != 0)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}