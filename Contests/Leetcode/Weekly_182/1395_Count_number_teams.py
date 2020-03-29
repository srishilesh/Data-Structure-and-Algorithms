// https://leetcode.com/problems/count-number-of-teams/

// MY APPROACH

class Solution:
    def numTeams(self, rating: List[int]) -> int:
        n = len(rating)
        index = [i for i in range(1,n+1)]
        count = 0
        for i in range(0,n):
            for j in range(i+1,n):
                for k in range(j+1,n):
                    if((i<j and j<k)and((rating[i]<rating[j] and rating[j]<rating[k]) or (rating[i]>rating[j] and rating[j]>rating[k]))):
                       count+=1
        return count
        
