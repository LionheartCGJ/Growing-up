package com.newcode.stack.consturct;

import java.util.Stack;

/*
 * 
 *题目描述
 *用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 
 */

public class Solution {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        System.out.print(test.pop() + ",");
        System.out.print(test.pop() + ",");
        System.out.print(test.pop() + ",");
        System.out.print(test.pop() + ",");

    }

}
