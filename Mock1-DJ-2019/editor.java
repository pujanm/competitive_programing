import java.io.*;
import java.util.*;

class editor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long operations = sc.nextLong();

        long num1 = (long) Math.ceil((double)(operations - 2) / 2);
        long num2 = Math.abs((operations - 2) - num1);

        long val;

        if(num1 > num2) {
            val = num1 + num2 * num1;
        } else {
            val = num2 + num1 * num2;
        }
            
        System.out.println(val);
    }
}