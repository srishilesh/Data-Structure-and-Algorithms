//- Maximum Remaining Problem Code: MAXREM

n = int(input())

A = list(set(map(int, input().strip().split())))
sorted_A = sorted(A)
max_module = 0

for i in range(len(A) - 1):
    max_module = max(max_module, sorted_A[i] % sorted_A[i+1])

print(max_module)

