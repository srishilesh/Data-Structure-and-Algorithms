//Reduce to One Problem Code: REDONE 
https://www.codechef.com/MAY19B/problems/REDONE/






//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
import java.io.*;
public class reduce_to_one {

	public static void main(String[] args)throws IOException {
		//Scanner sc=new Scanner(System.in);
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int T=Integer.parseInt(br.readLine());
		while(T>0)
		{
			long N = Long.parseLong(br.readLine());
			//List<Long> num = new ArrayList<>();
			/*
			for(int i=0;i<N;i++)
				num.add((long)(i+1));
			
			long X,Y,F;
			
			
			{
				while(num.size()!=1)
				{
				 X = num.get(num.size()-2);
				Y = num.get(num.size()-1);
				F = ((X + Y + (X*Y))%1000000007) ;
				num.remove(num.size()-2);
				num.remove(num.size()-1);
				num.add(F);
				
				}
			}
			
			System.out.println(num.get(0));
				*/
			long sum = 0;long a=N;
			while(N>=1)
			{
				sum = ((a + (N-1) + (a*(N-1)))%1000000007);
				a= sum % 1000000007;
				
				N = (N -1)%1000000007;
			}
			System.out.println(sum);
			T--;
		}

	}

}
