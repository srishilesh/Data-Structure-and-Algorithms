package codechef;
//import java.io.*;
//import java.util.*;

//import java.io.*;
import java.util.Scanner;
public class codejampoints
{
  public static void main(String args[])throws Exception
  {
      Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        int p=1,q=0;
      while(p<T)
	        {
	        q=0;
	        //x=0;
	        int N=sc.nextInt();
	        String s=N+"";
	        int n=Integer.parseInt(s);
	        int x=0;
	        if(s.indexOf('4')==-1)
	        {
	        	p++;
	        	continue;
	        }
	        	
	        while(s.indexOf('4')>=0)
	        {
	        	//if(s.indexOf('4')!=0)
	        		x=(int)Math.pow(10, (s.length()-1-s.indexOf('4')));
	        	//else
	        		//x=1;
	            n=n-x;
	            q=q+x;
	            //System.out.println(n+" "+x);
	            s=n+"";
	        }
	        System.out.println("Case #"+p+": "+n+" "+q);
	        p++;
	        }
	        sc.close();
  }
}
