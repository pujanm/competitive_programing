import java.io.*;
import java.util.*;

class semiPrimes {
  static boolean isPrime(int n)
  {

      if (n <= 1)
          return false;

      for (int i = 2; i < n; i++)
          if (n % i == 0)
              return false;

      return true;
  }
  static String isSumSemiPrime(int n) {

    ArrayList<Integer> a = new ArrayList<Integer>(n);
    int i, j, flag=0;

    for(i=1; i <= n; i++ ) {
      a.add(i);
    }

    for(i=0; i < a.size(); i++) {
      for(j=i+1; j < a.size(); j++) {
        int sum = a.get(i) + a.get(j);
        if(sum == n) {
          if(checkSemiprime(a.get(i)) && checkSemiprime(a.get(j))) {
              // System.out.println(a.get(i) + " + " + a.get(j) + " = " + sum);
              flag = 1;
          }
        }
      }
    }
    if(flag == 1) {
      return "YES";
    } else if(checkSemiprime(n/2)) {
      return "YES";
    } else {
      return "NO";
    }
  }
  static boolean checkSemiprime(int n)
  {
    ArrayList<Integer> a = new ArrayList<Integer>(n);
    int i, j, flag=0;

    for(i=1; i <= n; i++ ) {
      a.add(i);
    }

    for(i=0; i < a.size(); i++) {
      for(j=i+1; j < a.size(); j++) {
        int prod = a.get(i) * a.get(j);
        if(prod == n) {
          if(isPrime(a.get(i)) && isPrime(a.get(j))) {
              // System.out.println(a.get(i) + " * " + a.get(j) + " = " + prod);
              flag = 1;
          }
        }
      }
    }
    if(flag == 1) {
      return true;
    }
    return false;
  }

  // Driver code
    public static void main(String[] args)
    {
        int t;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<String>();
        t = sc.nextInt();
        for(int i=0; i<t; i++) {
          int n = sc.nextInt();
          // System.out.println(isSumSemiPrime(15));
          // isSumSemiPrime(n);
          s.add(isSumSemiPrime(n));
        }
        for(int i=0; i<s.size(); i++) {
          System.out.println(s.get(i));
        }
    }
}
