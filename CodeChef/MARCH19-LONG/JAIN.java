import java.io.*;
import java.util.*;

class JAIN {
	public static ArrayList<String> combs = new ArrayList<String>();

    static void combinationUtil(String[] arr, String data[], int start, int end, int index, int r) {

        if (index == r) {
            String s = "";
            for (int j=0; j<r; j++) 
                s += data[j];
            combs.add(s);
            
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        } 
    }
	
	static public HashMap<Character, Integer> stringToMap(String st) {
		HashMap<Character, Integer> st_map = new HashMap<Character, Integer>();

		for(int i = 0; i < st.length(); i++) {
			if(!st_map.containsKey(st.charAt(i)))
				st_map.put(st.charAt(i), 1);
			else
				st_map.put(st.charAt(i), st_map.get(st.charAt(i)) + 1);
		}

		return st_map;
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		sc.nextLine();

		while(t-- != 0) {
			int n = sc.nextInt();

			sc.nextLine();

			String arr[] = new String[n];
			
			for(int i = 0; i < n; i++)
				arr[i] = sc.nextLine();

			String data[]=new String[2];
		
			combinationUtil(arr, data, 0, n-1, 0, 2);
			
			int count = 0;

			char[] vowels = "aeiou".toCharArray();

			for(int i = 0; i < combs.size(); i++) {
				HashMap<Character, Integer> st_map = stringToMap(combs.get(i));
				int flag = 0;

				for(int j = 0; j < vowels.length; j++) {
					if(!st_map.containsKey(vowels[j]))
						flag = 1;
				}

				if(flag == 0)
					count += 1;
			}

			System.out.println(count);
				
		}
	}
}