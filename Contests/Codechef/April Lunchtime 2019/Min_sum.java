/*    Problem Code: MINARRS   */

package codechef;
import java.util.Scanner;
public class minsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int sum=0,min=10000,mini=1000,x;
			for(int i=0;i<n;i++)
			{
				x=a[i];
				sum=0;
				for(int j=0;j<n;j++)
				{
					//if(sum<max)
					
						sum=sum+(int)(a[j]^x);
						//max=sum;
					
				}
				//System.out.println("test"+t+"sum"+sum);
				if(sum<min)
					min=sum;
				if(x<mini)
					mini=x;
			}
			System.out.println(min);
			
			t--;
		}

	}

}
