package codechef;

import java.io.*;
import java.util.*;

public class cryptopangram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int p=1;
        while(p<=T)
        {
            int N=sc.nextInt();
            int L=sc.nextInt();
            int a[]=new int[L];
            for(int i=0;i<26;i++)
            a[i]=sc.nextInt();
            int prime[]=storePrime(N);
            char alpha[]=new char[26];
            for(int i=0;i<26;i++)
            {
                char ch='A'
                if(ch<='Z')
                alpha[i]=ch++;
            }
            
            ArrayList seq=new ArrayList(26);
            int x=0;
            for(int i=0;i<26;i++)
            {
                if(x<=N)
                if(a[i]%prime[x]==0)
                {
                    seq.add(prime[x]);
                    x++;
                }
            }
            seq.Sort();
            
            p++;
        }
    }
    public static boolean isPrime(int n) 
    {    

        if (n <= 1) 
            return false; 
  

        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
  

    public static int[] storePrime(int N) 
    { 
        x=0;
        int prime[]=new int[N];
        for (int i = 2; i <= N; i++)  
        { 
            if (isPrime(i)&&(x<=N) )
            {
                prime[x]=i;
                x++;
            }
        } 
        return prime;
    }
    
}
