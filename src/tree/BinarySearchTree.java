package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    BinarySearchTree(){
        root = null;
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true){
            if (newNode.value == temp.value)return false;
            if (newNode.value < temp.value){
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }else {
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }


    public boolean contains(int value){

        Node temp = root;
        while(temp != null){
            if (value < temp.value){
                temp = temp.left;
            }else if (value > temp.value){
                temp = temp.right;
            }else {
                return true;
            }
        }
        return false;
    }

    public boolean rContains(int value){
        return rContains(root,value);
    }

    private boolean rContains(Node currentNode, int value){

        if (currentNode == null) return  false;
        if (currentNode.value == value) return true;

        if (value > currentNode.value){
            return rContains(currentNode.right,value);
        }else {
            return rContains(currentNode.left,value);
        }
    }

    public void rInsert(int value){
        rInsert(root,value);
    }

    private Node rInsert(Node currentNode,int value){

        if (currentNode == null) return new Node(value);
        if(value < currentNode.value){
            currentNode.left= rInsert(currentNode.left,value);
        }else {
            currentNode.right = rInsert(currentNode.right,value);
        }
        return currentNode;
    }

    public ArrayList<Integer>BFS(){
        Node currentNode = root;
        Queue<Node>queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0){
            currentNode = queue.remove();
            result.add(currentNode.value);

            if (currentNode.left != null){
                queue.add(currentNode.left);
            }
            if (currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return result;
    }


}
