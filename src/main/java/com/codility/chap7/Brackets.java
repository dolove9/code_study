package com.codility.chap7;

import java.util.Stack;

public class Brackets {
    public int solution(String S){
        Stack<Character> stack = new Stack<>();

        char[] chars = S.toCharArray();

        for(char c : chars){
            if(c == '{' || c == '[' || c =='('){
                stack.push(c);
            }

            if (c == '}'){
                if(stack.isEmpty()){
                    return 0;
                }
                if(stack.pop() != '{'){
                    return 0;
                }
            }
            if (c == ']'){
                if(stack.isEmpty()){
                    return 0;
                }
                if(stack.pop() != '['){
                    return 0;
                }
            }
            if (c == ')'){
                if(stack.isEmpty()){
                    return 0;
                }
                if(stack.pop() != '('){
                    return 0;
                }
            }
        }
        if(!stack.isEmpty()){
            return 0;
        }

        return 1;
    }
}
