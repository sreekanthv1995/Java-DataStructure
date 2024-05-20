package linkedlist;

import stack.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.append(1);
        list.append(2);
        list.append(2);
        list.append(2);
        list.append(2);
        list.append(3);


//        list.removeDuplicate();




//        list.printList();
//        list.insert(3,4);

//        System.out.println();
//        list.reverse();
//        list.printList();

//        list.findMiddle();

        list.head.next.next.next= list.head.next;
        list.loopExistOrNot();
    }
}
