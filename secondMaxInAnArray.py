def second_max(array):
    array.sort(reverse=True)
    return array[1]

n = int(input())
array = []

for _ in range (n):
    array.append(int(input()))

print(second_max(array))