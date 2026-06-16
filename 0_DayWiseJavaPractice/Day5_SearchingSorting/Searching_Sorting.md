# Searching Algorithms

#### Linear / Sequential Search
- Works on any array, sorted or unsorted.
- Checks each element from the start until it finds the target.
- Time complexity: O(n) in the worst and average cases.
- Use when the dataset is small or unsorted.

Example:
- `LinearSearch.linearSearch(int[] arr, int target)` returns the first index where the target appears.
- If the element is not found, it returns `-1`.

#### Binary Search
- Works only on sorted arrays.
- Repeatedly divides the search interval in half.
- Compares the target with the middle element, then continues in the left or right half.
- Time complexity: O(log n).
- Faster than linear search for large sorted datasets.

Example methods:
- `BinarySearch.binarySearch(int[] arr, int target)` returns the index of the target if present, otherwise `-1`.
- `BinarySearch.findInsertionPosition(int[] arr, int target)` returns the position where the target should be inserted to maintain sorted order.

#### Finding the Correct Position
- Binary search can also find the correct insertion point when the target is missing.
- Use a variant that narrows the search to the smallest index where `arr[index] >= target`.
- This is useful for insertion into sorted arrays.

#### Finding First and Last Occurrence
- Finding the first or last occurrence of a target in a sorted array is a specialized binary search variation.
- To find the first occurrence, search left when the target is found, keeping the current match.
- To find the last occurrence, search right in a similar way.

# Sorting Algorithms

### Bubble Sort
- Repeatedly compares adjacent elements and swaps them if they are in the wrong order.
- After each pass, the largest unsorted element "bubbles" to the end.
- Best case: O(n) when the array is already sorted and no swaps are needed.
- Average and worst case: O(n²).
- Simple to implement but inefficient for large arrays.

### Insertion Sort
- Builds the sorted array one element at a time.
- At each step, takes the next element and inserts it into the correct sorted position among previous elements.
- Best case: O(n) when the array is already sorted.
- Average and worst case: O(n²).
- Efficient for small or nearly sorted arrays.

### Selection Sort
- Divides the array into sorted and unsorted segments.
- Finds the minimum element from the unsorted segment and swaps it into the next sorted position.
- Time complexity is O(n²) in best, average, and worst cases.
- Performs fewer swaps than bubble sort but still has poor time complexity.

### Merge Sort
- A divide-and-conquer algorithm.
- Splits the array into halves, recursively sorts each half, then merges the sorted halves.
- Time complexity is O(n log n) for best, average, and worst cases.
- Requires extra space for the merged arrays.
- Good for large arrays and stable sorting.

## Comparison of Sorting Algorithms

| Algorithm      | Best Case | Average Case | Worst Case | Space | Stable | Notes |
|----------------|-----------|--------------|------------|-------|--------|-------|
| Bubble Sort    | O(n)      | O(n²)        | O(n²)      | O(1)  | Yes    | Simple; optimized version stops early if sorted |
| Insertion Sort | O(n)      | O(n²)        | O(n²)      | O(1)  | Yes    | Good for nearly sorted arrays |
| Selection Sort | O(n²)     | O(n²)        | O(n²)      | O(1)  | No     | Minimal swaps compared to bubble sort |
| Merge Sort     | O(n log n) | O(n log n) | O(n log n) | O(n)  | Yes    | Efficient for large datasets; uses extra memory |

## How They Work

### When to Use Linear Search
- Use linear search when the array is unsorted or very small.
- It is the simplest search algorithm.
- If the array is sorted, binary search is almost always better for large arrays.

### When to Use Binary Search
- Use binary search only on sorted arrays.
- It is much faster than linear search for large datasets because it cuts the search range in half each step.
- Not suitable for unsorted arrays unless you sort first.

### Sorting Choice Guidance
- Use bubble sort, insertion sort, or selection sort for learning and very small inputs.
- Use merge sort for larger arrays because of its O(n log n) performance.
- Insertion sort is often the best choice for small or nearly sorted arrays.

## Summary
- Searching: linear search is simple but slow for long arrays; binary search is fast but requires sorted data.
- Sorting: bubble, insertion, and selection are easy to implement but have O(n²) cost; merge sort is the best choice for larger arrays because it runs in O(n log n).
