package com.aeluri.practice.byteBybyte.linkedlist;

import java.util.Scanner;

/*
 * Given a linked list, and an input n, 
 * write a function that returns the nth-to-last element of the linked list.
 * list = 1 -> 2 -> 3 -> 4 -> 5 -> null
 * nthToLast(list, 0) = 5
 * nthToLast(list, 1) = 4
 * nthToLast(list, 4) = 1
 * nthToLast(list, 5) = null
 */
public class Nthtolastelement {
	static class Node {
		int data;
		Node next;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the list :");
		int s = sc.nextInt();
		System.out.println("Enter list values:");
		Node head = new Node();
		head.data = sc.nextInt();
		Node tail = head;
		for (int i = 2; i <= s; i++) {
			System.out.print(" --> ");
			Node temp = new Node();
			temp.data = sc.nextInt();
			tail.next = temp;
			tail = temp;
		}
		/*
		 * Node temp=head; while(temp!=null) { System.out.print(temp.data+" -->");
		 * temp=temp.next; }
		 */

		System.out.println("Enter n value to find Nthtolastelement");
		int n = sc.nextInt();
		Node res = findNthtolastelement(head, n);
		if (res != null)
			System.out.println(res.data);
		else
			System.out.println(res);
	}

	private static Node findNthtolastelement(Node head, int n) {
		Node current = head;
		Node follower = head;
		for (int i = 0; i < n; i++) {
			if (current == null)
				return null;
			current = current.next;
		}
		if (current == null)
			return null;
		while (current.next != null) {
			current = current.next;
			follower = follower.next;
		}
		return follower;

	}

}
