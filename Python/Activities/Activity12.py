	
def returnSum(num):
  if num:
    # Recursive function call
    return num + returnSum(num-1)
  else:
    return 0
 
# Call calculateSum() function
sum = returnSum(10)
 

print(sum)