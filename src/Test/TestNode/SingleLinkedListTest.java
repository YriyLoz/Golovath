package Test.TestNode;

public class SingleLinkedListTest {
    public static void main(String[] args) {

        Node node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node node0 = new Node(0, node1);


//        Node node0 = new Node(0, new Node(1, new Node(2, new Node(3, null))));
//        Node node0 = node(0, node(1, node(2, node(3, null))));


//        Node tmp = node0;
//        while (tmp != null) {
//            System.out.print(" " + tmp.value);
//            tmp = tmp.next;
//        }
//        System.out.println();
//
        Node tail = null;
//        tmp = tail;
//        while (tmp != null) {
//            System.out.print(" " + tmp.value);
//            tmp = tmp.next;
//        }

        for (int k = 0; k < 10; k++) {
            tail = new Node(k, tail);
        }

        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));
    }

    public static String toStringIter(Node ref) {
        String string = "";
        while (ref != null) {
            string += "(" + ref.value + ")->";
            ref = ref.next;
        }
        string += "null";
        return string;
    }

    public static String toStringRec(Node ref) {
        if (ref == null) {
            return "null";
        } else {
            return "(" + ref.value + ")->" + toStringRec(ref.next);
        }

    }

//    public static Node node(int value, Node next) {
//        return new Node(value, next);
//    }
}
