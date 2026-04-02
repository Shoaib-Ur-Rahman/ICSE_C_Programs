a=[]
for i in range(3):
    b=int(input())
    a.append(b)
e=0
for i in range(3):
    if a[i]%2==0:
        e+=1
print(e)