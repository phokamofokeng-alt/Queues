public class QueueAsMyArrayList<T>
{
    MyArrayList<T> theQueue; // declare our queue

    // Constructor for initializing queue
    public QueueAsMyArrayList()
    {
        theQueue = new MyArrayList <>();

    }

    // 1. Enqueue method to add element to end of Queue
    public void enqueue(T element)
    {
        // If our element will surpass max size of queue
        if (theQueue.getSize()+1 > theQueue.getMAXELEMENTS())
        {
            throw new IndexOutOfBoundsException
            ("Queue out of bounds"); // automatically returns
        }
        else
        {
            // Add to queue using add method from arrayList

            int index = theQueue.getSize(); // Last position of stack
            theQueue.add(index, element);


        }
        
    }

    // 2. Dequeue method to remove element from queue
    // BUT be AWARE: Queues remove from the front
    public T dequeue()
    {
        
        // If queue has no elements
        if(theQueue.getSize() == 0)
        {
            T removed = null;
            return removed;
        }
        // Queue has elements
        else
        {
            // hold first element of queue
            T removed = theQueue.get(0);
            theQueue.remove(0);
            // No need to shift down since remove() method already does all the shifting. 

            return removed;


        }

    }

    // String method from arrayList
    public String toString()
    {
        return theQueue.toString();
    }
}