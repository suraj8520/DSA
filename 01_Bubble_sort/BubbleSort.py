
## * map(function, iterable) -> since int is a function so for each element int will be called with that element as argument.
## * like the map in java
## * and then convert it back to list.
arr = list(map(int, input("Enter the numbers(Space separated): \n").split(" ")))

def bubble_sort(arr):
    for i in range(0, len(arr)-1):
        for j in range(0, len(arr)-i-1):
            if(arr[j] > arr[j+1]):
                ##* this is the way to swap elements in python
                arr[j], arr[j+1] = arr[j+1], arr[j]

print(arr)
bubble_sort(arr)
print(arr)

##** a tuple is ordered collection of elements in python
##** like list it can contain diff types and can be accessed by index.
##** but the above method that is being used to swap is quite similar to javascript rest or spread operator method.
##** we are unpacking the tuple and storing it in variable.
##** in javascript we were destructuring objects like this.
##** const { name, age } = person;
##** similarly we are unpacking tuples