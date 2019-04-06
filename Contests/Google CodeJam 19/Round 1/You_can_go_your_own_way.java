package codechef;

import java.io.*;
import java.util.*;

public class path
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int p=1;
        while(p<=T)
        {
            int N=sc.nextInt();
            //System.out.println(N);
            //sc.nextLine();
            String P=sc.next();
            //System.out.println(P);
            if(P.length()!=((2*N)-2))
            	continue;
            String x="";
            //System.out.println(P);
            for(int i=0;i<P.length();i++)
            {
                if(P.charAt(i)=='E')
                x=x+"S";
                else
                x=x+"E";
            }
            System.out.println("Case #"+p+": "+x);
            p++;
        }
        
    }
}

