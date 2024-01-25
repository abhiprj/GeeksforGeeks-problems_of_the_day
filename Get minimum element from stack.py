class stack:
    def __init__(self):
        self.s=[]
        self.temp=[]
        self.minEle=None

    def push(self,x):
        #CODE HERE
        if len(self.temp)==0 or x<=self.temp[-1]:
            self.temp.append(x)
        self.s.append(x)
        

    def pop(self):
        #CODE HERE
        if not self.s:
            return -1
        if self.s[-1]==self.temp[-1]:
            self.temp.pop(-1)
        return self.s.pop(-1)
        

    def getMin(self):
        #CODE HERE
        if not self.temp:
            return -1
        return self.temp[-1]