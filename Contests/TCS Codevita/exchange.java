import java.util.*;
public class exchange
{
    int min = 999999;static int x=0;
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int min;
      String m = ""+a,n=""+b;
      int len;
      if(m.length()>n.length())
        len = m.length();
      else
        len = n.length();
        exchange hi = new exchange();
        hi.permute(m,0,m.length()-1,n);
        /*
      int p[] = new int[m.length()];
      int q[] = new int[n.length()];
      int r[] = new int[len];
      
      for(int i=0;i<m.length();i++)
        p[i] = (int)(m.charAt(i));
      
      for(int i=0;i<n.length();i++)
        q[i] = (int)(n.charAt(i));
      
      for(int i=0;i<len;i++)
        r[i] = p[i] - q[i];
      
        int maxneg = 0,index = 0;
      for(int i=0;i<len;i++)
      {
          if(r[i]<0)
          index = i-1;
      }  
      for(int i=0;i<len;i++)
      {
          if(r[i]<0 && maxneg < r[i])
          maxneg = r[i];
          System.out.println(r[i]);
      }
      System.out.println(maxneg+"  "+index);
    }*/
    if(x!=0)
    System.out.println(x);
    else
    System.out.println(-1);
}
    private void permute(String str, int l, int r,String str1) 
    { 
        if (l == r) 
        {
            int a = Integer.parseInt(str);
            int b = Integer.parseInt(str1);
            if(a>b)
            {
                if(min > (a-b))
                {
                    min = (a-b);
                    x = a;
                }
                
            }
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r,str1); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}
      