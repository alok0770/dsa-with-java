# 🧠 Data Structures & Algorithms in Java

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-0969DA?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Focus-DSA%20%26%20Problem%20Solving-FFA116?style=for-the-badge&logo=leetcode&logoColor=black" alt="Problem Solving"/>
  <a href="https://leetcode.com/u/Alok_0770/"><img src="https://img.shields.io/badge/LeetCode-Alok__0770-FFA116?style=for-the-badge&logo=leetcode&logoColor=black" alt="LeetCode"/></a>
  <img src="https://img.shields.io/badge/Status-Active%20Daily%20Practice-2EA44F?style=for-the-badge" alt="Active Practice"/>
</p>

---

## 📖 Overview

Welcome to my personal **Data Structures and Algorithms** practice repository in **Java**. 

This repository documents my structured problem-solving journey — starting from foundational mathematical logic and control flow to array manipulations, recursive sorting algorithms, and standard interview problems on **[LeetCode (@Alok_0770)](https://leetcode.com/u/Alok_0770/)**.

> 💡 **Philosophy**: Prioritize understanding underlying mechanics, edge cases, and time/space complexity over memorizing template solutions.

---

## 📂 Topic-Wise Problem Index

### 1. 📊 Arrays (`src/arrays/`)
Fundamental and intermediate array operations, in-place rotations, and window tracking:
- **Basics**: `ArrayBasics.java` — Traversal and initialization
- **Extremes**: `FindLargestElement.java`, `FindSecondLargestElement.java` — Single-pass tracking
- **Verification**: `CheckIfArrayIsSorted.java` — Linear scan validation
- **In-Place Rotations**:
  - `LeftRotateByOne.java` & `LeftRotateByK.java`
  - `RightRotateByOne.java` & `RightRotateByK.java`
- **Reversal**: `ReverseArray.java` — Two-pointer swap technique
- **Subarrays & Sequences**:
  - `MaxConsecutiveOnes.java` — Linear counter tracking
  - `CountSubarraysWithTargetSum.java` — Subarray sum counting

---

### 2. ⚡ Sorting Algorithms (`src/sorting/`)
Implementations of both elementary $O(n^2)$ and divide-and-conquer $O(n \log n)$ sorting techniques:

| Algorithm | Best Time | Average Time | Worst Time | Space | Technique / Highlights |
| :--- | :---: | :---: | :---: | :---: | :--- |
| **Bubble Sort** | $O(n)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ | Adjacent swaps with sorted flag optimization |
| **Selection Sort** | $O(n^2)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ | Minimum element selection per pass |
| **Insertion Sort** | $O(n)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ | Adaptive shift into sorted subarray |
| **Merge Sort** | $O(n \log n)$ | $O(n \log n)$ | $O(n \log n)$ | $O(n)$ | Divide and conquer with recursive merge |
| **Quick Sort** | $O(n \log n)$ | $O(n \log n)$ | $O(n^2)$ | $O(\log n)$ | Pivot partitioning with recursive subarrays |

---

### 3. 💡 LeetCode Solutions (`src/leetCodeProblems/`)
Optimized solutions to standard product-company interview questions:

| Problem | LeetCode ID | Topic / Pattern | Time Complexity | Space Complexity |
| :--- | :---: | :--- | :---: | :---: |
| **Two Sum** | [#1](https://leetcode.com/problems/two-sum/) | Hash Map / Complement Search | $O(n)$ | $O(n)$ |
| **Move Zeroes** | [#283](https://leetcode.com/problems/move-zeroes/) | Two-Pointer In-Place Shift | $O(n)$ | $O(1)$ |
| **Binary Search** | [#704](https://leetcode.com/problems/binary-search/) | Divide & Conquer / Search Space Reduction | $O(\log n)$ | $O(1)$ |

---

### 4. 🔁 Loops & Mathematical Logic (`src/loops/` & `src/NumberSystem/`)
Mathematical foundation, prime checks, sequences, and number transformations:
- **Number Theory**: `PrimeOrNot.java`, `Composite.java`, `Factors.java`, `Factorial.java`
- **Sequences**: `ArithmeticProgression.java`, `GeometricProgression.java`
- **Number System**: `DecimalToBinary.java`, `ReverseNum.java`, `SquareRootOfNumbers.java`, `SumOfNaturalNumbers.java`
- **Control Flow**: `WhileLoopBasics.java`, `NestedLoops.java`, `BreakContinueDemo.java`, `NumberGuessingGame.java`

---

### 5. 📐 Pattern Printing (`src/pattern/`)
Nested loop coordinate mastery and geometric matrix printing:
- `RightTriangle.java` — Standard star triangle
- `ReverseTriangle.java` — Inverted star pattern
- `HollowRectangle.java` — Boundary condition matrix
- `PatternPrinting.java` — General coordinate loops

---

### 6. 🔀 Decision Making & Conditionals (`src/conditionals/`)
- `EvenOddCheck.java`, `LargestOfThree.java`, `LeapYearCheck.java`
- `DiscountCalculator.java`, `DayOfWeek.java`, `SimpleCalculator.java`

---

## 🎯 Active Learning Roadmap

- [x] Number Theory, Mathematics & Bitwise Basics
- [x] Control Flow & Pattern Matrix Loops
- [x] 1D Arrays (Traversals, In-Place Reversals & Rotations)
- [x] Classical Sorting (Bubble, Selection, Insertion)
- [x] Divide & Conquer Sorting (MergeSort, QuickSort)
- [x] Two-Pointer & Binary Search Basics
- [🔄] **Recursion & Backtracking** — *Currently Active*
- [⏳] Strings & Sliding Window Patterns — *Next*
- [⏳] Linked Lists, Stacks & Queues — *Upcoming*
- [⏳] Binary Trees, BST & Hash Tables — *Roadmap*

---

## 🏃 How to Compile & Run

All solutions are written as standalone Java programs and can be executed via terminal:

```bash
# Clone the repository
git clone https://github.com/alok0770/dsa-with-java.git
cd dsa-with-java

# Compile a specific file (e.g. QuickSort)
javac -d out src/sorting/QuickSort.java

# Run the compiled program
java -cp out sorting.QuickSort
```

---

## 👨‍💻 Connect with Me

- 💼 **LeetCode Profile**: [leetcode.com/u/Alok_0770](https://leetcode.com/u/Alok_0770/)
- 🐙 **GitHub**: [@alok0770](https://github.com/alok0770)
- 🌐 **Portfolio**: [portfolio-alok-2b96.vercel.app](https://portfolio-alok-2b96.vercel.app/)
