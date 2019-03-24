import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class pairs {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
          if(map.get(arr[i]) == null) {
            map.put(arr[i], 1);
          } else {
            map.put(arr[i], map.get(arr[i]) + 1);
          }
        }

        Collection<?> keys = map.keySet();

        for(Object key: keys) {
          int intKey = Integer.parseInt(key.toString());
          boolean b = map.containsKey(intKey + k);
          if(b) {
            count += 1;
          }
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);
        //
        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();
        //
        // bufferedWriter.close();

        scanner.close();
    }
}
