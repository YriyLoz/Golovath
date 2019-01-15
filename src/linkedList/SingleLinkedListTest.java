package linkedList;

public class SingleLinkedListTest {
    public static void main(String[] args) {
        Node teal = null;


        for (int k = 5; k > 0; k--) {
            teal = new Node(k, teal);
        }



//        System.out.println(max(teal));
//        System.out.println(size(teal));
//        System.out.println(sum(teal));
//        System.out.println(size2(teal));
//        System.out.println(sum2(teal));


        while (teal != null) {
            System.out.println(teal.value);
            teal = teal.next;
        }
        add(teal);

        while (teal != null) {
            System.out.println(teal.value);
            teal = teal.next;
        }


    }


//    public static Node add(Node node, int value) {
//        Node rft = node;
//        while (rft != null) {
//            System.out.println(rft.value);
//            rft = rft.next;
//            if(rft==null){
//
//            }
//        }
//
//    }
//


//    public static int size(Node teal) {
//        Node rft = teal;
//        int a = 0;
//        while (rft != null) {
//            a++;
//            rft = rft.next;
//        }
//        return a;
//    }




//
//    public static int size2(Node teal) {
//        int a = 1;
//        if (teal == null) {
//            return 0;
//        } else {
//            size2(teal.next);
//            return a + size2(teal.next);
//
//        }
//    }
//


//
//    public static int sum(Node teal) {
//        Node rft = teal;
//        int a = 0;
//        while (rft != null) {
//            a += rft.value;
//            rft = rft.next;
//        }
//        return a;
//    }



//
//    public static int sum2(Node teal) {
//        if (teal == null) {
//            return 0;
//        } else
//            return teal.value + sum2(teal.next);
//    }



    public static Node add(Node teal) {
        if (teal != null) {
            add(teal.next);

        } else {
            teal = new Node(6, null);

        }
        return teal;
    }
}





