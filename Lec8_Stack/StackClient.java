package Lec8_Stack;

import java.util.Scanner;

public class StackClient {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		Stack S = new Stack();
//		S.pop();
//		S.push(10);
//		S.push(20);
//		S.push(30);
//		S.push(40);
//		S.push(50);
//		S.display();
//		S.peek();
//		int[] arr = { 8, 3, 6, 7, 10, 20, 40, 5, 15, 20 };
//		nextGreaterElement(arr);
		int[] prices = { 90, 40, 50, 30, 80 };
		int[] ans = stock_Span(prices);
		for (int val : ans) {
			System.out.println(val);
		}

	}


	public static void nextGreaterElement(int[] arr) throws Exception {
		Stack s = new Stack();
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i]>s.peek()) {
				System.out.println(s.pop() + "," + arr[i]);
			}
			s.push(arr[i]);
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop() + "," + "-1");
		}
	}

	public static int[] stock_Span(int[] prices) throws Exception {
		int[] span = new int[prices.length];
		Stack s = new Stack();
		for (int i = 0; i < prices.length; i++) {
			while (!s.isEmpty() && prices[i] > prices[s.peek()]) {

				s.pop();
			}
			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.peek();
			}
			s.push(i);
		}
		return span;
	}


	public static void displayReverse(Stack s) throws Exception {
		if (s.isEmpty()) {

			return;
		}
		int value = s.pop();

		displayReverse(s);
		System.out.println(value);

		s.push(value);

	}

	public static void actualreverse(Stack s, Stack helper) throws Exception {
		if (s.isEmpty()) {
			if (helper.isEmpty()) {
				return;
			}
			int temp = helper.pop();
			actualreverse(s, helper);
			s.push(temp);
			return;
		}
		int value = s.pop();
		helper.push(value);
		actualreverse(s, helper);

	}

}
