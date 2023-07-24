package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T>
{
  Node<T> top;

  void push(T valueToPush) {
    // Created node to hold the valueToPush
    Node pushedNode = new Node<T>(valueToPush);
    //Put it in line by assigning its next reference to Top
    pushedNode.next = top;
    // replaced top with the newNode
    top = pushedNode;

  }

  T pop() {
    //check if there is a top!!
    if (top == null){
      return null;
    }
    // Stored the value of the targeted pop value
    T poppedValue = top.value;
    // move the label of top to the next node
    top = top.next;
    // return the value that was disconnected or popped
    return poppedValue;
  }

  T peek() {
    // check if the stack is empty!
    if (isEmpty()){
      return null;
    }
    //Start peeking by looking into top.value
    return top.value;
  }

  boolean isEmpty() {
    // If 'top' is null, there is no stack- it is empty
   return top == null;
  }
}
