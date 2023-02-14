public class Queue {
    private QueueNode head;
    private QueueNode tail;
    private static int count;

    public Queue()
    {
        head = null;
        //tail = head;
        count = 0;
    }
    public void addToBack(int info)
    {

        //head.setsLinkPrev(head);
        if(count == 0)
        {
            head = new QueueNode(info , head);//first node in the queue
            //head.getsLink().setsLink(head);
            tail = new QueueNode(head);
        }//the head will stay still
        else
        {
            head = new QueueNode(info , head);
            head.getsLink().setsLink(head);
        }//the tail will grow
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
            ans = "Empty List!";
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
    }//Method will printout the entire current queue list

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
    }//end inner class node
}