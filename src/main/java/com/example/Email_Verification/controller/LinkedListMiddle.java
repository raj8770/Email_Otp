package com.example.Email_Verification.controller;

 // Use existing ListNode class

public class LinkedListMiddle {

    // Method to find the middle node of a linked list
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Main method to test the findMiddle method
    public static void main(String[] args) {
        // Creating a sample linked list using the existing ListNode class
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Finding the middle node
        ListNode middle = findMiddle(head);

        // Printing the value of the middle node
        System.out.println("The middle node value is: " + middle.val);
    }

}

