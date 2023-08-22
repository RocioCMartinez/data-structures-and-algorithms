# Assignment

Explain the quick sort algorithm.

## Code example from instructor (Rey Oliva)

class Main {
public static void main(String[] args) {
int[] unsortedArr = {5, 2, 1, 4, 0, 3};
System.out.println("unsorted array: " + java.util.Arrays.toString(unsortedArr));

    quickSort(unsortedArr, 0, unsortedArr.length - 1);

    System.out.println("sorted array: " + java.util.Arrays.toString(unsortedArr));
}

static void quickSort(int[] arr, int low, int high) {
if(low < high) {
int pivotLocation = partition(arr, low, high);
quickSort(arr, low, pivotLocation - 1);
quickSort(arr, pivotLocation + 1, high);
}
}

static int partition(int[] arr, int low, int high) {
int pivot = arr[high];
int leftwall = low;

    for(int i = low; i < high; i++) {
      if(arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[leftwall];
        arr[leftwall] = temp;
        leftwall+=1;
      }
    }

    int temp = arr[leftwall];
    arr[leftwall] = arr[high];
    arr[high] = temp;

    return leftwall;
}
}

## Steps

- Step 1: Set up
unsortedArr starts with values [8, 4, 23, 42, 16, 15] - gets printed in example above.

- Step 2: Invoke quickSort()
low - index (0)   and high - index (5)
low is less than high so quickSort continues

- Step 3: partition Function
The partition function is called
 The previous values apply: low - index (0)   and high - index (5)

- Step 4: Inside the partition()
The pivot value is set to the last element of array, 15
The leftwall variable is initialized to the value of low (0)

- Step 5: The partition loop
The loop iterates from i=0 to i=4 (high - 1) since the last element (15) is the pivot and doesn't need to be compared.
  The loop compares each element of the array to the pivot (15)
If the current element is less than or equal to the pivot, a swap occurs between the current element and the element at the leftwall
leftwall is incremented.

- Step 6: After the loop
  After the loop, the array may look like: [4, 8, 15, 42, 16, 23]
  The pivot (15) has been positioned correctly, and elements less than the pivot are on the left side, and elements greater than the pivot are on the right side.

- Step 7: Placing pivot in correct position
  The pivot (15) is swapped with the element at the leftwall index (which is 2 in this case)
  The array becomes: [4, 8, 15, 42, 16, 23]

- Step 8: Recursively call quickSort
  The quickSort function is called recursively on the left sub-array [4, 8] and the right sub-array [42, 16, 23].

- Step 9: Recursion on left sub-array
  The left sub-array [4, 8] is already sorted, so no further recursion is needed for this sub-array.

- Step 10: Recursion on right sub-array
  The quickSort function is called on the right sub-array [42, 16, 23]

- Step 11: partition on right sub-array
  The partition function is called on the right sub-array with low index (0) and high index (2)

- Step 12: partition loop on right sub-array
  The partitioning loop runs on the right sub-array: [42, 16, 23]
  After the loop, the array may look like: [16, 23, 42]

- Step 13: Adjusting pivot on right sub-array
  The pivot (42) is swapped with the element at the leftwall index (which is 2 in this case)
  The array becomes: [16, 23, 42]

- Step 14: Recursively calling quickSort on right sub-array
  The quickSort function is called recursively on the left sub-array [16, 23] (already sorted) and the right sub-array [42]

- Step 15: Result
  All recursive calls are completed, and the sorting process is finished
  The sorted array is printed: sorted array: [4, 8, 15, 16, 23, 42]



### Big-O
O(n2)



### Resources

Quick Sort in 4 Minutes by Michael Sambol
Replit code by Rey Oliva
ChatGPT
