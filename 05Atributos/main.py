class A:
    vc = 0

    def __init__(self, v):
        self.v = v
        

    def __str__(self):
        return f'{self.v}'
    
a1 = A(1)
a2 = A(2)

print(a1)
print(a2)
print(A.vc)