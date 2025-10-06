## Strings 
 ```markdown
# String Parsing & Conversion Notes
**Date:** October 4, 2025  
**Topic:** Working with Strings, Parsing, and Type Conversion in Java

---

## 📚 Key Concepts

**String Parsing** = Breaking strings into smaller pieces
- Use `.split()` to break string at specific characters
- **Always** `.trim()` user input first (removes leading/trailing spaces)

---

## ✂️ Splitting Strings

### Basic Split Example
```java
String input = "Dana L. Wyatt";
String[] parts = input.split(" ");
// parts[0] = "Dana"
// parts[1] = "L."  
// parts[2] = "Wyatt"
```

### ⚠️ Important: Check Array Length
```java
if (parts.length == 3) {
    // User entered first, middle, last
    String middle = parts[1];
} else if (parts.length == 2) {
    // No middle name
    String middle = "(none)";
}
```

### 💡 My Analogy
Think of `.split()` like cutting a pizza into slices:
- The string is the pizza
- `.split(" ")` is the knife
- `" "` (space) is where you make the cuts

---

## 🔢 Converting Strings to Numbers

### Common Conversion Methods
```java
// String to int
String numText = "123";
int num = Integer.parseInt(numText);

// String to double
double price = Double.parseDouble("4.99");

// String to float
float small = Float.parseFloat("3.14");
```

### Real-World Example (from slides)
```java
String data = "111|Hot Chocolate|21|4.99";
String[] tokens = data.split(Pattern.quote("|"));

int id = Integer.parseInt(tokens[0]);        // 111
String name = tokens[1];                      // "Hot Chocolate"
int quantity = Integer.parseInt(tokens[2]);   // 21
double price = Double.parseDouble(tokens[3]); // 4.99
```

### ❓ Question for Instructor
Why do we need `Pattern.quote("|")` for pipe but not for space?
- *Probably because | is a special regex character*

---

## 📅 Working with Dates

### Standard Format (ISO 8601: YYYY-MM-DD)
```java
String date = "2002-10-17";
LocalDate birthday = LocalDate.parse(date);
```

### Custom Date Formats
```java
String userDate = "10/17/2022";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
LocalDate birthday = LocalDate.parse(userDate, formatter);
```

### Another Format Example
```java
String userDate = "7 Oct 2002";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
LocalDate birthday = LocalDate.parse(userDate, formatter);
```

---

## 📋 DateTimeFormatter Pattern Codes

| Code | Description | Example |
|------|-------------|---------|
| `d` | Single/double digit day | 5 or 17 |
| `dd` | Must be 2-digit day | 05 or 17 |
| `M` | Single/double digit month | 7 or 12 |
| `MM` | Must be 2-digit month | 07 or 12 |
| `MMM` | Abbreviated month name | Oct |
| `MMMM` | Full month name | October |
| `yy` | Last 2 digits of year | 02 |
| `yyyy` | Full 4-digit year | 2002 |

---

## 💻 Exercises to Complete

### Exercise 2: FullNameParser
**Goal:** Parse names in format "first last" or "first middle last"

**Input examples:**
- `"Dana L. Wyatt"`
- `"Dana Wyatt"`

**Output:**
```
First name: Dana
Middle name: L. (or "(none)")
Last name: Wyatt
```

**Approach:**
1. Get input and `.trim()` it
2. `.split(" ")` the name
3. Check array length (2 or 3 parts?)
4. Assign values accordingly

---

### Exercise 3: HighScoreWins
**Goal:** Determine winner from game score

**Input format:** `"Home:Visitor|21:9"`

**Process:**
```java
// Step 1: Split by pipe
String[] parts = input.split(Pattern.quote("|"));
// parts[0] = "Home:Visitor"
// parts[1] = "21:9"

// Step 2: Split each part by colon
String[] teams = parts[0].split(":");
String[] scores = parts[1].split(":");

// Step 3: Convert scores and compare
int homeScore = Integer.parseInt(scores[0]);
int visitorScore = Integer.parseInt(scores[1]);
```

**Output:** `"Winner: Home"` or `"Winner: Visitor"`

---

### Exercise 4: TheaterReservations
**Goal:** Reserve theater tickets with formatted confirmation

**Requirements:**
- Get full name, date (MM/dd/yyyy), number of tickets
- Display: `# ticket(s) reserved for YYYY-MM-DD under LastName, FirstName`
- Handle singular/plural ("ticket" vs "tickets")

**Key tasks:**
1. Parse name: split to get first and last
2. Parse date: convert MM/dd/yyyy → YYYY-MM-DD format
3. Handle grammar: `if (tickets == 1)` use "ticket", else "tickets"

**Example output:**
```
3 tickets reserved for 2023-05-13 under Johnson, Geri
1 ticket reserved for 2023-05-13 under Johnson, Geri
```

---

## ✅ Practice Tonight

- [ ] Complete FullNameParser exercise
- [ ] Complete HighScoreWins exercise
- [ ] Complete TheaterReservations exercise
- [ ] Extra practice: Parse an email address "user@domain.com" into username and domain
- [ ] Create flashcard: "What does Integer.parseInt() do?"

---

## 🎯 Key Takeaways

1. **Always `.trim()` before `.split()`** - prevents issues with extra spaces
2. **Use `Pattern.quote()` for special characters** like `|`, `*`, `+`, etc.
3. **Check array length before accessing elements** - prevents ArrayIndexOutOfBounds errors
4. **DateTimeFormatter for custom date formats** - don't assume user enters ISO format
5. **String methods return NEW strings** - original string is unchanged (strings are immutable)

---

## 🔗 Related Topics to Review Later

- Regular expressions (regex) - why some characters need Pattern.quote()
- Exception handling - what happens if parseInt() gets invalid input?
- String immutability - why strings can't be changed after creation

---

## 📌 Important Code Snippets

### Template: Parsing User Input
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter input: ");
String input = scanner.nextLine().trim();  // Always trim!

String[] parts = input.split(" ");
// Process parts...
```

### Template: Converting Date Formats
```java
String userInput = "10/17/2022";
DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
LocalDate date = LocalDate.parse(userInput, inputFormat);

// Display in ISO format (YYYY-MM-DD)
System.out.println(date);  // Automatically formats as 2022-10-17
```



