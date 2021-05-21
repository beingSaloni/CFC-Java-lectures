package com.company.rough;

import com.company.lecture20.CircularQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class ListNode {

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}

//public class Rough25 {
//
//
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//
//
//    // Driver code
////    public Node flatten(Node head) {
////        Node copy = head;
////        Stack<Node> s = new Stack<>();
////
////        while(copy != null){
////            if(copy.child != null){
////                s.push(copy.next);
////                copy.next = copy.child;
////            }
////
////            copy =copy.next;
////            if(copy == null && !s.isEmpty()){
////                copy = s.pop();
////            }
////        }
////
////        return head;
////
////    }
////    public static void main(String[] args)
////    {
////        ListNode head1 = new ListNode(1);
////        head1.next = new ListNode(3);
////        head1.next.next = new ListNode(5);
////
////        // 1->3->5 LinkedList created
////        ListNode head2 = new ListNode(0);
////        head2.next = new ListNode(2);
////        head2.next.next = new ListNode(4);
////
////        // 0->2->4 LinkedList created
////        ListNode mergedhead = flatten(head1);
////
////        printList(mergedhead);
////    }
////}
