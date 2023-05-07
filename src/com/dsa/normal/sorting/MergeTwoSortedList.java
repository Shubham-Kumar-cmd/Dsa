package com.dsa.normal.sorting;

public class MergeTwoSortedList {
    public static void main(String[] args) {

    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        Node node=new Node();
//        ListNode result=new ListNode();
//        ListNode head=result;
//
//        while (list1!= null && list2!= null){
//            if (list1.val<list2.val){
//                result.next=list1;
//                list1=list1.next;//incrementing the index by 1
//            }
//            else {//list1.val>list2.val
//                result.next=list2;
//                list2=list2.next;//incrementing the index by 1
//            }
//            result=result.next;
//        }
//
//
//        //it may be possible that one of the arrays is not complete
//        //copy the remaining arrays element
//        while (list1!=null){
//            result.next=list1;
//        }
//        while (list2!=null){
//            result.next=list2;
//        }
//        return head.next;//copying all the elements from result to head
//    }
//

}

