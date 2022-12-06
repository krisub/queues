/*
Name: Krithika Subramanian
Period: 3
Date turned in: 11/30
*/

import java.util.*;

/**
 * Implements a Queue with a singly linked list of ListNodes
 */
public class Queue<E> 
{
	// include size as an instance field to avoid traversing
  ListNode<E> f;
  ListNode<E> b;
  int size;
	
	/** 
	 * Constructs an empty Queue
	 */	
	public Queue()
	{
	  f = null;
    b = null;
    size = 0;
	}
	
	/**
	 * Returns the front element of the queue. Returns null if
	 * queue is empty.
	 * @return the front element
	 */
	public E peek()
	{
    if(isEmpty()) return null;
		return (E) f.getData();
	}
	
	/**
	 * Removes and returns the front element of the queue. Returns null
	 * if the queue is empty.
	 * @return the removed element
	 */
	public E remove()
	{
	  if(isEmpty()) return null;
    ListNode<E> ret = f;
    f = f.getNext();
    size--;
    return (E) ret.getData();
	}
	
	/**
	 * Adds an element to the back of the queue
	 * @param data the element that is added
	 */
	public void add(E data)
	{
    ListNode<E> temp = new ListNode<E> (data, null);
	  if(isEmpty()) f = b = temp;
    else {
      b.setNext(temp);
      b = temp;
    }
    size++;
	}
	
	/**
	 * Returns whether or not the queue is empty
	 * @return whether or not the queue is empty
	 */
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	/**
	 * Returns a String version of the queue
	 * @return a String version of the queue
	 */
	public String toString()
	{
		String ret = "";
    ListNode<E> temp = f;
		while(temp!=null)
    {
      ret += temp.getData();
      if(temp.getNext() != null) ret += ", ";
      temp =  temp.getNext();
    }
    return "[" + ret + "]";
	}
	
	/**
	 * Returns the number of elements in the queue
	 * @return the number of elements in the queue
	 */
	public int size()
	{
    return size;	
	}
}
