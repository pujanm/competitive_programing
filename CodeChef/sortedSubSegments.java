import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class sortedSubSegments {

    static int sortedSubsegments(int k, int[] a, int[][] queries) {

      ArrayList<Integer> al = new ArrayList<>();
      for(int i = 0; i < a.length; i++) {
        al.add(a[i]);
      }
      for(int i = 0; i < queries.length; i++) {
        int left = queries[i][0];
        int right = queries[i][1];

        Collections.sort(al.subList(left, right+1));
      }

      return al.get(k);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nqk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nqk[0].trim());

        int q = Integer.parseInt(nqk[1].trim());

        int k = Integer.parseInt(nqk[2].trim());

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[][] queries = new int[q][2];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int result = sortedSubsegments(k, a, queries);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();
        //
        // bufferedWriter.close();
    }
}
