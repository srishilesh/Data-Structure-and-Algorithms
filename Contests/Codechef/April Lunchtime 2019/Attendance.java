package codechef;
import java.io.*;
import java.util.Scanner;
public class attendance {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int f=0;
		while(t>0)
		{
			int n=sc.nextInt();
			String a[]=new String[n];
			String first="";//,last="";
			sc.nextLine();
			int num[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLine();
				num[i]=0;
				//System.out.println(i+" "+a[i]);
			}
			
			for(int i=0;i<n;i++)
			{
				String[] splits=a[i].split(" ");
				first = (splits[0]);
				//last = (splits[splits.length-1]);
				for(int j=i+1;j<n;j++)
				{
					if(a[j].contains(first)==true)
					{
						num[i]=1;
						num[j]=1;
						//f=1;
						break;
					}
					//else
						//f=0;
				}
				//System.out.println(i+" "+num[i]);
				
				if((num[i]==1))
				System.out.print(a[i]);
				else
			    System.out.print(first);
				
				System.out.println();
				
				
			}
			
			
			t--;
		}
		sc.close();

	}

}
