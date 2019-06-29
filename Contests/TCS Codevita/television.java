import java.util.*;
public class television
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rooms = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int rev = sc.nextInt();
        float approx = rev/365;
        int no,occ = 0, min = 99999 ,tv = 0,k=0;
        int p[] =new int[12];int d;int sum=0,count = 0;
        if(r1<r2)
        {
            System.out.println(rooms);
            System.exit(0);
        }
        else
        {
            for( k=0;k<=20;k++){
                sum=0;

            for(int i=1;i<=12;i++)
            {
                //min = 999999;
                
                if((i == 1)||(i == 3)||(i == 5)||(i == 7)||(i == 7)||(i == 8)||(i == 10)||(i == 12))
                d = 31;
                else if(i==2)
                d = 28;
                else
                d =30;
                for(int j=1;j<=d;j++)
                {
                    no = (int)((int)Math.pow((6-i),2)+(int)Math.abs(j-15));
 //                   System.out.print(j+"/"+i+"  "+no);
                    if(no>rooms)
                    occ = rooms;
                    else
                    occ = no;
                    
                    //tv = (int)(approx/r1);
//                    System.out.print("  *"+tv+"* ");

                    count++;
                    
                    {
                        //sum=0;
                    sum = sum + ((occ-k)*1500) + (k*1000);
                    System.out.println(sum);
                    
                }
                    
                }
            
                p[i-1] = min;
                //System.out.println(min);
        }
        if((min > sum) && (sum>=rev))
                    {min = sum;
                        tv = occ - k;
                    break;}
                    //k++;
                }
        int min1=9999999;
        for(int i=0;i<p.length;i++)
        {
            if(min1>p[i])
            min1 = p[i];
        }
        System.out.println(tv+" "+count);
    }
}
}