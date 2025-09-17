public class TestClass
{
    public static void main (String []args)
    {
        QueueAsMyArrayList <Character> myQueue = new QueueAsMyArrayList<>();

        // Print empty queue
        System.out.println(myQueue);

        // Populate queue with enqueue NB: FIFO
        // myQueue.enqueue(new Character ('a')) is explicitly coding it.
        // but autoboxing automatically converts between char and character

        myQueue.enqueue(('a') );
        myQueue.enqueue(new Character('b') );
        myQueue.enqueue(new Character('c') );
        myQueue.enqueue(new Character('d') );
        System.out.println(myQueue);

        // Remove first item in Queue using dequeue
        myQueue.dequeue();
        System.out.println(myQueue);

        






    }

}