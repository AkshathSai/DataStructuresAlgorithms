package org.example.algorithms.stack;

import lombok.extern.slf4j.Slf4j;
import org.example.datastructures.stacks.using_lists.Stack;

@Slf4j
public class InfixToPostfixConvertor {

    public static void main(String[] args) {

        String infix = "a+b*c-d/e";
        char[] charArray = inToPostConvertor(infix.trim().toCharArray());
        for (int i = 0; i<charArray.length; i++) {
            System.out.print(charArray[i]);
        }

        String infix2 = "a+b*c+(d*e)";
        char[] charArray2 = inToPostConvertor(infix2.trim().toCharArray());
        for (int i = 0; i<charArray2.length; i++) {
            System.out.print(charArray2[i]);
        }

        String infix3 = "a-b-c";
        char[] charArray3 = inToPostConvertor(infix3.trim().toCharArray());
        for (int i = 0; i<charArray3.length; i++) {
            System.out.print(charArray3[i]);
        }

        String infix4 = "a/b^c-d";
        char[] charArray4 = inToPostConvertor(infix4.trim().toCharArray());
        for (int i = 0; i<charArray4.length; i++) {
            System.out.print(charArray4[i]);
        }

        String infix5 = "a*(b+c)/d";
        char[] charArray5 = inToPostConvertor(infix5.trim().toCharArray());
        for (int i = 0; i<charArray5.length; i++) {
            System.out.print(charArray5[i]);
        }

        String infix6 = "a+(b*c(d/e^f)*g)*h)";
        char[] charArray6 = inToPostConvertor(infix6.trim().toCharArray());
        for (int i = 0; i<charArray6.length; i++) {
            System.out.print(charArray6[i]);
        }
    }

    public static char[] inToPostConvertor(char[] charArray) {

        Stack<Character> operatorStack = new Stack<>();

        char[] postfix = new char[charArray.length];

        int j = 0;

        for (int i=0; i<charArray.length; i++) {

            if (isOperator(charArray[i])) {

                if (operatorStack.isStackEmpty()) {
                    operatorStack.push(charArray[i]);
                } else if (precedence(charArray[i]) > precedence(operatorStack.peek())) {
                    operatorStack.push(charArray[i]);
                } else {
                    do {
                        postfix[j++] = operatorStack.pop();
                    } while (!operatorStack.isStackEmpty());
                    operatorStack.push(charArray[i]);
                }
            } else if (isOpenParenthesis(charArray[i])) {
                operatorStack.push(charArray[i]);
            } else if (isCloseParenthesis(charArray[i])){
                char poppedToken = 0;
                do {
                    poppedToken = operatorStack.pop();
                    if (!isOpenParenthesis(poppedToken)) {
                        postfix[j++] = poppedToken;
                    }
                } while (!operatorStack.isStackEmpty() && !isCloseParenthesis(operatorStack.peek()));
            } else {
                //Operand
                postfix[j++] = charArray[i];
            }
        }

        while (!operatorStack.isStackEmpty()) {
            postfix[j++] = operatorStack.pop();
        }

        return postfix;
    }

    public static boolean isOperator(char character) {

        if (character == '+' || character == '-' || character == '*' || character == '^' || character == '%' || character == '/') {
            return true;
        }

        return false;
    }

    public static int precedence(char ch) {

        if (ch == '^') {
            return 4;
        } else if (ch == '%') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }

        return 0; //If the stack is empty
    }

    public static boolean isOpenParenthesis(char character) {
        return character == '(';
    }

    public static boolean isCloseParenthesis(char character) {
        return character == ')';
    }

}
