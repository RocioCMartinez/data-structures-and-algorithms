package datastructures.linkedlist;


import datastructures.linkedlist.Node;

public class LinkedList {
  Node head = null;
  Node tail = null;  // not strictly required

  public LinkedList(){
    this.head = null;

  }

  //Insert new Node and make it the head of LinkedList
  public void insert(int value) {

    Node newHeadNode = new Node(value);
    newHeadNode.next = this.head;
    this.head = newHeadNode;

  }

  // Traverse the LinkedList return boolean if the value is included
  public boolean includes(int value) {
    Node currNode = this.head;

    while (currNode != null) {
      if (currNode.value == value) {
        return true;
      }
      currNode = currNode.next;
    }
    return false;
  }

  public void append(int value) {
    Node appNode = new Node(value);

    if (this.head == null) {
      this.head = appNode;
    } else {
      Node currNode = this.head;
      while (currNode.next != null) {
        currNode = currNode.next;
      }
      currNode.next = appNode;
    }

  }

  public void insertBeforeValue(int value, int newValue) {
    Node newNode = new Node(newValue);

    if(this.head == null) { // checking if the list is empty
      this.head = newNode;
    } else if (this.head.value == value) { // checking if target value is the head
      newNode.next = this.head;
      this.head = newNode;
    } else {                              // adding new node before target value
      Node currNode = this.head;
      while (currNode.next != null && currNode.next.value != value){
        currNode = currNode.next;
      }
      if (currNode.next != null) {
        newNode.next = currNode.next;
        currNode.next = newNode;
      } else {                                  // if target value is not found
        System.out.println("Value " + value + " is not in the list.");
      }
    }

  }

  @Override public String toString() {
    StringBuilder myLLValues = new StringBuilder();

    Node currNode = head;

    while (currNode != null){
      myLLValues.append("{ ");
      myLLValues.append(currNode.value);
      myLLValues.append(" } -> ");
      currNode = currNode.next;
    }
    myLLValues.append("Null");
    return myLLValues.toString();

  }

}

