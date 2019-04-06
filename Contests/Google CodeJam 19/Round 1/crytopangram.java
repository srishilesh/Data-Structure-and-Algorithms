package codechef;

import java.io.*;
import java.util.*;
import java.util.Collections;

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
            
            int b[]=new int[L+1];
            for(int i=0;i<L-1;i++)
            {
                //int pro=a[i]*a[i+1];
                int lcm=(gcd(a[i],a[i+1]));
                if((i)<(L-1))
                b[i+1]=lcm;
                //System.out.print(b[i]+ " ");
            }
            
            b[0]=a[0]/b[1];
            b[L]=a[L-1]/b[L-1];
            int min=b[0];
            System.out.print("Case #"+p+": ");
            for(int i=0;i<L+1;i++)
            {
            	if(min>b[i])
            		min=b[i];
            	//System.out.print(b[i]+" ");
            	
            }
            //System.out.println(min);
            //System.out.println();
            //storePrime(min,N);
            
            ArrayList<Integer> hcf=new ArrayList<Integer>();
            //int l=(removeDuplicateElements(b,L+1));
            
            for(int i=0;i<L+1;i++)
            	hcf.add(b[i]);
            
            Collections.sort(hcf);
            
            
            int current = hcf.get(0);
            boolean found = false;
            ArrayList<Integer> fin=new ArrayList<Integer>();
            for (int i = 0; i < hcf.size(); i++) 
            {
                if (current == hcf.get(i) && !found) {
                    found = true;
                } else if (current != hcf.get(i)) {
                    fin.add(current);
                    current = hcf.get(i);
                    found = false;
                }
            }
            fin.add(current);
            //System.out.println(fin);
           
            
            int index[]=new int[L+1];
            for(int i=0;i<L+1;i++)
            {
            	index[i]=fin.indexOf(b[i]);
            	
            }
            for(int i=0;i<L+1;i++)
            	System.out.print(alpha[index[i]]+"");
            
            p++;
        }
    }
    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
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
  

    public static void storePrime(int min,int N) 
    { 
        int x=0;
        //int prime[]=new int[N];
        for (int i = min; i <= N; i++)  
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


/*
1
10000 25
3292937 175597 18779 50429 375469 1651121 2102 3722 2376497 611683 489059 2328901 3150061 829981 421301 76409 38477 291931 730241 959821 1664197 3057407 4267589 4729181 5335543
Case #1: 1669 1973 89 211 239 1571 1051 2 1861 1277 479 1021 2281 1381 601 701 109 353 827 883 1087 1531 1997 2137 2213 2411 
          262 297 23 46 51 247 176 0 283 205 91 171 338 220 109 125 28 70 143 152 180 241 301 321 329 357 */
