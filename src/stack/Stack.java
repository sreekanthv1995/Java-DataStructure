package stack;

public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    public Stack(int value){
        top = new Node(value);
        height = 1;
    }

    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public void printTop(){
        System.out.println(top.value);
    }

    public Node pop(){
        if (height == 0) return null;
        Node temp = top;
        top = temp.next;
        temp.next = null;
        height--;
        return temp;
    }
}
