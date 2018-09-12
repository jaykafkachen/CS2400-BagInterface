public class LinkedBag<T> implements BagInterface<T> 
{
    private int numberOfEntries;
    private static final int MAX_CAPACITY = 10000;
    private Node head;

    
    public LinkedBag()
    {
    	head = null;
    	numberOfEntries = 0;
    }
    
    /**
     * Gets the current number of entries in this bag.
     *
     * @return The integer number of entries currently in the bag.
     */
    public int getCurrentSize() 
    {
        return numberOfEntries;
    }

    /**
     * Sees whether this bag is empty.
     *
     * @return True if the bag is empty, or false if not.
     */
    public boolean isEmpty() 
    {
        return (numberOfEntries==0);
    }

    /**
     * Adds a new entry to this bag.
     *
     * @param newEntry The object to be added as a new entry.
     * @return True if the addition is successful, or false if not.
     */
    public boolean add(T newEntry) 
    {
        try
        {
           if(numberOfEntries==MAX_CAPACITY)
        	   throw new Exception(); //throw exception if adding would cause LinkedBag 
           							  //to exceed max capacity, do not add new element
        	   head = new Node(newEntry, head);
           numberOfEntries++;
	       return true;
        }
        catch (Exception e) { System.out.println("Failed to add"); };
    	return false;
    }

    /**
     * Removes one unspecified entry from this bag, if possible.
     *
     * @return Either the removed entry, if the removal.
     * was successful, or null.
     */
    public T remove() 
    {
    	if(head!=null)
    	{
	    	Node temp = head;
	    	head = head.next;
	    	temp.next = null;
	    	numberOfEntries--;
	    	return temp.item;
    	}
    	return null;
    }

    /**
     * Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry The entry to be removed.
     * @return True if the removal was successful, or false if not.
     */
    public boolean remove(T anEntry) 
    {
		try
	    {
			if(head.item.equals(anEntry))
				remove();
			else if(!contains(anEntry))
				return false;
			else
			{
	    		Node prev = head;
	            Node temp = prev.next;
	            while(temp.next.next!=null)
	            {
	            	if(!temp.item.equals(anEntry))
	                {
	            		prev = prev.next;
	            		temp = temp.next;
	                }
	            }
	            if(temp.next!=null)
	            	prev.next = temp.next;
	            else
	            	prev.next = null;
	            numberOfEntries--;
			}/**/
	        return true;
	    }
	    catch (Exception e) { System.out.println("\n\nFailed to remove"); };
	    return false;
    }
    
    /**
     * Removes all entries from this bag.
     */
    public void clear() 
    {
    	head = null;
    }

    /**
     * Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry The entry to be counted.
     * @return The number of times anEntry appears in the bag.
     */
    public int getFrequencyOf(T anEntry) 
    {
    	int count = 0;
    	Node temp = head;
        while(temp!=null)
        {
        	if(temp.item.equals(anEntry))
        		count++;
        }
        return count;
    }

    /**
     * Tests whether this bag contains a given entry.
     *
     * @param anEntry The entry to locate.
     * @return True if the bag contains anEntry, or false if not.
     */
    public boolean contains(T anEntry) 
    {
        Node temp = head;
        while(temp!=null)
        {
        	if(temp.item.equals(anEntry))
        		return true;
        	temp = temp.next;
        }
        return false;
    }

    /**
     * Retrieves all entries that are in this bag.
     *
     * @return A newly allocated array of all the entries in the bag.
     * Note: If the bag is empty, the returned array is empty.
     */
    public T[] toArray() 
    {
    	T arr[] = (T[]) new Object[numberOfEntries];
    	Node temp = head;
    	int index = 0;
    	while(temp!=null)
    	{
    		arr[index] = temp.item;
    		temp = temp.next;
    		index++;
    	}
        return arr;
    }

    // Required to implement linked storage
    private class Node
    {
        private T item;
        private Node next;

        private Node(T item) 
        {
            this(item, null);
        }

        private Node(T item, Node next) 
        {
            this.item = item;
            this.next = next;
        }
    }
}