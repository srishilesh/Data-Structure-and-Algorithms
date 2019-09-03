// https://www.codechef.com/ZCOPRAC/problems/ZCO14001

import java.util.*;
class videogame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] x=sc.nextLine().split(" ");
        int n=Integer.parseInt(x[0]);
        int h=Integer.parseInt(x[1]);
        int[] a=new int[n];
        x=sc.nextLine().split(" ");
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(x[i]);
        x=sc.nextLine().split(" ");
        int l=x.length;
        int[] b=new int[l];
        for(int i=0;i<l;i++)
        b[i]=Integer.parseInt(x[i]);
          /*while((p=sc.nextInt()) != 0)
        {
            s = s+ p+",";
            
        }
        s = s+"0";
        //System.out.println(s);
        String inst[]= s.split(",");*/

        int pos = 0,hold=0;
        for(int i=0;i<b.length;i++)
        {
            //System.out.println(inst[i]);
            if(b[i]==1)
            {
                if(pos>0)
                pos--; // 3
                else
                pos = 0;
                continue;
            }
            else if(b[i]==2)
            {
                if(pos<n-1)
                pos++;  // 1 2 3 4
                else
                pos = n-1;
                continue;
            }
            else if(b[i]==3)
            {
                if(hold==0&&(a[pos]>0) && (a[pos] <=h))
                {hold = 1;
                    a[pos] = a[pos] - 1; //2 
                }
                continue;
            }
            else if(b[i]==4)
            {
                if(hold==1 &&(a[pos]>=0) && (a[pos] <h))
                {
                    hold = 0;
                a[pos] = a[pos] +1; //
            }
                continue;
                
            }
            else
            {
            break;}
        }
        String fin="";
        for(int i=0;i<n;i++)
        {
            fin = fin+a[i]+" ";
        }
        System.out.println(fin);
    }
}
            
/*
SOLUTION 
https://www.codechef.com/viewsolution/26197295
*/
