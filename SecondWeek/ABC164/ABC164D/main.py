from collections import defaultdict

def my_trim(target,i):
    return target[len(target)-i:]

target = input()
rem = defaultdict(list)
for i in range(1,len(target)+1):
    rem[int(my_trim(target,i))%2019].append(int(my_trim(target,i)))
answer = 0
for i in range(2019):
    answer += int((len(rem[i])*(len(rem[i])-1))/2)
answer += len(rem[0])
print(answer)
#1817181712114
#14282668646