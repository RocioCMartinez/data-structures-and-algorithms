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
      System.out.println("List is empty, initial value could not be found");
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

  public void insertAfterValue(int value, int newValue){
    Node newNode = new Node(newValue);

    if(this.head == null) { // checking if the list is empty
      System.out.println("List is empty, initial value could not be found");
    } else if (this.head.value == value) { // checking if target value is the head
      newNode = this.head.next;
    } else {                              // adding new node after target value
      Node currNode = this.head;
      while (currNode != null && currNode.value != value){
        currNode = currNode.next;
      }
      if (currNode != null) {
        newNode.next = currNode.next;
        currNode.next = newNode;
      } else {                                  // if target value is not found
        System.out.println("Value " + value + " is not in the list.");
      }
    }
  }

  public int kthFromTheEnd(int k){
    if (head == null) {  // if list is empty
      throw new IllegalStateException("LinkedList is empty");
    }

    Node kBehindTail = head;          //ChatGPT helped me understand the positions and movements of these nodes
    Node tailFinder = head;

    // Move the tailFinder pointer k positions ahead
    for (int i = 0; i < k; i++) {
      if (tailFinder == null) {
        throw new IllegalArgumentException("k is larger than the LinkedList size");
      }
      tailFinder = tailFinder.next;
    }

    // Move both pointers until the fast pointer reaches the end
    while (tailFinder.next != null) {  //Had to ensure I stopped AT the last Node not null
      kBehindTail = kBehindTail.next;
      tailFinder = tailFinder.next;
    }

    return kBehindTail.value;
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

