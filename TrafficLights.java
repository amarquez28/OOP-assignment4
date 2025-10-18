public class TrafficLights {
    public static void main(String[] args) {
        Node s1 = new Node('R','R');
        Node s2 = new Node('G','R');
        Node s3 = new Node('Y','R');
        Node s4 = new Node('R','R');
        Node s5 = new Node('R','G');
        Node s6 = new Node('R','Y');
        LL TrafficStateLL = new LL(s1);
        TrafficStateLL.insertNode(s2);
        TrafficStateLL.insertNode(s3);
        TrafficStateLL.insertNode(s4);
        TrafficStateLL.insertNode(s5);
        TrafficStateLL.insertNode(s6);
        TrafficStateLL.printLL();
    }    
}
