# Comparing Strings in Java

## Summary
1. **Do not use `==` for strings**
    - `==` only checks if two variables point to the same object in memory, not the actual text.
    - Example: `"ABC" == "ABC"` might be true, but `"ABC" == ("A" + "BC")` is false.

2. **Use `.equals()`**
    - Checks if the *contents* of two strings are the same (case-sensitive).
    - `"ABC".equals("ABC")` → true
    - `"ABC".equals("abc")` → false

3. **Use `.equalsIgnoreCase()`**
    - Ignores case (uppercase vs lowercase) when comparing.
    - `"ABC".equalsIgnoreCase("abc")` → true
    - `"Hello".equalsIgnoreCase("HELLO")` → true

4. **String Literals**
    - String literals (like `"ABC"`) are fixed values written directly in code.
    - Java stores them in a special memory area called the **String Pool**.

---

## Mini Exercises

### Exercise 1: Predict the Output
```java
String a = "Java";
String b = "Java";
String c = new String("Java");

System.out.println(a == b);        // ? True
System.out.println(a == c);        // ? True
System.out.println(a.equals(c));   // ? True
```

### Exercise 2: Case Sensitivity

```java
String x = "Hello";
String y = "hello";

System.out.println(x.equals(y));            // ? False
System.out.println(x.equalsIgnoreCase(y));  // ? True
```

### Exercise 3: User Input
Write a program that:
- Asks the user to enter two words.
- Prints whether they are **exactly the same** (`equals`) or **the same ignoring case** (`equalsIgnoreCase`).
```