public class Node {
    private char NS;
    private char EW;
    Node next;
    Node prev;    

    public Node(){
        this.next = null;
        this.prev = null;
    }

    public Node(char NSIn, char EWIn, Node nextIn, Node lastIn){
        this.NS = NSIn;
        this.EW = EWIn;
        this.next = nextIn;
        this.prev = lastIn;
    }

    public Node(char NSIn, char EWIn){
        this.NS = NSIn;
        this.EW = EWIn;
    }

    public char getNS() {
        return NS;
    }

    public void setNS(char nS) {
        NS = nS;
    }

    public char getEW() {
        return EW;
    }

    public void setEW(char eW) {
        EW = eW;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void printNodeInfo(){
        System.out.println("NS: "+this.NS+" EW: "+this.EW);
    }
}

