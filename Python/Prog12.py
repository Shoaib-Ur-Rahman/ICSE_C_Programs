a=[]
print("Array Values")
for i in range(5):
    b=int(input())
    a.append(b)
n=int(input("Which Number's Frequency To Be Measured"))
f=0
for i in range(len(a)):
    if n==a[i]:
        f+=1
print(f"Number Of Times {n} comes in array is {f}")