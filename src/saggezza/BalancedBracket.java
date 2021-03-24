package saggezza;

import java.util.Stack;

public class BalancedBracket {
    /* A bracket is considered to be any one of the following characters: ( ) { } [ or ].
    Two brackets are a matched pair if the an opening bracket i.e. ( [ or { occurs to the left of a closing bracket i.e. ) ] or } of the same type. There are three types of matched pairs of brackets: [], {}, and ().
    A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].
    By this logic, we say a sequence of brackets is balanced if the following conditions are met:
    It contains no unmatched brackets.
    The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
    Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.
    Function Description - Complete the function isBalanced in the editor below.
    isBalanced has the following parameter(s):
    s: a string of brackets
    Constraints
    All characters are in the sequences { }  ( ) and  [ ].
    Output Format
    For each string, return YES or NO: YES if the sequence is balanced or NO if it is not.
    */
    public static void main(String[] args) {
        balancedBracket("(())}");
    }
    public static boolean balancedBracket(String expr){
        // Using ArrayDeque is faster than using Stack class
        //Deque<Character> stack = new ArrayDeque<Character>();
        Stack<Character> stack = new Stack<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // IF current current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
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

        // Check Empty Stack
        return (stack.isEmpty());
    }

}
