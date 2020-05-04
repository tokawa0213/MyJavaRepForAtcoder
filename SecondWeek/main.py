from math import sqrt

_ = int(input())
count = 0
l = list(map(int,input().split()))
for i in range(len(l)):
    for j in range(i+1,min(len(l),i+1+max(l)-min(l))):
        if(j-i == l[i]+l[j]):
            count += 1
print(count)