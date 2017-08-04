package ReverseLinkedList;

import java.util.ArrayList;

/*
 * 
 * 题目描述
 *输入一个链表，从尾到头打印链表每个节点的值。 
 * 
 */

public class Solution {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<Integer>();
			ListNode prev = null;
			ListNode next = null;
			while(listNode != null){
				next = listNode.next;
				listNode.next = prev;
				prev = listNode;
				listNode = next;
			}
			
		while(prev != null){
			result.add(prev.val);
			prev = prev.next;
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		System.out.println(new Solution().printListFromTailToHead(n1).toString());

	}

}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
