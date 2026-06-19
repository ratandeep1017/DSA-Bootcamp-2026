

## 1. Subarrays & Kadane’s Pattern
Focus: Working with **contiguous segments**

- What is a subarray (continuous elements).
- Kadane’s Algorithm → max sum subarray in \(O(n)\).
- Variations:
  - Maximum subarray sum.
  - Maximum difference (convert to Kadane-like).
  - Even-odd subarray (pattern-based extension).

Example:
- Instead of checking all subarrays \(O(n^2)\), Kadane keeps a running sum:
  \( \text{currentSum} = \max(arr[i], currentSum + arr[i]) \)

***

## 2. Sliding Window Technique
Focus: Fixed or variable window over array

- Fixed window size \(k\):
  - Max/min sum of subarray of size \(k\).
- Variable window:
  - Subarray with given sum.
- Optimization idea:
  - Remove left element, add right element → \(O(n)\)

Example:
- Instead of recalculating sum every time:
  \( \text{windowSum} = \text{windowSum} - arr[i-k] + arr[i] \)

***

## 3. Prefix Sum Technique
Focus: Preprocessing for fast range queries

- Build prefix array:
  \( prefix[i] = arr + arr + ... + arr[i] \)
- Query any subarray sum:
  \( sum(l,r) = prefix[r] - prefix[l-1] \)

Use cases:
- Subarray sum queries.
- Equilibrium point (left sum = right sum).

***

## 4. Majority & Frequency (Hashing / Boyer-Moore)
Focus: Counting efficiently

- Majority element (> \(n/2\)) → Boyer-Moore Voting.
- Elements > \(n/k\).
- Pair sum problems → HashSet or Map.

Key idea:
- Trade space for time using hashing.

***

## 5. Two Pointer Technique
Focus: Sorted arrays or opposite ends

- Pair with given sum.
- Triplet sum.
- Union & intersection of sorted arrays.

Pattern:
- Start with two indices:
  - Left = 0, Right = n-1
  - Move based on condition.

***

## 6. Partitioning & Rearrangement
Focus: Rearranging elements efficiently

- Dutch National Flag (0,1,2 sorting).
- Rearrange positive/negative alternately.
- Left rotate array.

Key idea:
- In-place swapping, maintaining regions.

***

## 7. Greedy & Optimization Problems
Focus: Making optimal local decisions

- Stock buy & sell (maximize profit).
- Chocolate distribution (min difference).
- Maximum difference problem.

***

## 8. Advanced Array Patterns
Focus: Combining techniques

- Trapping Rain Water:
  - Prefix max + suffix max OR two pointers.
- Product array except self:
  - Prefix + suffix products (no division).
- Peak element:
  - Binary search optimization.

***

## How to Study Smartly
Instead of solving randomly:
- First learn concept → then solve 2–3 problems from it.
- Recognize pattern:
  - “Subarray + sum” → Prefix / Sliding Window
  - “Sorted array” → Two pointers
  - “Frequency” → Hashing
- Practice writing optimal \(O(n)\) solutions.
---
---
---

# NEETCODE ARRAYS

## Arrays & Hashing
### Easy
- [ ] Contains Duplicate
- [ ] Valid Anagram
- [ ] Two Sum
### Medium
- [ ] Group Anagrams
- [ ] Top K Frequent Elements
- [ ] Encode and Decode Strings
- [ ] Product of Array Except Self
- [ ] Valid Sudoku
- [ ] Longest Consecutive
---
## Two Pointers
### Easy
- [ ] Valid Palindrome
### Medium
- [ ] Two Sum II (Sorted)
- [ ] 3Sum
- [ ] Container With Most Water
### Hard
- [ ] Trapping Rain Water
---
## Sliding Window
### Easy
- [ ] Best Time to Buy and Sell Stock
### Medium
- [ ] Longest Substring Without Repeating
- [ ] Longest Repeating Character Replacement
- [ ] Permutation in String
### Hard
- [ ] Minimum Window Substring
- [ ] Sliding Window Maximum

---
---
---

## 3. Arrays – Basics & Elementary Operations
- [x] Print Fibonacci Sequence and Nth Term of Fibonacci Series
- [x] Print Numbers From 1 to N and N to 1 
- [x] Check if an Array Is Sorted  
- [x] Find the Second Largest Element in an Array  
- [x] Reverse an Array  
- [x] Remove All the Duplicate Elements From an Array  
- [x] Move All the Zeros to the End  
- [x] Find Leaders in an Array  
- [x] Find the Frequency in a Sorted and Unsorted Array 
- [x] find_delete_min_max

## 5. Arrays – Subarrays, Sliding Window, Prefix Sum
- [ ] Find the Maximum Consecutive 1's in a Binary Array  
- [ ] Find the Majority Element in an Array  
- [ ] Find the Maximum Subarray Sum (Kadane)
- [ ] Find the Maximum Difference 
- [ ] Left Rotate an Array by D Places 
- [ ] Find the Maximum or Minimum Sum of a Subarray of Size K
- [ ] Find a **Subarray** With a Given Sum Using the **Sliding Window** Technique  
- [ ] Find the Maximum Length **Even-Odd Subarray**  
- [ ] Find the Sum of Any Subarray Using the **Prefix Sum** Array   
- [ ] Find the Equilibrium Point  

## 6. Arrays – Two Pointers / Hashing / Misc Advanced
- [ ] Sort an Array Which Consists of Only 0, 1, and 2 Without Using Sorting  
- [ ] Find the Union and Intersection of Two Sorted Arrays  
- [ ] Find All Pairs in an Array Whose Sum Is Equal to a Given Number  
- [ ] Find All Elements That Appear More Than N/k Times in an Array  
- [ ] Find Common Elements in 3 Sorted Arrays  
- [ ] Solve the Chocolate Distribution Problem  
- [ ] Rearrange Positive and Negative Integers Alternatively in an Array  
- [ ] Create Another Array With the Product of All Elements Except the Ith Element  
- [ ] Find a Peak Element in an Array  
- [ ] Find if There Is a Pair With Sum X in a Sorted Array  
- [ ] Find a Triplet in a Sorted Array  
- [ ] Solve the Trapping Rain Water Problem  
- [ ] Find the Best Time to Buy and Sell Stock  
