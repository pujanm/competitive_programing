import java.io.*;
import java.util.*;

class CHDIGER {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		sc.nextLine();

		while(t-- != 0) {
			String in = sc.nextLine();
			String inp[] = in.split(" ");

			long n = Long.parseLong(inp[0]);
			long d = Long.parseLong(inp[1]);

			long small;

			ArrayList<Long> a = new ArrayList<Long>();

			
			a.add(n);

			String in_copy = inp[0];

		   	for(int i = 0; i < inp[0].length(); i++) {
		   		in_copy = inp[0];

		   		in_copy = in_copy.substring(0, i) + in_copy.substring(i+1, inp[0].length()) + d; 

		   		a.add(Long.valueOf(in_copy));
		   	}


			for(int i = inp[0].length() - 2; i >= 0; i--) {
				in_copy = inp[0];

		    	in_copy = in_copy.substring(0, i) + d + in_copy.substring(i + 1); 

				a.add(Long.valueOf(in_copy));
			}

			for(int i = 1; i < inp[0].length(); i++) {
		   		in_copy = inp[0];

		   		in_copy = d + in_copy.substring(0, i) + in_copy.substring(i+1, inp[0].length()); 

		   		a.add(Long.valueOf(in_copy));
		   	}

			System.out.println(Collections.min(a));
			// System.out.println(a);
		}
	}
}