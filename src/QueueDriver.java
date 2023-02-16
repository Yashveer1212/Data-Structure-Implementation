public class QueueDriver {

    public static void main(String args[])
    {
        Queue queue = new Queue();

        System.out.println(queue.printOut());

        queue.addToBack(11);//Number in the queue list
        queue.addToBack(9);//Number in the queue list
        queue.addToBack(99);//Number in the queue list
        queue.addToBack(78);//Number in the queue list
        queue.addToBack(12);//Number in the queue list


        System.out.println(queue.printOut());
        System.out.println();
        System.out.println("The length of the queue is: " + queue.length());//Prints outs the current length of the queue

        queue.removeFromFront();
        System.out.println();

        System.out.println(queue.printOut());
        System.out.println();
        System.out.println("The length of the queue is: " + queue.length());//Prints outs the current length of the queue


        queue.removeFromFront();
        System.out.println();

        queue.addToBack(23);
        System.out.println(queue.printOut());
        System.out.println("The length of the queue is: " + queue.length());// Prints outs the current length of the queue

        queue.removeFromFront();
        System.out.println();
        System.out.println(queue.printOut());
        System.out.println("The length of the queue is: " + queue.length());


    }//end of the main method
}//end of class QueueDriver
