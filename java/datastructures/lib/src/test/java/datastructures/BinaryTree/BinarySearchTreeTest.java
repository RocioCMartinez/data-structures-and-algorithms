package datastructures.BinaryTree;
import datastructures.trees.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BinarySearchTreeTest {

  @Test void testAddOnce(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(7);

    Integer expected = 7;
    Integer actual = (Integer) tree.root.value;

    assertEquals(expected, actual);
  }

  @Test void testAddSmaller(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(7);
    tree.add(4);

    assertEquals(7, tree.root.value);
    assertEquals(4, tree.root.left.value);
    assertEquals(null, tree.root.right);
  }

  @Test void testAddLarger(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(7);
    tree.add(4);
    tree.add(14);

    assertEquals(7, tree.root.value);
    assertEquals(4, tree.root.left.value);
    assertEquals(14, tree.root.right.value);

  }

  @Test void testContains(){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(7);
    tree.add(4);
    tree.add(14);

    assertTrue(tree.contains(14));
    assertFalse(tree.contains(1));

  }
}
