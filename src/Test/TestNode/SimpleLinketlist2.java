package Test.TestNode;

public class SimpleLinketlist2 {
    public static void main(String[] args) {
        Node tailA = generateIter0(9);
        Node tailB = generateIter1(9);
        Node tail0 = generateRecurs0(9);
        Node tail1 = new Node(9, null);
        generateRecurs1(tail1);

    }

    public static Node generateIter0(int max) {
        Node result = null;
        for (int k = 0; k < max; k++) {
            result = new Node(k, result);
            System.out.println(result.value);
        }
        return result;
    }

    public static Node generateIter1(int max) {
        Node tail = new Node(max, null);
        Node head = tail;
        for (int k = max; k > 0; k--) {
            head.next = new Node(k - 1, null);
            head = tail.next;

        }
        return head;
    }

    public static Node generateRecurs0(int value) {
        if (value >= 0) {
            return new Node(value, generateRecurs0(value - 1));
        } else {
            return null;
        }

    }


    public static Node generateRecurs1(Node tail) {
        if (tail.value > 0) {
            tail.next = new Node(tail.value - 1, null);
            generateRecurs1(tail.next);
        }
        return null;


    }
}
