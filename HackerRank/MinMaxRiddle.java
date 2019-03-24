import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxRiddle {

    static long max(long[] arr) {
      long max_el = arr[0];
      for(int i = 1; i < arr.length; i++) {
        if(arr[i] > max_el)
          max_el = arr[i];
      }

      return max_el;
    }

    static long min(long[] arr, int r1, int r2) {
      long min_el = arr[r1];
      for(int i = r1; i <= r2; i++) {
        if(arr[i] < min_el)
          min_el = arr[i];
      }

      return min_el;
    }

    // Complete the riddle function below.
    static long[] riddle(long[] arr) {
        // complete this function

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] arr = new long[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        long[] res = riddle(arr);

        // for (int i = 0; i < res.length; i++) {
        //     bufferedWriter.write(String.valueOf(res[i]));
        //
        //     if (i != res.length - 1) {
        //         bufferedWriter.write(" ");
        //     }
        // }

        // bufferedWriter.newLine();
        //
        // bufferedWriter.close();

        scanner.close();
    }
}
