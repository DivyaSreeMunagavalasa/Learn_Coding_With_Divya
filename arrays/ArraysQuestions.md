## Array Problems:

### Problem Statement - 1: 

#### Find the Largest element in an array

Explanation: Given an array, we have to find the largest element in the array.

Example:

Input: arr[] = {2,5,1,3,0};

Output: 5

As 5 is the largest element in the array.

### Problem Statement - 2: 

#### Find Second Smallest and Second Largest Element in an array

Explanation: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Example :

Input: [1,2,4,7,7,5]

Output:

Second Smallest : 2

Second Largest : 5

### Problem Statement - 3: 

#### Check if an Array is Sorted

Explanation: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Note: Two consecutive equal values are considered to be sorted.

Example :

Input: N = 5, array[] = {1,2,3,4,5}

Output : True.

As the given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

### Problem Statement - 4: 

#### Check if an Array is Sorted and Rotated

Explanation : Given an array, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

Note: There may be duplicates in the original array.

Example :

Input: N = 5, array[] = {3,4,5,1,2}

Output : True.

{1,2,3,4,5} is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: {3,4,5,1,2}.

### Problem Statement - 5:

#### Remove Duplicates in place from Sorted Array

Explanation : Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

Example 1:

Input: arr[1,1,2,2,2,3,3]

Output: arr[1,2,3,_,_,_,_]

Explanation:
Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.


