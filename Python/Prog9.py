a=[]
for i in range(5):
    b=int(input("Enter Array Value "))
    a.append(b)
m=a[0]
for n in range(1,5):
    if m<a[n]:
        m=a[n]
print("max", m)