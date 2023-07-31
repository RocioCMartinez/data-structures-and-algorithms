package datastructures.trees;

public class BinarySearchTree extends BinaryTree {

  public void add(Integer value){
    BinaryTreeNode addedNode = new BinaryTreeNode(value);

    if(root == null) {
      root = addedNode;
    } else {
      add(root, addedNode);
    }

  }

    void add(BinaryTreeNode current, BinaryTreeNode addedNode){
    if(addedNode.value < current.value){
      if(current.left == null){
        current.left = addedNode;
      } else {
        add(current.left, addedNode);
      }
    } else {
      if(current.right == null){
        current.right = addedNode;
      } else {
        add(current.right, addedNode);
      }
     }
    }
  public boolean contains(Integer value){
   return contains(root, value);
  }

  boolean contains(BinaryTreeNode current, Integer value){
    if(current == null) return false;
    if(current.value == value) return true;
    return contains(current.left, value) || contains(current.right, value);
  }
}
