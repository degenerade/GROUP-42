numbers = [1, 2, 3, 4, 5]

#Here, map takes a function as input and applies it to each element
doubled = list(map(lambda x: x * 2, numbers))
print(doubled)  # [2, 4, 6, 8, 10]

#Here, filter keeps elements that satisfy a condition
evens = list(filter(lambda x: x % 2 == 0, numbers))
print(evens)  # [2, 4]

#Here, reduce combines elements using a binary function
from functools import reduce
total = reduce(lambda a, b: a + b, numbers)
print(total)  # 15
