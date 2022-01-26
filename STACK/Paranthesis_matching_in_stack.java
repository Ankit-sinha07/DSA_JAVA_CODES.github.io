package com.company;
import java.util.*;
public class Paranthesis_matching_in_stack {
    static boolean BracketBalance(String expr) {
        //I have used ArrayDeque because it is faster than using stack class
        Deque<Character> stack = new ArrayDeque<Character>();
        //This is the code for transversing the Expression to find the bracket

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;

            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x){
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        //check if the stack is empty or not
        return (stack.isEmpty());
    }

    public static void main(String[] args) {

        //I have Created a Scanner class to make user Enter the parenthesis
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parenthesis for correction:- ");
        String expr = sc.next();

        if (BracketBalance(expr))
            System.out.println("Parenthesis Balanced");
        else
            System.out.println("Parenthesis Not Balanced");
    }
}
