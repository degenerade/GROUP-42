from functools import reduce

numbers = [1, 2, 3, 4, 5]

#One pipeline shortens the code; loops and lists will take longer to write.
result = reduce(lambda a, b: a + b,
                filter(lambda x: x > 5,
                       map(lambda x: x * 2, numbers)))
print(result)  # 24
