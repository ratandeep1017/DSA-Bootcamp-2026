
- Subarrays + Kadane
- Sliding Window
- Prefix Sum
- Two Pointers
- Hashing basics


### Step 2: Important Problems (4–5 hours)
- Kadane’s Algorithm (Max Subarray Sum)
- Sliding Window (Max sum of size K)
- Subarray with given sum
- Majority Element (Boyer-Moore)
- Pair with given sum (Two pointers + HashSet)
- Dutch National Flag (0,1,2 sort)
- Trapping Rain Water
- Stock Buy & Sell

***

### Step 3: Mixed Practice (2–3 hours)
- Equilibrium point
- Product array except self
- Peak element
- Chocolate distribution

***

## Code Templates (Java)

### 1. Kadane’s Algorithm
```java
int maxSubarraySum(int[] arr) {
    int maxSum = arr[0];
    int currSum = arr[0];
    for (int i = 1; i < arr.length; i++) {
        currSum = Math.max(arr[i], currSum + arr[i]);
        maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
}
```

***

### 2. Sliding Window (Size K)
```java
int maxSumK(int[] arr, int k) {
    int sum = 0;
    for (int i = 0; i < k; i++) sum += arr[i];
    int maxSum = sum;
    for (int i = k; i < arr.length; i++) {
        sum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
}
```

***

### 3. Prefix Sum
```java
int[] prefixSum(int[] arr) {
    int n = arr.length;
    int[] prefix = new int[n];
    prefix[0] = arr[0];
    for (int i = 1; i < n; i++)
        prefix[i] = prefix[i - 1] + arr[i];
    return prefix;
}
```

***

### 4. Two Pointers (Pair Sum in Sorted Array)
```java
boolean hasPair(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) return true;
        else if (sum < target) left++;
        else right--;
    }
    return false;
}
```

***

### 5. Boyer-Moore (Majority Element)
```java
int majorityElement(int[] arr) {
    int candidate = 0, count = 0;
    for (int num : arr) {
        if (count == 0) candidate = num;
        count += (num == candidate) ? 1 : -1;
    }
    return candidate;
}
```

***

### 6. Dutch National Flag (0,1,2)
```java
void sort012(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;
    while (mid <= high) {
        if (arr[mid] == 0) swap(arr, low++, mid++);
        else if (arr[mid] == 1) mid++;
        else swap(arr, mid, high--);
    }
}
```

***

### 7. Trapping Rain Water (Two Pointer)
```java
int trap(int[] height) {
    int left = 0, right = height.length - 1;
    int leftMax = 0, rightMax = 0, water = 0;
    while (left < right) {
        if (height[left] < height[right]) {
            if (height[left] >= leftMax) leftMax = height[left];
            else water += leftMax - height[left];
            left++;
        } else {
            if (height[right] >= rightMax) rightMax = height[right];
            else water += rightMax - height[right];
            right--;
        }
    }
    return water;
}
```

***

## Pattern Recognition Shortcut (Very Important)

In exam, think like this:

- “Contiguous + sum” → Kadane / Prefix / Sliding Window  
- “Fixed size k” → Sliding Window  
- “Sorted array” → Two pointers  
- “Frequency / count” → Hashing  
- “Rearrangement” → Partitioning  
- “Max profit / min diff” → Greedy  