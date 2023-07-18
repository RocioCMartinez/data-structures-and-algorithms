package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }

  @Test void testEmptyLinkedList() {
    //arrange //act
    LinkedList sut = new LinkedList();
    //assert
    assertTrue(sut.toString().equals("Null"));

  }

  @Test void testLinkedListInsert() {
    //arrange
    LinkedList sut = new LinkedList();
    String expectedOutput = "{ 6 } -> { 4 } -> { 2 } -> Null";

    //act
    sut.insert(2);
    sut.insert(4);
    sut.insert(6);

    //assert
    assertTrue(sut.toString().equals(expectedOutput));
  }

  @Test void testHeadNode() {
    LinkedList sut = new LinkedList();

    sut.insert(2);
    sut.insert(4);
    sut.insert(6);

    int expectedOutput = 6;

    assertEquals(expectedOutput, sut.head.value);

  }

  @Test void testValueIsIncluded() {
    LinkedList sut = new LinkedList();
    sut.insert(5);
    sut.insert(10);
    sut.insert(15);

    boolean includes = sut.includes(10);

    assertTrue(includes);
  }

  @Test void testIncludesOnEmptyLL() {
    LinkedList sut = new LinkedList();

    boolean includes = sut.includes(10);

    assertFalse(includes);
  }
}
