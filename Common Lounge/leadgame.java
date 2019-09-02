//  https://www.codechef.com/problems/TLG


import java.util.*;
class leadgame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int leader[] = new int[n];
        int lead[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            a[i] = x + a[i];
            b[i] = y + b[i];
            if(a[i]>b[i])
            {
                leader[i] = 1;
                lead[i] = a[i] - b[i];
            }
            else
            {
                leader[i] = 2;
                lead[i] = b[i] - a[i];
            }
            x = a[i];
            y = b[i];
        }
        int max = 0,maxpos = 0;
        for(int i=0;i<n;i++)
        {
            if(max<lead[i])
            {
                max = lead[i];
                maxpos = i;
            }
            
            
        }
        System.out.print(leader[maxpos]+" "+lead[maxpos]);
    }
}
            
            
