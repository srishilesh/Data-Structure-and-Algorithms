/*

Problem
Our Battlestarcraft Algorithmica ship is being chased through space by persistent robots called Pylons! We have just teleported to a new galaxy to try to shake them off of our tail, and we want to stay here for as long as possible so we can buy time to plan our next move... but we do not want to get caught!

This galaxy is a flat grid of R rows and C columns; the rows are numbered from 1 to R from top to bottom, and the columns are numbered from 1 to C from left to right. We can choose which cell to start in, and we must continue to jump between cells until we have visited each cell in the galaxy exactly once. That is, we can never revisit a cell, including our starting cell.

We do not want to make it too easy for the Pylons to guess where we will go next. Each time we jump from our current cell, we must choose a destination cell that does not share a row, column, or diagonal with that current cell. Let (i, j) denote the cell in the i-th row and j-th column; then a jump from a current cell (r, c) to a destination cell (r', c') is invalid if and only if any of these is true:

r = r'
c = c'
r - c = r' - c'
r + c = r' + c'
Can you help us find an order in which to visit each of the R × C cells, such that the move between any pair of consecutive cells in the sequence is valid? Or is it impossible for us to escape from the Pylons?

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line containing two integers R and C: the numbers of rows and columns in this galaxy.

Output
For each test case, output one line containing Case #x: y, where y is a string of uppercase letters: either POSSIBLE or IMPOSSIBLE, according to whether it is possible to fulfill the conditions in the problem statement. Then, if it is possible, output R × C more lines. The i-th of these lines represents the i-th cell you will visit (counting starting from 1), and should contain two integers ri and ci: the row and column of that cell. Note that the first of these lines represents your chosen starting cell.

Limits
Time limit: 20 seconds per test set.
Memory limit: 1GB.

Test set 1 (Visible)
T = 16.
2 ≤ R ≤ 5.
2 ≤ C ≤ 5.

Test set 2 (Hidden)
1 ≤ T ≤ 100.
2 ≤ R ≤ 20.
2 ≤ C ≤ 20.

Sample

Input 
 	
Output 
 
2
2 2
2 5

  
Case #1: IMPOSSIBLE
Case #2: POSSIBLE
2 3
1 1
2 4
1 2
2 5
1 3
2 1
1 5
2 2
1 4

  
In Sample Case #1, no matter which starting cell we choose, we have nowhere to jump, since all of the remaining cells share a row, column, or diagonal with our starting cell.

In Sample Case #2, we have chosen the cell in row 2, column 3 as our starting cell. Notice that it is fine for our final cell to share a row, column, or diagonal with our starting cell. The following diagram shows the order in which the cells are visited:

2	4	6	10	8
7	9	1	3	5

*/

package codechef;


import java.util.Scanner;
public class pylons 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int s=1;
		while(s<=T)
		{
			int r=sc.nextInt();
			int c=sc.nextInt();
			int a[][]=new int[r][c];
			int flag[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
					flag[i][j]=0;
			}
			int x=2;int p,q,m,n,u,v;
			if((r==1)&&(c==1))
					continue;
			if((r*c)%2==0)
			{
			p=(int)(((r)/2));q=(int)(((c)/2));
			a[(int)(((r)/2))][(int)(((c)/2))]=1;
			flag[(int)(((r)/2))][(int)(((c)/2))]=1;
			}
			else
			{
				p=(int)(((r)));q=(int)(((c)/2));
				a[(int)(((r)))-1][(int)(((c)/2))]=1;
				flag[(int)(((r)))-1][(int)(((c)/2))]=1;
			}
			
			int h=r*c+r*c;
			//System.out.println(((int)(((r)/2)))+" "+((int)(((r)/2))));
			while((h--)>0)
			{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					m=(int)(Math.abs(p-i));
					n=(int)(Math.abs(q-j));
					u=p+i;
					v=q+j;
					if((u!=v) && (m!=n) && (p!=i) && (q!=j) && (flag[i][j]==0))
					{
						flag[i][j]=1;
						a[i][j]=x++;
						p=i;
						q=j;
						//System.out.println(i+" "+j);
						
					}
					
				}
			}
			}
			int count=1;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					//System.out.println(a[i][j]);
					if(flag[i][j]==1)
					{
						
						count++;
					}
					
				}
				
			}
			boolean poss=false;
			//System.out.println(count);
			if((r*c)%2==0)
				count--;
			if((count)==(r*c))
			{
				poss=true;
				System.out.println("Case #"+s+": "+"POSSIBLE");
			}
			else
				System.out.println("Case #"+s+": "+"IMPOSSIBLE");
			x=1;
			//System.out.println(poss);
			if(poss==true)
			{
				h=r*c+r*c;
				while((h--)>0)
				{
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
						if(a[i][j]==(x))
						{
							x++;
							System.out.println((i+1)+" "+(j+1));
						}
					}
				}
				}
			}
			//System.out.println();
			s++;
		}
		sc.close();
		
	}

}
