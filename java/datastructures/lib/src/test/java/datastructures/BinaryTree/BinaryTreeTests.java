package datastructures.BinaryTree;

import datastructures.trees.BinaryTree;
import datastructures.trees.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTests {

  @Test void testPreOrder(){
    BinaryTree tree = new BinaryTree();
    BinaryTreeNode one = new BinaryTreeNode(1);
    BinaryTreeNode two = new BinaryTreeNode(2);
    BinaryTreeNode three = new BinaryTreeNode(3);

    tree.root = one;
    tree.root.left = two;
    tree.root.right = three;

    Object[] actual = tree.preOrder().toArray();
    Object[] expected = {1,2,3};

    assertArrayEquals(expected, actual);
  }

  @Test void testInOrder(){
    BinaryTree tree = new BinaryTree();
    BinaryTreeNode one = new BinaryTreeNode(1);
    BinaryTreeNode two = new BinaryTreeNode(2);
    BinaryTreeNode three = new BinaryTreeNode(3);

    tree.root = one;
    tree.root.left = two;
    tree.root.right = three;

    Object[] actual = tree.inOrder().toArray();
    Object[] expected = {2,1,3};

    assertArrayEquals(expected, actual);
  }
  @Test void testPostOrder(){
    BinaryTree tree = new BinaryTree();
    BinaryTreeNode one = new BinaryTreeNode(1);
    BinaryTreeNode two = new BinaryTreeNode(2);
    BinaryTreeNode three = new BinaryTreeNode(3);

    tree.root = one;
    tree.root.left = two;
    tree.root.right = three;

    Object[] actual = tree.postOrder().toArray();
    Object[] expected = {2,3,1};

    assertArrayEquals(expected, actual);
  }


}
