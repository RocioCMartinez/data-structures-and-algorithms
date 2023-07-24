package datastructures.queue;

import datastructures.queue.Node;

public class Queue<T>
{
  Node<T> front;
  Node<T> back;

  void enqueue(T valueToEnqueue) {
    // Created the node to hold the value we want to add
    Node<T> newNode = new Node<>(valueToEnqueue);
    // We check if the queue is empty, if so our newNode will be assigned as both front and back because it is the only value inside
    if (isEmpty()) { // This will come into play by the end with isEmpty method
      front = newNode;
      back = newNode;
    } else {
      // We align the newNode to be after the previously last one
      back.next = newNode;
      // We give it the 'last' one title, newNode now equal last one
      back = newNode;
    }


  }

  T dequeue() {
    if (isEmpty()){
      return null;
    }
    // Create a variable to record the value of the front node
    T dequeuedValue = front.value;
    // if there is only one Node, set it to null and you will get rid of the one node
    if (front == back){
      front = null;
      back = null;
    } else {
      // Otherwise disconnect the front node
      front = front.next;
    }
    //Return the value of the node that was lost/removed
    return dequeuedValue;
  }

  T peek() {
    //Check if queue is empty
    if (isEmpty()){
      return null;
    }
    //If it is not empty start looking in by determining the value of 'front' node
    return front.value;
  }

  boolean isEmpty() {
    // If there is no front node, there is nothing in the queue, therefore the bottom statement would be true, otherwise false.
    return front == null;
  }
}
