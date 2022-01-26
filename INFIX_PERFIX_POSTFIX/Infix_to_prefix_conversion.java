package com.company.INFIX_PERFIX_POSTFIX;
import java.util.*;
public class Infix_to_prefix_conversion {
 // Function to check if
// given character is
// an operator or not.
        static boolean isOperator(char c)
        {
            return (!(c >= 'a' && c <= 'z') &&
                    !(c >= '0' && c <= '9') &&
                    !(c >= 'A' && c <= 'Z'));
        }

        // Function to find priority
// of given operator.
        static int getPriority(char C)
        {
            if (C == '-' || C == '+')
                return 1;
            else if (C == '*' || C == '/')
                return 2;
            else if (C == '^')
                return 3;
            return 0;
        }

        // Function that converts infix
// expression to prefix expression.
        static String infixToPrefix(String infix)
        {
            // stack for operators.
            Stack<Character> operators = new Stack<Character>();

            // stack for operands.
            Stack<String> operands = new Stack<String>();

            for (int i = 0; i < infix.length(); i++)
            {

                if (infix.charAt(i) == '(')
                {
                    operators.push(infix.charAt(i));
                }

                else if (infix.charAt(i) == ')')
                {
                    while (!operators.empty() &&
                            operators.peek() != '(')
                    {

                        // operand 1
                        String op1 = operands.peek();
                        operands.pop();

                        // operand 2
                        String op2 = operands.peek();
                        operands.pop();

                        // operator
                        char op = operators.peek();
                        operators.pop();

                        String tmp = op + op2 + op1;
                        operands.push(tmp);
                    }


                    operators.pop();
                }


                else if (!isOperator(infix.charAt(i)))
                {
                    operands.push(infix.charAt(i) + "");
                }

                else
                {
                    while (!operators.empty() &&
                            getPriority(infix.charAt(i)) <=
                                    getPriority(operators.peek()))
                    {

                        String op1 = operands.peek();
                        operands.pop();

                        String op2 = operands.peek();
                        operands.pop();

                        char op = operators.peek();
                        operators.pop();

                        String tmp = op + op2 + op1;
                        operands.push(tmp);
                    }

                    operators.push(infix.charAt(i));
                }
            }

            while (!operators.empty())
            {
                String op1 = operands.peek();
                operands.pop();

                String op2 = operands.peek();
                operands.pop();

                char op = operators.peek();
                operators.pop();

                String tmp = op + op2 + op1;
                operands.push(tmp);
            }

            return operands.peek();
        }

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Infix expression to Convert into Prefix Expression:- ");
            String s = sc.next();
            System.out.println(infixToPrefix(s));

        }
    }


