package datastructures.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

  public BinaryTreeNode root;

  public List<Integer> preOrder(){ // root, left, right
    List<Integer> values = new ArrayList<>();

    preOrder(root, values);

    return values;
  }

  void preOrder(BinaryTreeNode current, List values){
    //Cover base case
    if(current == null) return;
    //First add current nodes value to values list
    values.add(current.value);
    //Next go left
    preOrder(current.left, values);

    //Last go right
    preOrder(current.right, values);
  }

  public List<Integer> inOrder(){ //left, root, right
    List<Integer> values = new ArrayList<>();

    inOrder(root, values);

    return values;
  }

  void inOrder(BinaryTreeNode current, List values){
    //Cover base case
    if(current == null) return;

    //First go left
    inOrder(current.left, values);

    //Next add current nodes value to values list
    values.add(current.value);

    //Last go right
    inOrder(current.right, values);
  }

  public List<Integer> postOrder(){ // left, right, root
    List<Integer> values = new ArrayList<>();

    postOrder(root, values);

    return values;
  }

  void postOrder(BinaryTreeNode current, List values){
    //Cover base case
    if(current == null) return;

    //First go left
    inOrder(current.left, values);

    //Next go right
    inOrder(current.right, values);

    //Lastly add current nodes value to values list
    values.add(current.value);


  }
}
