import java.io.*;
import java.util.*;

class CHNUM {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		while(t-- != 0) {
			int n = sc.nextInt();

			ArrayList<Integer> a = new ArrayList<Integer>();

			for(int i=0; i < n; i++) 
				a.add(sc.nextInt());

			int max = 0;
			int min = 0;

			for(int i=0; i < n; i++) {
				if(a.get(i) > 0) 
					max++;
				else
					min++;
			}

			if(min == 0)
				min = max;

			if(min < max) 
				System.out.println(max + " " + min);
			else
				System.out.println(min + " " + max);
		}
	}
}