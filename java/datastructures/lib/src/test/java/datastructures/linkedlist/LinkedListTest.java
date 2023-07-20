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

  @Test void testAppendOneNode() { // For empty list
    LinkedList sut = new LinkedList();

    sut.append(1);

    Node currNode = sut.head;

    assertEquals(1, currNode.value);
  }

  @Test void testAppendManyNodes() {
    LinkedList sut = new LinkedList();

    sut.append(1);
    sut.append(2);
    sut.append(3);


    assertEquals("{ 1 } -> { 2 } -> { 3 } -> Null", sut.toString());

  }

  @Test void testInsertBeforeValue() {
    LinkedList sut = new LinkedList();

    sut.append(10);
    sut.append(20);
    sut.append(30);

    sut.insertBeforeValue(30, 25);

    assertEquals("{ 10 } -> { 20 } -> { 25 } -> { 30 } -> Null", sut.toString());
  }

  @Test void testInsertBeforeFirstValue(){
    LinkedList sut = new LinkedList();

    sut.append(10);
    sut.append(20);
    sut.append(30);

    sut.insertBeforeValue(10, 5);

    assertEquals("{ 5 } -> { 10 } -> { 20 } -> { 30 } -> Null", sut.toString());
  }

  @Test void testInsertAfterValue() {
    LinkedList sut = new LinkedList();

    sut.append(10);
    sut.append(20);
    sut.append(30);

    sut.insertAfterValue(20, 25);

    assertEquals("{ 10 } -> { 20 } -> { 25 } -> { 30 } -> Null", sut.toString());
  }

  @Test void testInsertAfterLastValue() {
    LinkedList sut = new LinkedList();

    sut.append(10);
    sut.append(20);
    sut.append(30);

    sut.insertAfterValue(30, 35);

    assertEquals("{ 10 } -> { 20 } -> { 30 } -> { 35 } -> Null", sut.toString());
  }

  @Test void testKthFromTheEnd() {
    LinkedList sut = new LinkedList();

    sut.append(10);
    sut.append(20);
    sut.append(30);
    sut.append(40);

   int actualOutcome = sut.kthFromTheEnd(2);

    assertEquals(20, actualOutcome);
  }

  @Test void testKOutOfBound() { /// throws an argumentException: k is larger than the LinkedList size
    LinkedList sut = new LinkedList();

    sut.append(10);
    sut.append(20);
    sut.append(30);
    sut.append(40);



    assertThrows(IllegalArgumentException.class, ()-> sut.kthFromTheEnd(10));
  }

  @Test void testkIsNegative() {   // Always returns the last node value
    LinkedList sut = new LinkedList();

    sut.append(10);
    sut.append(20);
    sut.append(30);
    sut.append(40);

    int actualOutcome = sut.kthFromTheEnd(-5);

    assertEquals(40, actualOutcome);
  }

  @Test void testZipLinkedLists() {
    LinkedList sut1 = new LinkedList();

    sut1.append(5);
    sut1.append(15);
    sut1.append(25);
    sut1.append(35);

    LinkedList sut2 = new LinkedList();

    sut2.append(10);
    sut2.append(20);
    sut2.append(30);
    sut2.append(40);

    String actualOutcome = sut1.zipLists(sut1,sut2).toString();

    assertEquals("{ 5 } -> { 10 } -> { 15 } -> { 20 } -> { 25 } -> { 30 } -> { 35 } -> { 40 } -> Null", actualOutcome);
  }

  @Test void testZipNullList() { // provides error when a list is null
    LinkedList sut1 = new LinkedList();

    sut1.append(10);
    sut1.append(20);
    sut1.append(30);
    sut1.append(40);

    LinkedList sut2 = null;

    LinkedList actualOutcome = sut1.zipLists(sut1, sut2);

    assertEquals(sut1, actualOutcome);
  }

  @Test void testZipLinkedListsSizes() {
    LinkedList sut1 = new LinkedList();

    sut1.append(5);
    sut1.append(15);
    sut1.append(25);
    sut1.append(35);

    LinkedList sut2 = new LinkedList();

    sut2.append(10);
    sut2.append(20);

    String actualOutcome = sut1.zipLists(sut1,sut2).toString();

    assertEquals("{ 5 } -> { 10 } -> { 15 } -> { 20 } -> { 25 } -> { 35 } -> Null", actualOutcome);
  }


}
