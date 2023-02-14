public class QueueDriver {

    public static void main(String args[])
    {
        Queue queue = new Queue();

        System.out.println(queue.printOut());

        queue.addToBack(11);
        queue.addToBack(9);
        queue.addToBack(99);
        queue.addToBack(78);
        queue.addToBack(12);


        System.out.println(queue.printOut());
        System.out.println();
        System.out.println("The length of the queue is: " + queue.length());

        queue.removeFromFront();
        System.out.println();

        System.out.println(queue.printOut());
        System.out.println();
        System.out.println("The length of the queue is: " + queue.length());


        queue.removeFromFront();
        System.out.println();

        queue.addToBack(70);
        System.out.println(queue.printOut());
        System.out.println("The length of the queue is: " + queue.length());

        queue.removeFromFront();
        System.out.println();
        System.out.println(queue.printOut());
        System.out.println("The length of the queue is: " + queue.length());


    }//end main method
}//end SteveQueueDriver
