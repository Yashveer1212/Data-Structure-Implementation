public class Queue {
    private QueueNode head;
    private QueueNode tail;
    private static int count;

    public Queue()
    {
        head = null;
        count = 0;
    }
    public void addToBack(int info)
    {

        //head.setsLinkPrev(head);
        if(count == 0)// if the count if 0 then create a new head and tail for the queue
        {
            head = new QueueNode(info , head);//This is the first node of the queue
            tail = new QueueNode(head);
        }//the head will stay still because we only will add more to the tail or end
        else
        {
            head = new QueueNode(info , head);
            head.getsLink().setsLink(head);
        }//the tail will grow, by adding numbers to the end of it
        count++;
    }
    public void removeFromFront()
    {
        if(head != null)
        {
            tail = tail.getsLink();
        }
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }
        count--;
    }

    public String printOut()
    {
        String ans = "";
        if(count == 0)
        {
            ans = "Empty List!";//if there is nothing in the list (n=0) then it will tell the user.
        }
        else
        {
            QueueNode position  = tail.getsLink();

            for(int i = 0; i < count; i++)
            {
                ans+= position.getsData() + "\n-\n";
                position = position.getsLink();
            }
        }


        return ans;
    }//This method will print out the entire current queue list, from top to bottom

    public int length()
    {
        return count;
    }

    private class QueueNode{
        //instance variables
        private int sData;
        private QueueNode sLink;
        //private SteveNode sLinkPrev;

        //Constructors
        public QueueNode(int sData, QueueNode sLink)
        {
            this.sData = sData;
            this.sLink = sLink;
        }

        public QueueNode(QueueNode sLink)
        {
            this.sLink = sLink;
        }

        //getters and setters
        public int getsData() {
            return sData;
        }

        public QueueNode getsLink() {
            return sLink;
        }


        public void setsLink(QueueNode sLink)
        {
            this.sLink = sLink;
        }



        //toString
        public String toString()
        {
            return "data: " + sData + " links to " + sLink;
        }
    }//end of private inner class QueueNode
}// end of public class Queue