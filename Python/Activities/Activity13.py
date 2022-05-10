	
def calculate_sum(numbers):
	sum = 0
	for num in numbers:
		sum += num
	return sum
 
numList = [1,2,3,4,5]
 
res = calculate_sum(numList)
 
print("Sum of all the elements is: ", res)
