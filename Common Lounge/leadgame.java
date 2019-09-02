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
            
/*  
PROBLEM:
At the end of each round the leader and her current lead are calculated. Once all the rounds are over the player who had the maximum lead at the end of any round in the game is declared the winner.

EXPLANATION:
Create two arrays(Player1-Stores the scores of player 1 in all the rounds)[a1,a2,a3…an] and (Player2-Stores the scores of player 2 in all the rounds)[b1,b2,b3…bn].

Create a third array “Lead” such that the i’th element of Lead is ((a1+a2…+ai) - (b1+b2…bi)).
Create a fourth array “modulus lead” such that the i’th element of this array is the modulus of the i’th element of “Lead”.

Find the maximum element of “modulus lead”.This is the maximum lead attained by the winner.If the element in the corresponding position of “lead” is positive then player 1 is the winner,otherwise player 2 is.
*/
