a=[]
for i in range(2):
    b=int(input())
    a.append(b)
for r in range(len(a)-1,-1,-1):
    print(a[r])
s=0
for i in range(len(a)):
    if a[i]%2==0:
        s=s+a[i]
print(f"Sum Of Even Numbers= {s}")