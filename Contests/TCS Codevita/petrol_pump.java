import java.util.*;
public class petrol_pump
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[13];    
        int sum=0;
        for(int i=0;i<13;i++)
        {
            a[i]=sc.nextInt();
            sum = sum + a[i];
         }
         int tot = (sum/2);
         int c;
        for(int i=1;i<=sum;i++)
        {
            if(tot-((i+(sum-i))/2)==0)
            {
                if(i<(sum-i))
                {
                    System.out.println(sum-i);
                    break;
                }
                else
                {
                    System.out.println(i);
                    break;
                }
            }
        }
        int sum1=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                sum1 = sum1 + a[j];
                if(sum1 == 335)
                {
                    System.out.println("Found");
                    break;
                }
            }
        }
        

    }
}
        