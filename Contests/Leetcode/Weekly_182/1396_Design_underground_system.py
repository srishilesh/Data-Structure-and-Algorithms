// https://leetcode.com/problems/design-underground-system/

// MY APPROACH

class UndergroundSystem:

    def __init__(self):
        self.inidcard = []
        self.outidcard = []
        self.checkin = []
        self.checkout = []
        self.intime = []
        self.outtime = []
        self.diction = {}
        #self.dictioncount = {}

    def checkIn(self, id: int, stationName: str, t: int) -> None:
        self.inidcard.append(id)
        self.checkin.append(stationName)
        self.intime.append(t)

    def checkOut(self, id: int, stationName: str, t: int) -> None:
        self.outidcard.append(id)
        self.checkout.append(stationName)
        self.outtime.append(t)
        

    def getAverageTime(self, startStation: str, endStation: str) -> float:
        time = 0
        c = 0
        s = startStation+endStation
        # if s=='NOQJ7YG4OT11Q6XT':
        #     print('Hello')
        # print(self.intime)
        # print(self.outtime)

        while(startStation in self.checkin and endStation in self.checkout):
            c+=1
            
            a = self.checkin.index(startStation)
            del self.checkin[a]
            b = self.checkout.index(endStation)
            del self.checkout[b]
            
            inside = self.intime[a] 
            self.intime.pop(a)
            outside = self.outtime[b] 
            self.outtime.pop(b)
            time = (outside-inside)
            #print(time)
            if s not in self.diction:
                
                self.diction[s] = time
                #self.dictioncount[s] = 1
            else:
                self.diction[s]+=time
                #self.dictioncount[s]+=1
                self.diction[s]/=2
                # break
        
        return float(int(self.diction[s]))
        # except:
        #     return -1


# Your UndergroundSystem object will be instantiated and called as such:
# obj = UndergroundSystem()
# obj.checkIn(id,stationName,t)
# obj.checkOut(id,stationName,t)
# param_3 = obj.getAverageTime(startStation,endStation)
