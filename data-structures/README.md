# 🌳 Binary Search Tree

> *Academic context — UFMS, Data Structures.* A CLRS-style **Binary Search Tree** built from a course assignment into a clean, **runnable and tested** project.

A complete BST with parent pointers: **insert · search · min/max · successor/predecessor · delete (all three cases, via transplant) · in-order traversal · ASCII pretty-print · deep copy**.

## ▶️ Run it (Python, no dependencies)
```bash
cd python
python demo.py
```
The demo builds a tree, prints it, lists it in order, queries successor/predecessor/min/max, deletes nodes (the three deletion cases), and shows that a **deep copy is independent** of the original. It ends with a randomized **self-check** asserting the BST invariants (in-order traversal stays sorted; search; delete; copy independence).

```
`-- 10
    |-- 25 (r)
    |   `-- 16 (l)
    ...
In-order: [0, 3, 6, 7, 9, 10, 12, 13, 14, 15, 16, 18, 19, 20, 22, 25]
self-check: OK
```

## 🗂️ Structure
```
data-structures/
├── python/
│   ├── bst.py     # the BST library (importable)
│   └── demo.py    # runnable demo + self-check
└── cpp-original/  # original C/C++ coursework (reference)
    ├── TrabalhoEstDados.cpp   # BST in C++
    ├── EstDados01.cpp         # heap
    └── altura.c
```

## 💡 Use as a library
```python
from bst import BinarySearchTree
t = BinarySearchTree([10, 25, 0, 16, 9])
print(list(t))            # [0, 9, 10, 16, 25]
t.delete(10)
print(t.successor(t.search(9)).key)
```

## 🛠️ Stack
Python (stdlib only) · original implementation in C/C++

> The Python version was written by porting the original C++ assignment, turning coursework into a self-contained, executable project (with the C++ kept for reference).
