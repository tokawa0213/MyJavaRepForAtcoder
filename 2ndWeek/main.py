from copy import deepcopy

def move(A,now):
    return A[now-1]

N, K = map(int,input().split())
A = list(map(int,input().split()))
now = 1
dp  = [deepcopy([0 for _ in range(N)]) for _ in range(N)]
history = []
count = 0
while True:
    history.append(now)
    next_pos = move(A,now)
    if dp[now-1][next_pos-1] == 0:
        dp[now-1][next_pos-1] = 1
    else:
        remainder_array = history[history.index(next_pos):]
        print(remainder_array[(K - history.index(next_pos))%len(remainder_array)])
        break
    if count == K:
        print(now)
        break
    now = next_pos
