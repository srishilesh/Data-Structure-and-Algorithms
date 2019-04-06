package codechef;

import java.io.*;
import java.util.*;

public class cryptopangram
{
	static ArrayList<Integer> prime =new ArrayList<Integer>();
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
            for(int i=0;i<L;i++)
            {
            a[i]=sc.nextInt();
            }
            char alpha[]=new char[26];
            char ch='A';
            for(int i=0;i<26;i++)
            {
            	 
            	alpha[i]=ch++;
            	//System.out.print(alpha[i]+" ");
            }
            storePrime(N);
            int b[]=new int[L];
            for(int i=0;i<L-1;i++)
            {
                //int pro=a[i]*a[i+1];
                int lcm=(gcd(a[i],a[i+1]));
                if((i)<(L-1))
                b[i+1]=lcm;
                //System.out.print(b[i]+ " ");
            }
            b[0]=a[0]/b[1];
            System.out.print("Case #"+p+": ");
            for(int i=0;i<L;i++)
            {
            	//System.out.print(b[i]+" ");
            	System.out.print(alpha[(int)prime.indexOf(b[i])]+"");
            }
            p++;
        }
    }
    public static int gcd(int a,int b)
    {
        if(a==0)
        return b;
        if(b==0)
        return a;
        if(a==b)
        return a;
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
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
  

    public static void storePrime(int N) 
    { 
        int x=0;
        //int prime[]=new int[N];
        for (int i = 3; i <= N; i++)  
        { 
            if (isPrime(i))
            {
                //prime[x]=i;
            	prime.add(i);
               // x++;
            }
        } 
        //return prime;
    }
    
}
