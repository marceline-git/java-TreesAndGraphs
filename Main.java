public class Main {
    public static void main(String[] args) {
        Node n = new Node(10);
        n.insert(5);
        n.insert(3);
        n.insert(14);
        n.insert(18);
        n.insert(11);
        System.out.println(n.contains(11));
        System.out.println("In-Order");
        n.printInOrder();
        System.out.println("Pre-Order");
        n.printPreOrder();
        System.out.println("Post-Order");
        n.printPostOrder();
    }
}
