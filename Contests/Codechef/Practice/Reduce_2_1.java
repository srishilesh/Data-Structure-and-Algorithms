// Reduce to One Problem Code: REDONE

import java.io.*;
class reduce_to_one {

	public static void main(String[] args)throws IOException {
		//Scanner sc=new Scanner(System.in);
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int T=Integer.parseInt(br.readLine());
		while(T>0)
		{
			long N = Long.parseLong(br.readLine());
			long sum = 0;long a=N;
			while(N>=1)
			{
				sum = ((a + (N-1) + (a*(N-1)%1000000007))%1000000007);
				a= sum % 1000000007;
				
				N = (N -1)%1000000007;
			}
			System.out.println(sum);
			T--;
		}

	}

}
