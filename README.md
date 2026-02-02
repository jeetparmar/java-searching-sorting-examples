# Java Searching & Sorting Examples

A collection of common searching and sorting algorithms implemented in Java. This project provides clear and concise implementations for educational purposes and reference.

## Implemented Algorithms

### Searching Algorithms
- **Linear Search**: Scans the list sequentially to find a target value.
- **Binary Search (Iterative)**: Efficiently finds a target value in a sorted array by repeatedly dividing the search interval in half.
- **Binary Search (Recursive)**: Recursive implementation of the binary search algorithm.
- **Jump Search**: Searches in a sorted array by jumping ahead by fixed steps.
- **Interpolation Search**: Improved binary search for uniformly distributed sorted arrays.
- **Hashing Search**: Uses a hash table to find an element in O(1) average time.
- **Depth First Search (DFS)**: Traverse or search tree or graph data structures by exploring as far as possible along each branch before backtracking.
- **Breadth First Search (BFS)**: Traverse or search tree or graph data structures by exploring all neighbor nodes at the present depth prior to moving on to the nodes at the next depth level.
- **Tree Search**: Algorithms for searching elements within a tree structure.
- **Knuth-Morris-Pratt (KMP) Search**: Efficient string searching algorithm that avoids redundant comparisons.
- **Boyer-Moore Search**: Highly efficient string searching algorithm that skips sections of the text.

### Sorting Algorithms
- **Bubble Sort**: Simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
- **Insertion Sort**: Builds the final sorted array one item at a time.
- **Selection Sort**: Repeatedly finds the minimum element from the unsorted part and puts it at the beginning.
- **Merge Sort**: Divide and conquer algorithm that splits the array into halves, sorts them, and then merges them back together.
- **Quick Sort**: Another divide and conquer algorithm that picks an element as 'pivot' and partitions the given array around the picked pivot.
- **Heap Sort**: Comparison-based sorting technique based on Binary Heap data structure.
- **Radix Sort**: Non-comparative sorting algorithm that sorts data with integer keys by grouping keys by the individual digits which share the same significant position and value.
- **Counting Sort**: Integer sorting algorithm that operates by counting the number of objects that have each distinct key value.
- **Bucket Sort**: Distributes elements into a number of buckets, then sorts each bucket individually.
- **Shell Sort**: Generalization of insertion sort that allows the exchange of items that are far apart.

## Project Structure
- `src/com/searching/`: Implementation of searching algorithms.
- `src/com/sorting/`: Implementation of sorting algorithms.
- `bin/`: Compiled class files (ignored by git).

## How to Run
You can run these examples using any Java IDE (like Eclipse, IntelliJ IDEA, or VS Code) or from the command line by compiling the `.java` files in the `src` directory.
