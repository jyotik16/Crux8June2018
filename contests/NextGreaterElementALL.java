package contest1;
import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElementALL {

    public static void printNextGreaterElement(int[] input) {
        Stack<Integer> stack = new Stack<Integer>();
        int inputSize = input.length;
        stack.push(input[0]);
        //System.out.println(stack.push(input[0]));
        for (int i = 1; i < inputSize; i++) {
            while (!stack.isEmpty() && stack.peek() < input[i]) {
                System.out.println(" "
                                    + stack.pop() + "\t = " + input[i]);
            }
            stack.push(input[i]);
            //System.out.println(stack.push(input[i]));
        }
        while (!stack.isEmpty()) {
            int top = (int) stack.pop();
            System.out.println(" " + top + "\t = " + null);
        }
    }
 
    public static void main(String[] args) {
        int[] input = { 98, 23, 54, 12, 20, 7, 27 };
        printNextGreaterElement(input);
    }

}
