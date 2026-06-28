"""Binary Search Tree — clean, runnable Python implementation.

Originally a UFMS Data Structures coursework project written in C++; here it is
turned into a proper, importable, runnable library. CLRS-style BST with parent
pointers:

- insert / search / __contains__
- minimum / maximum
- successor / predecessor
- delete (the three cases, via transplant)
- in-order traversal (iterator)
- ASCII pretty-print
- deep copy (independent trees)

Pure standard library — no dependencies.
"""
from __future__ import annotations
from typing import Optional, Iterable, Iterator


class Node:
    __slots__ = ("key", "parent", "left", "right")

    def __init__(self, key: int) -> None:
        self.key = key
        self.parent: Optional["Node"] = None
        self.left: Optional["Node"] = None
        self.right: Optional["Node"] = None

    def __repr__(self) -> str:
        return f"Node({self.key})"


class BinarySearchTree:
    def __init__(self, keys: Optional[Iterable[int]] = None) -> None:
        self.root: Optional[Node] = None
        for k in keys or ():
            self.insert(k)

    # ---- insertion ----
    def insert(self, key: int) -> Node:
        z = Node(key)
        y: Optional[Node] = None
        x = self.root
        while x is not None:
            y = x
            x = x.left if z.key < x.key else x.right
        z.parent = y
        if y is None:
            self.root = z
        elif z.key < y.key:
            y.left = z
        else:
            y.right = z
        return z

    # ---- search ----
    def search(self, key: int) -> Optional[Node]:
        x = self.root
        while x is not None and key != x.key:
            x = x.left if key < x.key else x.right
        return x

    def __contains__(self, key: int) -> bool:
        return self.search(key) is not None

    # ---- min / max ----
    @staticmethod
    def _min(x: Node) -> Node:
        while x.left is not None:
            x = x.left
        return x

    @staticmethod
    def _max(x: Node) -> Node:
        while x.right is not None:
            x = x.right
        return x

    def minimum(self) -> Optional[Node]:
        return self._min(self.root) if self.root else None

    def maximum(self) -> Optional[Node]:
        return self._max(self.root) if self.root else None

    # ---- successor / predecessor ----
    def successor(self, x: Node) -> Optional[Node]:
        if x.right is not None:
            return self._min(x.right)
        y = x.parent
        while y is not None and x is y.right:
            x, y = y, y.parent
        return y

    def predecessor(self, x: Node) -> Optional[Node]:
        if x.left is not None:
            return self._max(x.left)
        y = x.parent
        while y is not None and x is y.left:
            x, y = y, y.parent
        return y

    # ---- deletion ----
    def _transplant(self, u: Node, v: Optional[Node]) -> None:
        if u.parent is None:
            self.root = v
        elif u is u.parent.left:
            u.parent.left = v
        else:
            u.parent.right = v
        if v is not None:
            v.parent = u.parent

    def delete(self, key: int) -> bool:
        z = self.search(key)
        if z is None:
            return False
        if z.left is None:
            self._transplant(z, z.right)
        elif z.right is None:
            self._transplant(z, z.left)
        else:
            y = self._min(z.right)
            if y.parent is not z:
                self._transplant(y, y.right)
                y.right = z.right
                y.right.parent = y
            self._transplant(z, y)
            y.left = z.left
            y.left.parent = y
        return True

    # ---- traversal ----
    def inorder(self) -> Iterator[int]:
        def _walk(x: Optional[Node]) -> Iterator[int]:
            if x is not None:
                yield from _walk(x.left)
                yield x.key
                yield from _walk(x.right)
        yield from _walk(self.root)

    def __iter__(self) -> Iterator[int]:
        return self.inorder()

    # ---- pretty print (ASCII) ----
    def pretty(self) -> str:
        lines: list[str] = []

        def _draw(prefix: str, x: Optional[Node]) -> None:
            if x is None:
                return
            is_right = x.parent is not None and x.parent.right is x
            has_left_sib = x.parent is not None and x.parent.left is not None
            branch = "|--" if (is_right and has_left_sib) else "`--"
            tag = "" if x.parent is None else (" (r)" if is_right else " (l)")
            lines.append(f"{prefix}{branch}{x.key:>3}{tag}")
            child_prefix = prefix + ("|   " if (is_right and has_left_sib) else "    ")
            _draw(child_prefix, x.right)
            _draw(child_prefix, x.left)

        _draw("", self.root)
        return "\n".join(lines)

    # ---- deep copy ----
    def copy(self) -> "BinarySearchTree":
        new = BinarySearchTree()

        def _cp(orig: Optional[Node]) -> Optional[Node]:
            if orig is None:
                return None
            n = Node(orig.key)
            n.left = _cp(orig.left)
            if n.left is not None:
                n.left.parent = n
            n.right = _cp(orig.right)
            if n.right is not None:
                n.right.parent = n
            return n

        new.root = _cp(self.root)
        return new
