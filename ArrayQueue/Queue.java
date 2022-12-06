/*
Name: Krithika Subramanian
Period:3
Date turned in: 11/30
*/

// for testing 
import java.util.Arrays;

/**
 * Implements a Queue with an array
 */
public class Queue<E> 
{
	private Object[] q;
	private int fi;
	private int bi;
	private int size;
	
	/** 
	 * Constructs an empty Queue with an initial capacity of 5 elements
	 */
	public Queue()
	{
	  q = new Object[5];
    fi = 0;
    bi = 0;
    size = 0;
	}
	
	/**
	 * Returns the front element of the queue. Returns null if
	 * queue is empty.
	 * @return the front element
	 */
	@SuppressWarnings("unchecked") 
	public E peek() 
	{
    if(isEmpty()) return null;
		return (E) q[fi];
	}
	
	/**
	 * Removes and returns the front element of the queue. Returns null
	 * if the queue is empty.  Do not set elements to null when removing.  Your
	 * instance fields will mark what part of the queue is in use.
	 * @return the removed element
	 */
	@SuppressWarnings("unchecked") 
	public E remove()
	{
		if(isEmpty()) return null;
    E ret = (E) q[fi];
    fi++;
    if(fi>=q.length) fi = 0;
    size--;
    return ret;
	}
	
	/**
	 * Adds an element to the back of the queue
	 * @param data the element that is added
	 */
	public void add(E data)
	{
    if(bi>=q.length && fi != 0) bi = 0;
    q[bi] = data;
    bi++;
    size++;
    if(bi == fi || (bi>=q.length && fi==0)) resize();
	}
	
	private void resize()
	{
	  Object[] temp = new Object[q.length*2];
    int pointer = fi;
		for(int i = 0; i < q.length; i++) {
      temp[i] = q[pointer];
      pointer++;
      if(pointer >= q.length) pointer = 0;
    }
    fi = 0;
    bi = q.length;
    q = temp;
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
		// leave this next line in so you (and I) can see the
		// wraparound in the array contents whenever the queue is
		// printed
		System.out.println ("* " + Arrays.toString(q));
    System.out.println();
		// build and return the regular toString below
    String ret = "";
    int pointer = fi;
    for(int i = 0; i < size; i++) {
      ret += q[pointer];
      pointer++;
      if(i != size-1) ret += ", ";
      if(pointer >= q.length) pointer = 0;
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
