# Java DSA Practice

A collection of Data Structures and Algorithms problems solved in Java.

---

## 📁 Folder Structure

```
2Java-dsa-practice/
└── Arrays/
    ├── p1movezeroseend.java
    └── p2movezerosfirst.java
```

---

## 📚 Problems

### Arrays

#### 1. Move Zeros to End — `p1movezeroseend.java`

**Problem:** Given an array, move all zeros to the end while maintaining the order of non-zero elements.

**Approach:** Two-pointer technique
- Pointer `j` tracks the position for the next non-zero element
- Iterate with `i`, whenever a non-zero is found, swap `arr[i]` with `arr[j]` and increment `j`

**Example:**
```
Input:  6
        0 1 0 3 12 0
Output: 1 3 12 0 0 0
```

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

#### 2. Move Zeros to Front — `p2movezerosfirst.java`

**Problem:** Given an array, move all zeros to the beginning while maintaining the order of non-zero elements.

**Approach:** Two-pointer technique (reverse iteration)
- Pointer `j` starts from index 0
- Iterate from the end with `i`, whenever a non-zero is found, swap `arr[i]` with `arr[j]` and increment `j`

**Example:**
```
Input:  6
        0 1 0 3 12 0
Output: 0 0 0 1 3 12
```

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## 🛠️ How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/Arthikhs/Java-dsa-practice.git
   ```

2. Compile:
   ```bash
   javac Arrays/p1movezeroseend.java
   ```

3. Run:
   ```bash
   java Arrays.p1movezeroseend
   ```

---

## 🚀 Topics Covered

| Topic   | Problems Solved |
|---------|----------------|
| Arrays  | 2              |

---

> More problems will be added regularly as I continue my DSA journey! 💪
