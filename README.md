# JUnit Testing — Labs & Homework

## Title and Objective

**Title:** JUnit 5 Testing Practice — Labs 1–5 and Homework 1–3
**Objective:** Apply JUnit 5 to test correctness, boundary conditions, and exception handling across a series of small Java utility and model classes, progressively covering value-based assertions, exception testing, business-rule validation, and string-processing logic.

---

## What Was Implemented

### Labs

| Lab | Class | What It Covers |
|---|---|---|
| Lab 1 | `TemperatureConverter` | Celsius/Fahrenheit/Kelvin conversions; tests known value pairs and a round-trip conversion check |
| Lab 2 | `BankAccount` | Deposit/withdraw operations; tests normal balance changes and exception throwing (`IllegalArgumentException`, `IllegalStateException`) |
| Lab 3 | `StringUtil` | Palindrome checking with regex-based cleanup and case-insensitivity; includes a fix for the empty-string edge case |
| Lab 4 | `TimerUtil` | Elapsed-time computation between two integers; tests a normal case, an equal-boundary case, and an invalid-input exception case |
| Lab 5 | `ShoppingCart` | List-based item management (`add`, `remove`, `clear`, `count`); includes a `assertDoesNotThrow` case for removing a non-existent item |

### Homework

| Homework | Class | What It Covers |
|---|---|---|
| HW1 | `Calculator1` | Added `power(int base, int exp)` (iterative loop) and `modulus(int a, int b)` (with divide-by-zero guard); tests use `@BeforeEach`/`@AfterEach` to reset the calculator instance each run |
| HW2 | `BankAccount1` | Extended bank account model with an `isActive()` status flag that becomes permanently `false` once balance drops below 100 after a withdrawal ("sticky" inactive rule); tests use `assertThrows`, `assertTrue`, `assertFalse` |
| HW3 | `StringAnalyzer` | `isPalindrome`, `countVowels`, and `isAnagram` (sort-and-compare approach), all using the same regex clean-then-check style; tests use `@DisplayName` for readability |

---

## How to Run the Code and Tests

### Prerequisites
- Java JDK installed (8 or later)
- NetBeans IDE with JUnit 5 (Jupiter) library added to the project

### Running in NetBeans
1. Open the project in NetBeans.
2. To run all tests in a class: right-click the test file (e.g. `TemperatureConverterTest.java`) → **Test File** (or press `Ctrl+F6`).
3. To run the entire test suite for the project: right-click the project root → **Test**.
4. Results appear in the **Test Results** panel at the bottom — green indicates a pass, red indicates a failure, with details on the assertion that failed.
### Project structure
Each implementation class and its corresponding test class share the same package (e.g. `com.university.lab.tempconverter`), following the convention `<ClassName>.java` paired with `<ClassName>Test.java`.
