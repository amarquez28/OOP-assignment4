public class LL {
    Node head;
    Node tail;
    Node currState;

    public LL(){
        this.head = null;
        this.tail = null;
        this.currState = head;
    }
    public LL(Node headIn){
        this.head = headIn;
        this.tail = head;
        this.currState = head;
    }
    public LL(Node headIn, Node tailIn){
        this.head = headIn;
        this.tail = tailIn;
        this.currState = head;
    }

    public void insertNode(Node newNode){
        tail.next = newNode;
        this.tail = tail.next;
        this.tail.next = head;
    }
    public void advanceState() throws NullPointerException{
        if(currState.next != null){
            currState = currState.next;
        }
        else{
            throw new NullPointerException("Current state has no next state");
        }
    }

    public void printLL(){
        Node temp = head;
        int i = 1;
        while(temp != null && (i < 8)){
            System.out.println("Node "+i);
            temp.printNodeInfo();
            temp = temp.next;
            i++;
        }
    }

    
}
