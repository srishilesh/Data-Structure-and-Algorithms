import java.util.*;
public class min_comb
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int n1 =sc.nextInt();
            int n2 = sc.nextInt();
            for(int i=1;i<=10;i++)
            {
                if(i%gcd(n1,n2)==0)
                { System.out.println(i);
                  break;
                }
            }
            T--;
        }
    }
    static int gcd(int a, int b) 
    { 
        if (a % b == 0)
        return Math.abs(b);
        else
        return gcd(b,a%b); 
    }
     
}