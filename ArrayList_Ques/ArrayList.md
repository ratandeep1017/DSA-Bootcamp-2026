#### Setup (Import & Create)
```java
import java.util.ArrayList;
ArrayList<String>  list = new ArrayList<>();
ArrayList<Integer> list = new ArrayList<>();
```
#### 1. `add(data)`
Adds an element to the end, or at a specific index. 
```java
list.add("Apple");           // adds at end
list.add(1, "Banana");       // adds at index 1
// [Apple, Banana]
```
#### 2. `addAll(listName)`
Adds all elements of another collection. 
```java
ArrayList<String>  list2 = new ArrayList<>();
list2.add("Mango");
list2.add("Grapes");

ArrayList<String> list = new ArrayList<>();
list.addAll(list2);         // adds all from list2
list.addAll(1, list2);      // adds at specific index
```
#### 3. `get(index)`
Returns the element at a specific index. 
```java
String fruit = list.get(0);  // returns "Apple"
System.out.println(fruit);
```
#### 4. `set(index , data)`
Replaces element at a given index. 
```java
list.set(0, "Pineapple");   // replaces index 0 with "Pineapple"
```
#### 5. `remove(index or data)`
Removes by index or by object value. 
```java
list.remove(0);             // removes element at index 0
list.remove("Banana");      // removes first occurrence of "Banana"
```
#### 6. `removeAll()` vs `clear()`
- `clear()` : Removes **all** elements from the list. 
- `removeAll()` : Removes all elements that exist in a given collection. 
```java
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("papaya");
        list.add("grapes");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Mango");

        list.removeAll(list2); System.out.println(list); // [Apple, papaya, grapes]

        list.clear();          System.out.println(list); // []
```
#### 9. `size()`
Returns the number of elements. 
```java
list.add("A"); list.add("B");
System.out.println(list.size());  // 2
```
#### 10. `isEmpty()`
Returns `true` if list has no elements. 
```java
System.out.println(list.isEmpty());  // false
list.clear();
System.out.println(list.isEmpty());  // true
```
#### 11. `contains(data)`
Checks if an element exists in the list. 
```java
list.add("Apple");
System.out.println(list.contains("Apple"));  // true
System.out.println(list.contains("Mango"));  // false
```
#### 12. `indexOf(data)`
Returns the **first** index of an element, or `-1` if not found. 
```java
list.add("Apple"); list.add("Banana"); list.add("Apple");
System.out.println(list.indexOf("Banana"));   // 1
```
#### 13. `lastIndexOf()`
Returns the **last** index of an element. 
```java
System.out.println(list.lastIndexOf("Apple"));  // 2
```
#### 14. `sort() and reverse`
Sorts the list using a comparator. 
```java
ArrayList<String> names = new ArrayList<>();
names.add("John"); names.add("Alice"); names.add("Bob");
names.sort(null);             // natural order → [Alice, Bob, John]
names.sort(Comparator.reverseOrder());  // reverse order
```
# 🔸🔹🔸🔹🔸🔹***SEPRATOR***🔸🔹🔸🔹🔸🔹

#### 15. `replaceAll()`
Applies a function to every element and replaces it. 
```java
ArrayList<String> words = new ArrayList<>();
words.add("hello"); words.add("world");
words.replaceAll(String::toUpperCase);  // [HELLO, WORLD]
```
#### 7. `removeIf()`
Removes elements that match a condition (predicate). 
```java
ArrayList<Integer> nums = new ArrayList<>();
nums.add(1); nums.add(2); nums.add(3); nums.add(4);
nums.removeIf(n -> n % 2 == 0);  // removes even numbers → [1, 3]
```
#### 16. `forEach()`
Performs an action on every element. 
```java
list.forEach(item -> System.out.println(item));
// or
list.forEach(System.out::println);
```
#### 17. `subList()`
Returns a **view** of a portion of the list (fromIndex inclusive, toIndex exclusive). 
```java
ArrayList<Integer> nums = new ArrayList<>();
nums.add(10); nums.add(20); nums.add(30); nums.add(40);
System.out.println(nums.subList(1, 3));  // [20, 30]
```
#### 18. `toArray()`
Converts the ArrayList to an array. 
```java
Object[] arr = list.toArray();
String[] strArr = list.toArray(new String[0]);
```
#### 19. `clone()`
Creates a **shallow copy** of the ArrayList. 
```java
ArrayList<String> copy = (ArrayList<String>) list.clone();
```
#### 20. `retainAll()`
Keeps only elements that exist in a given collection (intersection). 
```java
ArrayList<String> a = new ArrayList<>(Arrays.asList("A","B","C"));
ArrayList<String> b = new ArrayList<>(Arrays.asList("B","C","D"));
a.retainAll(b);  // a → [B, C]
```
#### 21. `iterator()`
Returns an `Iterator` to loop through elements. 
```java
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```
#### 22. `listIterator()`
Returns a `ListIterator` (supports both forward and backward traversal). 
```java
ListIterator<String> lit = list.listIterator();
while (lit.hasPrevious()) {
    System.out.println(lit.previous());  // traverse backward
}
```
#### 23. `ensureCapacity()`
Increases internal capacity to hold at least the given number of elements (performance optimization). 
```java
list.ensureCapacity(100);  // ensures space for 100 elements
```
#### 24. `trimToSize()`
Trims the internal capacity to match the current size (saves memory). 
```java
list.trimToSize();
```
#### 25. `spliterator()`
Returns a `Spliterator` used in parallel stream processing. 
```java
Spliterator<String> sp = list.spliterator();
sp.forEachRemaining(System.out::println);
```

| --- | Method               | Purpose                 | Returns          |
| --- | -------------------- | ----------------------- | ---------------- |
| ✅   | `add()`              | **Add element**         | `void`/`boolean` |
| ✅   | `addAll()`           | **Add collection**      | `boolean`        |
| ✅   | `get()`              | **Fetch by index**      | `T`              |
| ✅   | `set()`              | **Update by index**     | `T`              |
| ✅   | `remove()`           | **Delete element**      | `T`/`boolean`    |
| ✅   | `removeAll()`        | **Delete collection**   | `boolean`        |
| ✅   | `clear()`            | **Delete all**          | `void`           |
| ✅   | `size()`             | **Count elements**      | `int`            |
| ✅   | `isEmpty()`          | **Check if empty**      | `boolean`        |
| ✅   | `contains()`         | **Check existence**     | `boolean`        |
| ✅   | `indexOf()`          | **First position**      | `int`            |
| ✅   | `sort()` and reverse | **Sort list**           | `void`           |
| ❌   | `removeIf()`         | Conditional delete      | `boolean`        |
| ❌   | `lastIndexOf()`      | **Last position**       | `int`            |
| ❌   | `replaceAll()`       | Transform elements      | `void`           |
| ❌   | `forEach()`          | Iterate & act           | `void`           |
| ❌   | `subList()`          | Get portion             | `List`           |
| ❌   | `toArray()`          | Convert to array        | `Object[]`       |
| ❌   | `clone()`            | Shallow copy            | `Object`         |
| ❌   | `retainAll()`        | Keep intersection       | `boolean`        |
| ❌   | `iterator()`         | Forward iterator        | `Iterator`       |
| ❌   | `listIterator()`     | Bi-directional iterator | `ListIterator`   |
| ❌   | `ensureCapacity()`   | Reserve capacity        | `void`           |
| ❌   | `trimToSize()`       | Free unused memory      | `void`           |
| ❌   | `spliterator()`      | Parallel stream use     | `Spliterator`    |
