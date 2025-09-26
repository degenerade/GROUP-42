numbers = [1, 2, 3, 4, 5]

#we first double each number
doubled = []
for n in numbers:
    doubled.append(n * 2)

#we then keep only numbers greater than 5
filtered = []
for n in doubled:
    if n > 5:
        filtered.append(n)

#and sum them up
total = 0
for n in filtered:
    total += n

print(total)  # 24
