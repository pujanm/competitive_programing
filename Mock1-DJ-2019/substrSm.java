import java.io.*;
import java.util.*;

class substrSm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        sc.nextLine();

        while(t-- != 0) {
            String inp = sc.nextLine();

            HashMap<Character, Integer> strHash = new HashMap<>();

            for(int i = 0; i < inp.length(); i++) {
                if(!strHash.containsKey(inp.charAt(i))) {
                    strHash.put(inp.charAt(i), 1);
                } else {
                    strHash.put(inp.charAt(i), strHash.get(inp.charAt(i)) + 1);
                }
            }

            int maxVal = 0;

            for (Map.Entry<Character, Integer> pair : strHash.entrySet())
            {
                if(pair.getValue() > maxVal) 
                    maxVal = pair.getValue();
            }


            char prev = '?';
            char best = '.';
            for (Map.Entry<Character, Integer> pair : strHash.entrySet())
            {
                if(pair.getValue() == maxVal) {
                    if(prev != '?') {
                        if(pair.getKey() < prev) 
                            best = pair.getKey();
                    } else {
                        prev = pair.getKey();
                        best = pair.getKey();
                    }

                    prev = pair.getKey();
                } 
            }
            // System.out.println(strHash);
            // System.out.println("Max in str: " + maxVal);
            System.out.println(best);
            
        }
    }
}