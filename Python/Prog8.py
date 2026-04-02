a=[]
for i in range(5):
    b=int(input("Enter Array Values "))
    a.append(b)
s=0
for i in range(len(a)):
    s=s+a[i]
print(s)