a=[]
print("Enter Array Values")
for i in range(5):
    b=int(input())
    a.append(b)
c=int(input("Enter Number To Find"))
for i in range(len(a)):
    if c==a[i]:
        print("Found Number at Index",i)
        key=True
if key!=True:
    print("Not Found")