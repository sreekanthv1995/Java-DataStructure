package linkedlist;


public class LinkedList {

    public Node head;
    private Node tail;
    private int length;

    static class Node {

        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){

        if (length == 0) return null;
        Node temp = head;
        Node prev = head;

        while (temp.next!= null){
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if (length == 0) return null;

        Node temp = head;
        head = temp.next;
        temp.next = null;
        length --;
        if (length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >=length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i <index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index,int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index,int value){
        if (index < 0 || index > length) return false;
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index > length)return null;
        if (index == 0) return removeFirst();
        if (index == length-1) return removeLast();

        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){

        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void findMiddle(){

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.value);
    }

    public void loopExistOrNot(){
        Node fast = head;
        Node slow = head;

        while (slow != null && fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast){
                System.out.println("loop exists "+fast.value);
                break;
            }
        }
        if (slow == null || fast == null || fast.next == null) {
            System.out.println("No loop detected.");
        }
    }

    public Node removeDuplicate(){

        Node prev = head;
        Node temp = prev.next;

        while (temp != null){
            if (prev.value == temp.value){
                temp = temp.next;
                continue;
            }
            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }

}
