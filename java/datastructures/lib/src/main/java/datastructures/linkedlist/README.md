# Linked Lists

- Node
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.

- Linked List
Create a Linked List class

Within your Linked List class, include a head property.

Upon instantiation, an empty Linked List should be created.

- The class should contain the following methods
> insert
> Arguments: value
> Returns: nothing
> Adds a new node with that value to the head of the list with an O(1) Time performance.

> includes
> Arguments: value
> Returns: Boolean
> Indicates whether that value exists as a Node’s value somewhere within the list.
to string
> Arguments: none
> Returns: a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"

> kth from end
> argument: a number, k, as a parameter.
> Return the node’s value that is k places from the tail of the linked list.
> You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

## Whiteboard Process
- [kthFromTheEnd method](kthPseudoCode.png)

## Approach & Efficiency
Any exceptions or errors that come from your code should be contextual, descriptive, capture-able errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom error that describes what went wrong in calling the methods you wrote for this lab.

Write tests to prove the following functionality:

Can successfully instantiate an empty linked list
Can properly insert into the linked list
The head property will properly point to the first node in the linked list
Can properly insert multiple nodes into the linked list
Will return true when finding a value within the linked list that exists
Will return false when searching for a value in the linked list that does not exist
Can properly return a collection of all the values that exist in the linked list

Where k is greater than the length of the linked list
Where k and the length of the list are the same
Where k is not a positive integer
Where the linked list is of a size 1
“Happy Path” where k is not at the end, but somewhere in the middle of the linked list

## Solution
<!-- Show how to run your code, and examples of it in action -->
