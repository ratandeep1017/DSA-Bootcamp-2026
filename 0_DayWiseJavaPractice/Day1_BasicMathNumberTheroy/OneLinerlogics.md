
#### 1. Check if a Number Is Positive, Negative, or Zero
- If `num > 0` → positive, if `num < 0` → negative, else → zero  
```java
String result = (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
```

***

#### 2. Find the Largest of Three Numbers
- Use `Math.max(a, Math.max(b, c))`  
```java
int largest = Math.max(a, Math.max(b, c));
```

***

#### 3. Check if a Year Is a Leap Year
- Leap year if: `(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)`  
```java
boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
```

***

#### 4. Find if a Triangle Is Valid Based on Angles or Sides
- **Angles**: sum must be 180  
- **Sides**: all sides > 0 and sum of any two sides > third side  
```java
// Angles
boolean validAngles = (a + b + c == 180) && (a > 0) && (b > 0) && (c > 0);

// Sides
boolean validSides = (a > 0) && (b > 0) && (c > 0) && (a + b > c) && (b + c > a) && (a + c > b);
```

***

#### 5. Perform Unit Conversion (e.g., Cm to M, Kg to G)
- Cm to M: `meters = cm / 100`  
- Kg to G: `grams = kg * 1000`  
```java
double meters = cm / 100;
double grams = kg * 1000;
```

***

#### 6. Find the Sum of the First N Natural Numbers
- Formula: `n * (n + 1) / 2`  
```java
int sum = n * (n + 1) / 2;
```

***

#### 7. Check if a Number Is Prime
- Prime if: no divisor from 2 to √n divides it  
```java
//code here 
```

***

#### 8. Check if a Number Is a Palindrome
- Reverse the number and compare with original  
```java
boolean isPalindrome = (n == reverse(n)); // where reverse reverses digits
```

***

#### 9. Check if a Number Is an Armstrong Number
- Sum of digits raised to power of digit count equals original  
```java
boolean isArmstrong = (n == sumOfDigitsPowered(n, digits(n)));
```
Where:
- `digits(n)` = number of digits
- `sumOfDigitsPowered(n, d)` = sum of each digit^d

***

#### 10. Calculate the GCD and LCM of Two Numbers
- GCD: use Euclidean algorithm  
- LCM: `(a * b) / gcd(a, b)`  
```java
int gcd = gcd(a, b); // Euclidean: while(b != 0) { int t = b; b = a % b; a = t; } return a;
int lcm = (a * b) / gcd;
```

***

#### 11. Generate All Prime Numbers Between 1 and N
- For each number from 2 to N, check if it's prime  
```java
// code here
```

***

#### 12. Find the Factorial of a Number
- Multiply 1 to n  
```java
int factorial = 1;
for (int i = 2; i <= n; factorial *= i, i++);
```
Or recursively:
```java
int factorial = n <= 1 ? 1 : n * factorial(n - 1);
```

***

#### 13. Find the Sum of Natural Numbers
- Same as problem 6: `n * (n + 1) / 2`  
```java
int sum = n * (n + 1) / 2;
```

***

#### 14. Find the Sum of Digits of Any Number
- Repeatedly take `n % 10` and divide by 10  
```java
int sum = 0;
while (n > 0) { sum += n % 10; n /= 10; }
```



### Quick Formula Summary

| Problem | One-Liner Logic |
|---------|-----------------|
| Positive/Negative/Zero | `num > 0 ? "positive" : num < 0 ? "negative" : "zero"` |
| Largest of 3 | `Math.max(a, Math.max(b, c))` |
| Leap Year | `(year % 4 == 0 ∧ year % 100 ≠ 0) ∨ (year % 400 == 0)` |
| Valid Triangle (angles) | `a + b + c == 180 ∧ all > 0` |
| Valid Triangle (sides) | `all > 0 ∧ sum(any two) > third` |
| Unit Conversion | `m = cm / 100`, `g = kg * 1000` |
| Sum of 1..N | `n * (n + 1) / 2` |
| Prime | `no divisor in [2, √n]` |
| Palindrome | `n == reverse(n)` |
| Armstrong | `n == sum(digits^digitCount)` |
| GCD | Euclidean algorithm |
| LCM | `(a * b) / gcd(a, b)` |
| Primes 1..N | Filter primes from range |
| Factorial | `n! = n * (n-1) * ... * 1` |
| Sum of Digits | `while(n > 0) { sum += n % 10; n /= 10; }` |


