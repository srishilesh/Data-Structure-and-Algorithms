// https://www.codechef.com/problems/VOTERS

import java.util.*;
class voterlist
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        voterlist ob = new voterlist();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int a[]= new int[n1];
        int b[]= new int[n2];
        int c[]= new int[n3];
        for(int i=0;i<n1;i++)
        a[i] = sc.nextInt();
        for(int i=0;i<n2;i++)
        b[i] = sc.nextInt();        
        for(int i=0;i<n3;i++)
        c[i] = sc.nextInt();  
        int i=0,j=0,k=0,x=0,y=0,z=0,count = 0,min;String s="";
        while((i<n1)||(j<n2)||(k<n3))
        {
            if(i<n1)
            x = a[i];
            if(j<n2)
            y = b[j];
            if(k<n3)
            z = c[k];
            min = x;
            if(min>y)
            min = y;
            if(min>z)
            min = z;
                    
            count = 0;
            if(min == x){count++;i++;}
            if(min == y){count++;j++;}
            if(min == z){count++;k++;}
            
            if(count >= 2)
            System.out.println(min);
        }
            
                    

            
        }
    }

//SOLUTION
// Let the arrays be a, b, c, and the positions be i, j, and k
 /*
i, j, k = 0 // positions initialized to zero
 
while (i < size(a) or j < size(b) or k < size(c))
    // get the current elements 
    current_a = a[i] if i < a.size() else NIL
    current_b = b[j] if j < b.size() else NIL
    current_c = c[k] if k < c.size() else NIL
    
    // deal with the smallest value is this step 
    min_value = min(current_a, current_b, current_c)
    count = 0 
    
    // count the number of times value appears
    // and increment position in respective array
    if min_value == current_a: count += 1, i += 1
    if min_value == current_b: count += 1, j += 1
    if min_value == current_c: count += 1, k += 1
    
    // print if count >= 2 
    if count >= 2: print min_value 
end while
*/















/*
import java.util.*;
class voterlist
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int a[]= new int[n1+n2+n3];
        int temp;
        //a[0] = sc.nextInt();
        int l = (n1+n2+n3);
        for(int i=0;i<l;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(a[i]>a[j])
                {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                
            }
            
        }
        //for(int i=0;i<l;i++)
        //System.out.print(a[i]+" ");
        int count = 1,tot=0;String s = "";
        for(int i=0;i<l;i++)
        {
            count = 1;
            for(int j=i+1;j<l;j++)
            {
                if((a[i] == a[j]))
                count++;
            }
            if(count>=2 && (s.contains(a[i]+"")==false))
            {s = s+a[i]+"\n"; 
               tot++;}
            
        }
        System.out.println(tot+"\n"+s);
    }
}
  /*import java.util.*;
class voterlist
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int a[] =new int[n1];
        int b[] =new int[n2];
        int c[] = new int[n3];
        
        String asa[] =new String[n1];
        String bsa[] =new String[n2];
        String as="",bs="",cs="";
        int temp;
        a[0] = sc.nextInt();
        as = as+a[0]+",";
        asa[0] = a[0]+"";
        for(int i=1;i<n1;i++)
        {
            temp = sc.nextInt();
            if(temp>a[i-1])
            a[i] = temp;
            else
            {
                a[i] = a[i-1];
                a[i-1] = temp;
                temp = a[i];
            }
            as = as+ a[i]+",";
            asa[i] = a[i]+"";
        }
        b[0] = sc.nextInt();
        bs = bs+b[0]+",";
        bsa[0] = b[0]+"";
        for(int i=1;i<n2;i++)
        {
            temp = sc.nextInt();
            if(temp>b[i-1])
            b[i] = temp;
            else
            {
                b[i] = b[i-1];
                b[i-1] = temp;
                temp = b[i];
            }
            bs = bs+ b[i]+",";
            bsa[i] = b[i]+"";
        }
        c[0] = sc.nextInt();
        cs = cs + a[0]+",";
        for(int i=1;i<n3;i++)
        {
            temp = sc.nextInt();
            if(temp>c[i-1])
            c[i] = temp;
            else
            {
                c[i] = c[i-1];
                c[i-1] = temp;
                temp = c[i];
            }
            cs = cs+ c[i]+",";
        }
        int count = 1,tot = 0;String s="";
        for(int i=0;i<n1;i++)
        {
            count = 1;
            /*for(int j=0;j<n2;j++)
            {
                if(a[i] == b[j])
                count++;
            }
            for(int k=0;k<n3;k++)
            {
                if(a[i] == c[k])
                count++;
                    
            }*/
            /*
            if(bs.contains(asa[i]))
            count++;
            if(cs.contains(asa[i]))
            count++;
            if(count>=2)
            {
                s = s+asa[i]+"\n";
                tot++;
            }
            
        }
        for(int i=0;i<n2;i++)
        {
            count = 1;
            if(cs.contains(bsa[i]) && (as.contains(bsa[i])==false))
            count++;
            if(count>=2)
            {
                s = s+bsa[i]+"\n";
                tot++;
            }
        }
        System.out.println(tot+"\n"+s);
    }
}
*/    

