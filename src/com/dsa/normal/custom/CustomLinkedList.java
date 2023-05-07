package com.dsa.normal.custom;

public class CustomLinkedList {
    public static void main(String[] args) throws java.lang.Exception {
        ListNode nd = new ListNode();
        nd.insert(12);
        nd.insert(34);
        nd.insert(67);
        nd.insert(45);
        nd.insert(6);
        nd.delete(12);
        nd.printData();
    }
}

    class Node {
        public Node next;
        public int val;
        public Node(){
        }
        public Node(int data){
            this.val =data;
        }

    }
    class ListNode {
        public Node head;
        public ListNode(){
        }

        public void insert(int val){
            Node n=new Node(val);
            n.next=head;
            head=n;
        }
        public void delete(int d){
            Node t=head;
            int found=0;
            // to check if first number is d
            if(t.val ==d){
                found=1;
                head=head.next;
            }
            // to check other than first number
            else{
                Node t1=head;
                while(t!=null){
                    if(t.val ==d){
                        found=1;
                        break;
                    }
                    t1=t;
                    t=t.next;
                }
                if(found==1){
                    t1.next=t.next;
                }
            }
            if(found==0){
                System.out.println("number not found in linked list");
            }
        }
    public void printData() {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

