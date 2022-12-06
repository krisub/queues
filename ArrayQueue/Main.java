/**
 * A class to test a queue implementation
 */
public class Main//QueueTesterWrap
{
	public static void main (String args[])
	{
		// make your default array size 5
		Queue<Integer> queue = new Queue<Integer>();
		
		queue.add(8);
		queue.add(4);
		
		queue.remove(); 
		
		queue.add(5);
		queue.add(9);
		
		queue.remove();  
		
		queue.add(6);
		queue.add(11);
		
		queue.remove();
		 
		System.out.println ("Size: " + queue.size());
		System.out.println ("Peek: " + queue.peek());
		System.out.println(queue + "\n");
		queue.remove();
		queue.remove();
		queue.remove();
		
		System.out.println ("Size: " + queue.size());
		System.out.println ("Peek: " + queue.peek());
		System.out.println(queue + "\n"); // []
	
		for (int k = 1; k <= 100; k++) // add 1 to 100
		{
			queue.add(k);
		}
			
		
		System.out.println ("Size: " + queue.size());
		System.out.println ("Peek: " + queue.peek());
		System.out.println(queue + "\n");
	
		for (int k = 1; k <= 50; k++) // remove 1 to 50, contents 51 to 100
		{
			int number = queue.remove();
		}
		
		System.out.println ("Size: " + queue.size());
		System.out.println ("Peek: " + queue.peek());
		System.out.println(queue + "\n");
			
		for (int k = 200; k <= 500; k+=10) // add tens 200 to 500 (after 51 to 100)
			queue.add(k);
			
		System.out.println ("Size: " + queue.size());
		System.out.println ("Peek: " + queue.peek());	
		System.out.println(queue + "\n");
		
		while (!queue.isEmpty()) // prints contents (should be 51 to 100, then 200 to 500 tens)
		{
			System.out.print(queue.remove() + " ");
		} 
		System.out.println("\n");
		
		System.out.println ("Size: " + queue.size());
		System.out.println ("Peek: " + queue.peek());
		System.out.println(queue); // empty
		System.out.println ("Remove from empty queue: " + queue.remove() + "\n") ;
			
	}		   
}
		 
		

