# https://leetcode.com/problems/bulls-and-cows

'''
You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. 

Please note that both secret number and friend's guess may contain duplicate digits.

Example 1:

Input: secret = "1807", guess = "7810"

Output: "1A3B"

Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
Example 2:

Input: secret = "1123", guess = "0111"

Output: "1A1B"

Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
Note: You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
'''

import collections
class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        bull = 0
        cow = 0
        secret = list(secret)
        guess = list(guess)
        i = 0
        k = 0
        while i<(len(secret)):
            if(secret[i]==guess[i]):
                bull+=1
                del secret[i]
                del guess[i]
                i-=1
            #print(secret)
            i+=1
        # i = 0
        # while i<len(secret):
        #     if secret[i] in guess:
        #         cow+=1
        #         del secret[i]
        #         guess.pop(i)
        #         i-=1
        #     i+=1
        sec = collections.Counter(secret)
        gue = collections.Counter(guess)
        for i in sec:
            if i in gue:
                if sec[i]==gue[i]:
                    cow+=sec[i]
                else:
                    cow+=min(gue[i],sec[i])
        fin = str(bull)+"A"+str(cow)+"B"
        return fin
