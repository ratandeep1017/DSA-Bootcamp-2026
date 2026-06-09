Java has a **very powerful Collections framework** in `java.util` that gives you many ready-to-use data structures for DSA problems. Here are the most useful ones, grouped by what they help you do:

## 1. Dynamic Lists (like ArrayList)

| Class | Best for |
|-------|----------|
| `ArrayList<E>` | Fast random access, dynamic arrays [11][12] |
| `LinkedList<E>` | Fast insert/delete at ends, can be used as queue/stack [11][13] |
| `Vector<E>` | Legacy resizable array (rarely used in modern DSA) |

## 2. Hashing (Maps & Sets)

| Class | Use case |
|-------|----------|
| `HashMap<K,V>` | Frequency counting, two-sum, memoization, O(1) average lookup [2] |
| `HashSet<E>` | Check existence, remove duplicates, O(1) average lookup [11][2] |
| `TreeMap<K,V>` | Sorted map, range queries, floor/ceil operations [11] |
| `TreeSet<E>` | Sorted unique elements, find next/previous element [11] |
| `LinkedHashMap<K,V>` | Maintain insertion order (LRU cache pattern) |

## 3. Stacks & Queues

| Class | Use case |
|-------|----------|
| `Stack<E>` | Legacy stack (use `Deque` instead) |
| `Deque<E>` (implement as `ArrayDeque`) | Modern stack/queue, push/pop at both ends [11] |
| `ArrayDeque<E>` | Faster than `LinkedList` for queue/stack operations [11] |
| `PriorityQueue<E>` | Heaps, greedy problems, K-th largest/smallest [11][2] |

## 4. Sorted Collections

| Class | Use case |
|-------|----------|
| `TreeMap<K,V>` | Key-sorted map, auto-sorting, range queries [11] |
| `TreeSet<E>` | Key-sorted set, auto-sorting, unique elements [11] |
| `Collections.sort(list)` | Sort any list [11] |

## 5. Utility Classes (not containers but very useful)

| Class | Use case |
|-------|----------|
| `Collections` | `sort()`, `reverse()`, `shuffle()`, `max()`, `min()` [11][14] |
| `Arrays` | `sort()`, `binarySearch()`, `fill()` for primitive arrays |
| `Comparator` | Custom sorting logic |
| `Collections.reverseOrder()` | Descending order sorting |

## 6. Specialized for DSA

| Class | DSA pattern |
|-------|-------------|
| `PriorityQueue` | Heaps, top-K elements, Dijkstra, BFS with priority [11][2] |
| `HashMap` | Frequency arrays, two-sum, sliding window, memoization [2] |
| `HashSet` | Duplicate detection, cycle detection, visited sets [11][2] |
| `TreeSet` | Maintaining sorted order, finding k-th element |
| `LinkedList` | Doubly linked list problems, queue implementation [11] |
| `ArrayDeque` | Sliding window, BFS queue, stack |

## Quick cheat sheet for common DSA patterns

| Pattern | Best Java class |
|---------|---------------|
| Frequency counting | `HashMap` |
| Two-sum / lookup | `HashSet` |
| Stack | `ArrayDeque` or `ArrayList` |
| Queue / BFS | `ArrayDeque` or `LinkedList` |
| Heap / Priority | `PriorityQueue` |
| Sorted unique elements | `TreeSet` |
| Range queries on keys | `TreeMap` |
| LRU cache pattern | `LinkedHashMap` |
| General list | `ArrayList` |

## Example: Most useful for competitive coding

For **DSA exams and coding interviews**, these 6 are the most important:

1. `ArrayList` - dynamic arrays
2. `HashMap` - frequency, memoization, lookup
3. `HashSet` - duplicates, visited tracking
4. `PriorityQueue` - heaps, greedy
5. `ArrayDeque` - stack/queue
6. `TreeSet/TreeMap` - sorted operations

They're all in `java.util`, so you just need:

```java
import java.util.*;
```

