package com.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class Test {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0){
            return false;
        }

        return jude(sequence, 0, sequence.length - 1);
    }

    public static boolean jude(int[] array, int start, int end){

        if (end < start){
            return true;
        }
        int p = start;
        int val = array[end];
        for (; p < end && array[p] < val; p++);

        for (int i = p; i <= end; i++){

            if (array[i] < val){
                return false;
            }
        }
        return jude(array, start, p-1) && jude(array, p+1, end);
    }
    public static void main(String[] args) {
        LinkedList<Object> objects = new LinkedList<>();
        objects.pollFirst();

    }
    Stack<Integer> stack = new Stack<>();
    int min;
    public void push(int node) {
        stack.push(node);
        System.out.println(stack.isEmpty());
        if (min > node || stack.isEmpty()) {
            min = node;
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.pop();
    }

    public int min() {
        return min;
    }
}
