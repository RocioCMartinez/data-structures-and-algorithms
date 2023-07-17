package datastructures.linkedlist;


import datastructures.linkedlist.Node;

public class LinkedList {
  Node head = null;
  Node tail = null;  // not strictly required



  LinkedList myLL = new LinkedList();





  //Insert new Node and make it the head of LinkedList
  public void insert(int value) {

    Node newHeadNode = new Node(value);

    if (myLL.head != null) {
      newHeadNode.next = myLL.head;
      myLL.head = newHeadNode;
    } else {
      head = newHeadNode;
    }
  }

  // Traverse the LinkedList return boolean if the value is included
  public boolean includes(int value) {
    Node currNode = head;

    while (currNode != null) {
      if (currNode.value == value) {
        return true;
      }
      currNode = currNode.next;
    }
    return false;
  }

  @Override public String toString() {
    StringBuilder myLLValues = new StringBuilder();
    myLLValues.append("{ ");
    Node currNode = head;
    while (currNode != null){
      myLLValues.append(currNode.value);
      myLLValues.append(" } -> { ");
      currNode = currNode.next;
    }
    myLLValues.append("Null");
    return myLLValues.toString();

  }
}

