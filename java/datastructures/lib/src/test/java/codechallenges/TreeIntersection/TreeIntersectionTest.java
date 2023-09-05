package codechallanges.treeIntersection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

public class CommonValuesTest {
  private Tree<Integer> tree1;
  private Tree<Integer> tree2;

  @BeforeEach
  void setUp() {

    Node<Integer> tree1Root = new Node<>(1);
    tree1Root.left = new Node<>(2);
    tree1Root.right = new Node<>(3);
    tree1 = new Tree<>(tree1Root);

    Node<Integer> tree2Root = new Node<>(2);
    tree2Root.left = new Node<>(3);
    tree2Root.right = new Node<>(4);
    tree2 = new Tree<>(tree2Root);
  }

  @Test
  void testCommonValues() {
    ArrayList<Integer> commonValues = CommonValues.commonValues(tree1, tree2);

    assertTrue(commonValues.contains(2));
    assertTrue(commonValues.contains(3));
    assertFalse(commonValues.contains(1));
    assertFalse(commonValues.contains(4));
  }

}
