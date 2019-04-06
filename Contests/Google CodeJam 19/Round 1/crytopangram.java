/*
Problem
On the Code Jam team, we enjoy sending each other pangrams, which are phrases that use each letter of the English alphabet at least once. One common example of a pangram is "the quick brown fox jumps over the lazy dog". Sometimes our pangrams contain confidential information — for example, CJ QUIZ: KNOW BEVY OF DP FLUX ALGORITHMS — so we need to keep them secure.

We looked through a cryptography textbook for a few minutes, and we learned that it is very hard to factor products of two large prime numbers, so we devised an encryption scheme based on that fact. First, we made some preparations:

We chose 26 different prime numbers, none of which is larger than some integer N.
We sorted those primes in increasing order. Then, we assigned the smallest prime to the letter A, the second smallest prime to the letter B, and so on.
Everyone on the team memorized this list.
Now, whenever we want to send a pangram as a message, we first remove all spacing to form a plaintext message. Then we write down the product of the prime for the first letter of the plaintext and the prime for the second letter of the plaintext. Then we write down the product of the primes for the second and third plaintext letters, and so on, ending with the product of the primes for the next-to-last and last plaintext letters. This new list of values is our ciphertext. The number of values is one smaller than the number of characters in the plaintext message.

For example, suppose that N = 103 and we chose to use the first 26 odd prime numbers, because we worry that it is too easy to factor even numbers. Then A = 3, B = 5, C = 7, D = 11, and so on, up to Z = 103. Also suppose that we want to encrypt the CJ QUIZ... pangram above, so our plaintext is CJQUIZKNOWBEVYOFDPFLUXALGORITHMS. Then the first value in our ciphertext is 7 (the prime for C) times 31 (the prime for J) = 217; the next value is 1891, and so on, ending with 3053.

We will give you a ciphertext message and the value of N that we used. We will not tell you which primes we used, or how to decrypt the ciphertext. Do you think you can recover the plaintext anyway?

Input
The first line of the input gives the number of test cases, T. T test cases follow; each test case consists of two lines. The first line contains two integers: N, as described above, and L, the length of the list of values in the ciphertext. The second line contains L integers: the list of values in the ciphertext.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is a string of L + 1 uppercase English alphabet letters: the plaintext.

Limits
1 ≤ T ≤ 100.
Time limit: 20 seconds per test set.
Memory limit: 1 GB.
25 ≤ L ≤ 100.
The plaintext contains each English alphabet letter at least once.

Test set 1 (Visible)
101 ≤ N ≤ 10000.

Test set 2 (Hidden)
101 ≤ N ≤ 10100.

Sample

Input 
 	
2
103 31
217 1891 4819 2291 2987 3811 1739 2491 4717 445 65 1079 8383 5353 901 187 649 1003 697 3239 7663 291 123 779 1007 3551 1943 2117 1679 989 3053
10000 25
3292937 175597 18779 50429 375469 1651121 2102 3722 2376497 611683 489059 2328901 3150061 829981 421301 76409 38477 291931 730241 959821 1664197 3057407 4267589 4729181 5335543

  


Output 
 
Case #1: CJQUIZKNOWBEVYOFDPFLUXALGORITHMS
Case #2: SUBDERMATOGLYPHICFJKNQVWXZ

  
  
Syntax pre-check
Show Test Input*/



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
