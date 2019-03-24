// Java program to print all combination of size r in an array of size n 
import java.io.*;
import java.util.ArrayList; 
  
class Combination { 
  
    /* arr[]  ---> Input Array 
    data[] ---> Temporary array to store current combination 
    start & end ---> Staring and Ending indexes in arr[] 
    index  ---> Current index in data[] 
    r ---> Size of a combination to be printed */
    public static ArrayList<String> combs = new ArrayList<String>();

    static void combinationUtil(String[] arr, String data[], int start, int end, int index, int r) {
        // Current combination is ready to be printed, print it

        if (index == r) {
            String s = "";
            for (int j=0; j<r; j++) 
                s += data[j];
            combs.add(s);
            
            // for (int j = 0; j < r; j++)
            //     combs.add(data[j]);
                // System.out.print(data[1]);
            // System.out.println();
            // combs.add(data);
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        } 
    } 
  
    /*Driver function to check for above function*/
    public static void main (String[] args) { 
        String arr[] = {"aaooaoaooa", "uiieieiieieuuu", "aeioooeeiiaiei"}; 
        int r = 2; 
        int n = arr.length; 

        String data[]=new String[r]; 
        
        combinationUtil(arr, data, 0, n-1, 0, r); 

        for(int i = 0; i < combs.size(); i++) 
				System.out.println(combs.get(i));
    } 
} 
