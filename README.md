# [Binary-Search-Tree](https://en.wikipedia.org/wiki/Binary_search_tree)
### Binary Search Tree, AVL Tree, test and visualize 

Following repo first builds the Binary Search Tree BST.java which includes AbstractTree.java, Tree.interface. Then in the TestBST.java checks the previously given classes.

- A tree is a classic data structure with many important applications. A tree provides a hierarchical organization in which data are stored in the nodes. A binary search tree can be implemented using a linked structure. Recall that lists, stacks, and queues are linear structures that consist of a sequence of elements. A binary tree is a hierarchical structure. It either is empty or consists of an element, called the root, and two distinct binary trees, called the left subtree and right subtree, either or both of which may be empty.

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/232390290-0af8bcec-88c9-4bf5-abe1-d1b43a8ec394.png" alt="Image">
</p>

- The `length`	of a path is the number of the edges in the path. The `depth` of a node is the length of the path from the root to the node. The set of all nodes at a given depth is sometimes called a `level` of the tree. `Siblings` are nodes that share the same parent node. The root of a left (right) subtree of a node is called a `left(right) child` of the node.
- A node without children is called a `leaf`. The height of a nonempty tree is the length of the path from the root node to its furthest leaf. The `height` of a tree that contains a single node is 0. Conventionally, the height of an empty tree is —1. The length of the path from node 60 to 45 is 2. The depth of node 60 is 0, the depth of node 55 is 1, and the depth of node 45 is 2. The height of the tree is 2. Nodes 45 and 57 are siblings. Nodes 45, 57, 67, and 107 are at the same level. 
- A special type of binary tree called a `binary search tree` (BST) is often useful. A BST (with no duplicate elements) has the property that for every node in the tree, the value of any node in its left subtree is less than the value of the node, and the value of any node in its right subtree is greater than the value of the node.
- Following is the demo run of `TestBST.java`:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/232379641-2f371503-f4a3-48cc-a2bc-50ecf3a7294c.png" alt="Image">
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/232404617-5f73b177-f490-432d-914f-17aba13d0446.png" alt="Image">
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/232405847-ce4a3d42-316f-4b89-a491-2a175717e2c3.png" alt="Image">
</p>

*[AVL Tree](https://en.wikipedia.org/wiki/AVL_tree)*
------------------

- AVL Tree is a balanced binary search tree. The search, insertion, and deletion times for a binary tree depend on the height of the tree. In the worst case, the height is O(n). If a tree is perfectly balanced–i.e., a complete binary tree—its height is log n. To maintain a well-balanced tree, the heights of every node’s two subtrees should be the same. AVL trees are well balanced. AVL trees were invented in 1962 by two Russian computer scientists, G. M. Adelson-Velsky and E. M. Landis (hence the name AVL). 

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/232673329-b9df65c7-fdf4-482e-ba09-c98c7c894b01.png" alt="Image">
</p>

- In an AVL tree, the difference between the heights of every node’s two subtrees is 0 or 1. It is fact that the maximum height of an AVL tree is O(log n). The process for inserting or deleting an element in an AVL tree is the same as in a regular binary search tree, except that you may have to rebalance the tree after an insertion or deletion operation.
- The balance factor of a node is the height of its right subtree minus the height of its left subtree. A node is said to be balanced if its balance factor is -1, 0, or 1. A node is considered left-heavy if its balance factor is -1, and right-heavy if its balance factor is +1.
- Since an AVL tree is a binary search tree, AVLTree is designed as a subclass of BST. An AVL tree is a binary tree, so we can define the AVLTree class to extend the BST class, as shown in the following UML diagram:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/232673155-7d72b908-4945-4421-aa1d-d9616f929210.png" alt="Image">
</p>

- AVL Tree was implemented in `AVLTree.java` and was successfully tested in `TestAVLTree.java` source codes which are located in side the `BinarySearchTree` folder. Following is the test demo run:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/232673536-4c04ff7c-803e-42e0-87a4-b28c64d5dfd5.png" alt="Image">
</p>
