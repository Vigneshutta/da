import java.util.*;
import java.io.*;
public class Fibonacci

{
public static void main(String[] args)throws IOException
{
  
    int i, n, t1 = 0, t2 = 1, nextTerm;
      BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of terms:");
    n=Integer.parseInt(vc.readLine());

    System.out.println("Fibonacci Series:");

    for (i = 1; i <= n; ++i)
    {
        System.out.println(t1);
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
 
}
}
