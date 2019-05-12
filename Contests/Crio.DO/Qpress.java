It is not doing good financially right now. So they only use lowercase alphabets for printing as a cost saving measure. Some of its alphabets are broken. As they could not afford replacement, they use numbers are replacements when possible.

Here is how they performed replacements-

'o' is replaced with '0'
'l' is replaced with '1'
'z' is replaced with '2'
's' is replaced with '5'
You are given

1) few pages of text printed by this press

2) a list of string patterns(contains only lower case alphabets)

You need to count the occurences of the string patterns in the printed text and print them.

Input Format

n

line 1

line 2

...

line n

m

string pattern 1

string pattern 2

...

string pattern m

Constraints

None

Output Format

Output occurence of each string pattern in a new line

Sample Input 0

2
hell0! me t0o0.
this is 1ine tw0.
6
o
too
hello
two
line
oo
Sample Output 0

5
1
1
1
1
2
Explanation 0

Input explanation

Original text lines are these

hello! me tooo.

this is line two.

Line 1) In hello 'o' is broken and tooo 2 'o' are broken

Line 2) In word line 'l' is broken and in word two 'o' is broken

So press replaced these lines with equivalent letters.

Output explanation

6 # the pattern "o" appeared 6 times in the original text

1 # pattern "too" appeared 1 time in the original text

1 # pattern "hello" appeared 1 time in the original text

1 # pattern "two" appeared 1 time in the original text

1 # pattern "line" appeared 1 time in the original text

2 # pattern "oo" appeared 1 time in the original text








import java.io.*;
import java.util.*;




public class crio_press {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String s[]=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
            //System.out.println(s[i]);
        }
        int m= sc.nextInt();
        String a[]=new String[m];
        sc.nextLine();
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextLine();//System.out.println(a[i]);
        }
        char ch,ch1;
        String str="";
        //str="";
        for(int i=0;i<n;i++)
        {
            //str[i]=""+s[i].charAt(0);
            for(int j=0;j<s[i].length();j++)
            {
                
                ch=s[i].charAt(j);
                if(ch=='0')
                    ch1='o';
                else if(ch == '1')
                    ch1='l';
                else if(ch=='2')
                    ch1='z';
                else if(ch == '5') 
                    ch1='s';
                else
                    ch1=ch;
                str=str+ch1;
                    
            }
            str = str+" ";
            
        }
        //System.out.println(a[0]);
        String p[]=str.split(" ");
        int count;
        for(int i=0;i<m;i++)
        {
        	count=0;
        	for(int j=0;j<p.length;j++)
        	{
        		//System.out.println("p[i] "+p[j]+" a[i] "+a[i]);
        		if(a[i].length()==1)
        		{
        			if(p[j].contains(a[i]))
        				count++;
        			continue;
        		}
        		if(p[j].equals(a[i]))
        			{count++;
        			break;}
        		for(int k=0;k<(p[j].length()-a[i].length());k++)
        		{
        			if(p[j].substring(k, k+a[i].length()).equals(a[i]))
        			{
        			count++;
        			}
        		}
        	}
        	System.out.println(count);
        }
        
    }
}
