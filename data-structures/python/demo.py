"""Runnable demo of the Binary Search Tree (mirrors the original C++ `main`)."""
from bst import BinarySearchTree


def main() -> None:
    keys = [10, 25, 0, 16, 20, 9, 15, 6, 14, 7, 18, 12, 22, 19, 3, 13]
    t = BinarySearchTree(keys)

    print("Tree:")
    print(t.pretty())
    print("\nIn-order:", list(t))

    root = t.root
    print("Root:", root.key)
    print("Predecessor of root:", t.predecessor(root).key)
    print("Successor of root:", t.successor(root).key)
    print("Min:", t.minimum().key, "| Max:", t.maximum().key)

    for k in (0, 13, 10):          # case 1, case 2, case 3
        t.delete(k)
    print("\nAfter deleting 0, 13, 10:")
    print(t.pretty())
    print("In-order:", list(t))

    t2 = t.copy()
    t2.insert(30)
    print("\nDeep copy independence:")
    print("  copy + insert(30):", list(t2))
    print("  original unchanged:", list(t))


def _self_check() -> None:
    """Lightweight invariants so the project is verifiable, not just runnable."""
    import random

    data = random.sample(range(-500, 500), 200)
    t = BinarySearchTree(data)
    # in-order of a BST must be sorted
    assert list(t) == sorted(data), "in-order traversal is not sorted"
    # search finds every inserted key and rejects a missing one
    assert all(k in t for k in data)
    assert (max(data) + 1) not in t
    # delete keeps it a valid (sorted) BST
    for k in random.sample(data, 50):
        assert t.delete(k)
    remaining = [k for k in data if k not in set(random.sample(data, 0))]  # noqa
    assert list(t) == sorted(t), "tree not sorted after deletions"
    # deep copy is independent
    t2 = t.copy()
    t2.insert(9999)
    assert 9999 in t2 and 9999 not in t
    print("self-check: OK (in-order sorted, search, delete, deep-copy independence)")


if __name__ == "__main__":
    main()
    print()
    _self_check()
