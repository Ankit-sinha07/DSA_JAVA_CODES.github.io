package com.company.INFIX_PERFIX_POSTFIX;

import java.util.Stack;

public class Infix_to_Postfix {
        // I have Created a utility function that returns the precidence of a given operator(Higher returned value means higher Precedence)

        static int Precidence(char character){
            switch (character){
                case '+':
                case '-':
                    return 1; //Precedence is 1

                case '*':
                case '/':
                    return 2; //Precedence is 2

                case '^':
                    return 3; //Precedence is 3
            }
            return -1;
        }
        static String InfixToPostfix(String Expression){
            String result = new String("");
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < Expression.length(); i++){
                char c = Expression.charAt(i);

                if (Character.isLetterOrDigit(c))
                    result += c;

                else if (c == '(')
                    stack.push(c);

                else if (c == ')'){
                    while (!stack.isEmpty() && stack.peek() != '(')
                        result += stack.pop();
                    stack.pop();
                }
                else{
                    while(!stack.isEmpty() && Precidence(c) <- Precidence(stack.peek())){
                        result += stack.pop();
                    }
                    stack.push(c);
                }
            }
            while(!stack.isEmpty()){
                if (stack.peek() == '(')
                    return "EXPRESSION INVALID";
                result += stack.pop();
            }
            return result;
        }

        public static void main(String[] args) {
            String Expression = "(A+B)*(C+D)";
            System.out.println(InfixToPostfix(Expression));
        }
    }

