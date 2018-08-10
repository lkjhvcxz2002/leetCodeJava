package medium;

import java.awt.List;

public class _2QQ {
	public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
	}
	
	static int count = 0;
	static ListNode finalResult = new ListNode(0);
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		System.out.println(addTwoNumbers(l1, l2).val);
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode prev = new ListNode(0), head = prev;
		int carry = 0, sum = 0;
        
        while(l1 != null || l2 != null || carry != 0) {
        	ListNode cur = new ListNode(0);
        	sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
        	cur.val = sum % 10;
        	carry = sum / 10;
        	prev.next = cur;
        	prev = cur;
        	
        	l1 = l1 == null ? l1 : l1.next;
        	l2 = l2 == null ? l2 : l2.next;
        }
        return head.next;
//		ListNode result = new ListNode(0);
//		count++;
//		int temp = 0;
//		
//		if(l1.next != null || l2.next != null) {
//			if(l1.next == null) {
//				temp = addTwoNumbers(new ListNode(0), l2.next).val;
//			} else if (l2.next == null) {
//				temp = addTwoNumbers(l1.next, new ListNode(0)).val;
//			} else {
//				temp = addTwoNumbers(l1.next, l2.next).val;
//			}
//		}
//		
//		count--;
//		result.val = (int) ((l1.val * Math.pow(10, count)) + (l2.val *  Math.pow(10, count))) + temp;
//		System.out.println(result.val);
//		if(count != 0) {
//			ListNode newNode = new ListNode(0);
//			finalResult.val = (int) ((int) result.val / Math.pow(10, count));
//			newNode.next = finalResult;
//			finalResult = newNode;
//			return result;
//		} else {
//			return finalResult.next;
//		}
    }

}
