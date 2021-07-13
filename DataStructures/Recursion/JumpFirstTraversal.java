package Recursion;

/**
 * this is an algorithm to implement Jump First Traversal
 * it has 2 pointers called Jump and Next in a Node
 * the priority of traversal will be Jump first and then Next
 */
public class JumpFirstTraversal{
    public static void main(String[] args){
        JumpFirstTraversal j=new JumpFirstTraversal();
        Node n1=j.new Node();
        Node n2=j.new Node();
        Node n3=j.new Node();
        Node n4=j.new Node();
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n1.jump=n3;
        n3.jump=n2;
        n2.jump=n4;
        new JumpFirstTraversal(n1);
    }
    public JumpFirstTraversal(){

    }
    public JumpFirstTraversal(Node head){
        Integer currentOrder=0;
        traverse(head,currentOrder);
    }
    public void traverse(Node node, Integer currentOrder){
        if(node==null||node.val!=-1){
            return;
        }
        node.val=currentOrder++;
        System.out.println(node.val);
        traverse(node.jump,currentOrder);
        traverse(node.next,currentOrder);
    }
    public class Node{
        public int val;
        public Node next;
        public Node jump;
        public Node(){
            val=-1;
        }
    }
}