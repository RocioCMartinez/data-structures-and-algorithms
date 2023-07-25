package datastructures.stack;

public class PseudoQueue {

  Stack s1 = new Stack();
  Stack s2 = new Stack();

  public void enqueue(int value) {
    if (s1.isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    } else {
      s1.push(value);
    }
  }

  public Object dequeue() {
    if (s1.isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }

    if (s2.isEmpty()){
      while ( !s1.isEmpty()){
        s2.push(s1.pop());
      }
    }
    return s2.pop();
  }
}
