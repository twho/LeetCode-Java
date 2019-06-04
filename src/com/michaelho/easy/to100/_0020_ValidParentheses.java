package com.michaelho.easy.to100;

import java.util.Stack;

class _0020_ValidParentheses {

    boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.substring(i, i+1)) {
                case "(":
                    stack.push(")");
                    break;
                case "[":
                    stack.push("]");
                    break;
                case "{":
                    stack.push("}");
                    break;
                default:
                    if (stack.empty()) {
                        return false;
                    }
                    String last = stack.pop();
                    if (!last.equals(s.substring(i, i+1))) {
                        return false;
                    } else {
                        break;
                    }
            }
        }
        return stack.empty();
    }
}
