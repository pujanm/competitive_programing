class MinStack:

    def __init__(self):
        self.stack = []
        self.minstack = []

    def push(self, x: int):
        
        self.stack.append(x)
        
        if self.minstack != []:
            if x <= self.minstack[len(self.minstack) - 1]:
              self.minstack.append(x)

        else:
            self.minstack.append(x)
        

    def pop(self):
        
        n = len(self.stack)
        
        if n != 0:
            
            el = self.stack[n-1]
            
            if el == self.minstack[len(self.minstack) - 1]:

                del self.minstack[len(self.minstack) - 1]

            del self.stack[n-1]
    
    def top(self):
        
        n = len(self.stack)
        
        return self.stack[n-1]

    def getMin(self):
        
        if self.minstack != []:

            return self.minstack[len(self.minstack) - 1]

    def disp(self):

        print(self.stack)
        print(self.minstack)

s = MinStack()

s.push(1)
s.push(2)

print(s.top())


print(s.getMin())
s.pop()


print(s.getMin())
print(s.top())

