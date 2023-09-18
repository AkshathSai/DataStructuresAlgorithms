# 💼 A portfolio of meticulously crafted Data structures & Algorithms using Java - ☀️ ☁️ 👷‍♂️ 🚧🚧🚧🚧🚧🚧

[![Maven](https://badgen.net/badge/icon/maven?icon=maven&label)](https://https://maven.apache.org/)
![GitHub](https://img.shields.io/github/license/akshathsai/TuneTrip)


🎯 Demonstrating Java Mastery: Essential Data Structures & Algorithms Implementation

### ✨ Highlights:
- This repository demonstrates a side project in which I've developed and implemented essential data structures and algorithms using generics, resulting in a clean, reusable, and efficient code. 
- These data structures can carry out operations on both built-in and custom data types, making them extremely versatile and useful in a wide range of programming contexts.
- Additionally, I've also improved the performance and efficiency of sorting, searching, and shortest-path algorithms.
- This repository is a fantastic resource for developers looking to improve their algorithmic abilities and apply efficient solutions to real-world situations.

### Features
- Generic Data Structures: Implementation of linked lists, stacks, queues, and trees that can handle various data types.
- Sorting Algorithms: Optimized algorithms for efficient sorting of data sets, including BubbleSort, SelectionSort, InsertionSort, QuickSort & MergeSort.
- Searching Algorithms: Efficient searching algorithms like Binary Search, Breadth-First Search (BFS) & Depth-First Search (DFS) for quick data retrieval.
- Shortest-Path Solvers: Algorithms to find the shortest paths in graphs, including Dijkstra's, Floyd Warshall & Bellman Ford algorithms.
- Clean and Reusable Code

Excited to collaborate and grow together. Let's connect! 🤝 #Java #DataStructures #Algorithms #SoftwareEngineering #OpenToOpportunities

### Pseudocode

- Linear Search

  ```
  For i from 0 to n-1
    if 50 is behind doors[i]
      Return true
  Return false
  ``` 

- Binary Search - To apply Binary Search the input array must be sorted

  ```
  If no doors left
    Return false
  If 50 is behind the middle door
    Return true
  Else if 50 < middle door
    Search left half
  Else if 50 > middle door
    Seach right half
  ```
  ```
  If no doors left
    Return false
  If 50 is behind doors[middle]
    Return true
  Else if 50 < doors[middle]
    Search doors[0] through doors[middle - 1] 
  Else if 50 > doors[middle]
    Search doors[middle + 1] through doors[n - 1]
  ```

- To find middle element
  ```
  int mid = l + (r - l) / 2; 
  (or)
  int mid = firstIndex + (lastIndex - firstIndex)/2
  ```

## Authors

- [@Akshath Sai](https://github.com/AkshathSai)

## Installation - WIP!

## Links

<p>
<!-- <a href="https://www.github.com/AkshathSai" target="_blank" rel="noreferrer"><img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github.svg" width="32" height="32" /></a>-->
<a href="https://www.github.com/AkshathSai" target="_blank" rel="noreferrer"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" /></a>
<!-- <a href="https://www.linkedin.com/in/akshath-sai/" target="_blank" rel="noreferrer"><img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/linkedin.svg" width="32" height="32" /></a> -->
<a href="https://www.linkedin.com/in/akshath-sai/" target="_blank" rel="noreferrer"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" /></a>
</p>

### PRO TIPS
- Bubble Sort's adjacent element comparison technique can bubble up the highest element in an array in its first iteration. This can also vice versa to the smallest element in an array.