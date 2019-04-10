import java.io.*;
import java.util.*;

public class skill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        int test=sc.nextInt();
        while(test--)
        {
            int n=sc.nextInt();
            int p=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            v.add(sc.nextInt());
            v.sort();
            System.out.println(((int)v.get(2)-(int)v.get(0))+((int)v.get(2)-(int)v.get(1)))
            
            
        }
    }
}
