/*  Problem Code: FASTFOOD  */


package codechef;
import java.util.Scanner;
public class fastfood {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			//System.out.println("test"+t);
			int sum=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int dif[]=new int[n];
			int first=0,last=0;
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
							
				first=first+b[i];
				last=last+a[i];
				dif[i]=a[i]-b[i];
			}
			//System.out.println("first"+first+"last"+last);
			int x=0;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if((dif[i]<0)&&(dif[i+1]<0)||((dif[i]>0)&&(dif[i+1]<0)))
					{	x=i+1;break;
					
					}
					
				}
				
			}
			int max=10000,sum1=0;
			if(x==0)
			{
				if(first>last)
				{
					//System.out.println(first);
					sum=first;
				}
				else
				{
					//System.out.println(last);
					sum=last;
				}
				//System.exit(1);
				
			}
			else
			{
				for(int i=0;i<n;i++)
				{
					if(max>sum)
					{
					if(i<x)
					sum1=sum1+a[i];
					else
						sum1=sum1+b[i];
					max=sum1;
					}
					else
						max=sum;
				}
				sum=sum1;
				
			}
			System.out.println(sum);
			
			
			t--;
		}
		sc.close();
	}

}
