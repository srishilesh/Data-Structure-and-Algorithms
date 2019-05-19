/* Chain Reaction Problem Code: REACTION */

import java.util.*;
public class chain_reaction
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int T =sc.nextInt();
        while(T>0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int a[][] = new int[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            int t,f=0;int topLeft,top,topRight,midLeft,midRight,botLeft,bot,botRight;
            for(int x=0;x<r;x++)
            {
                f=0;
                for(int y=0;y<c;y++)
                {
                    t = a[x][y];
                    
                    if(y==0)
                    {
                        if(x ==0)
                        f=check(0,0,0,0,t,a[x + 1 ][y],0,a[x][ y + 1 ],0);
                        else if(x == r-1)
                        f=check(0,0,0,a[x - 1 ][y],t,0,0,a[x][ y + 1 ],0);
                        else
                        f=check(0,a[x][y - 1 ],0,a[x - 1 ][y],t,0,0,a[x][ y + 1 ],0);
                        
                        
                    }
                    else if(y == (c-1))
                    {
                        if(x ==0)
                        f=check(0,a[x][y - 1 ],0,0,t,a[x + 1 ][y],0,0,0);
                        else if(x == r-1)
                        f=check(0,a[x][y - 1 ],0,a[x - 1 ][y],t,0,0,0,0);
                        else
                        f=check(0,a[x][y - 1 ],0,a[x - 1 ][y],t,a[x + 1 ][y],0,0,0);
                    }
                    else                    
                    
                    f=check(a[x - 1 ][y - 1 ],a[x][y - 1 ],a[x + 1 ][y - 1 ],a[x - 1 ][y],t,a[x + 1 ][y],a[x - 1 ][y + 1 ],a[x][ y + 1 ],a[x + 1 ][ y + 1 ]);
                    if(f==0)
                    break;
                    
                    
                       
                        
                    //System.out.println(f);
                }
                    if(f==0)
                    break;
                }
            
            if(f==0)
            System.out.println("Unstable");
            else
            System.out.println("Stable");
            T--;
        }
        }
        public static int check(int topLeft,int top,int topRight,int midLeft,int t,int midRight,int botLeft,int bot,int botRight)
        {
            int f=0;
            if((t>topLeft)&&(t>top)&&(t>topRight)&&(t>midRight)&&(t>midLeft)&&(t>botRight)&&(t>bot)&&(t>botLeft))
                    f=1;
                    else
                    {
                        f=0;
                        return 0;
                    }
            return 1;
            
            
        }
    }
