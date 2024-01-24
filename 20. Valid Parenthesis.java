// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) { 
            if (c == '(')
                stack.push(')');
            else if (c == '{') 
                stack.push('}'); 
            else if (c == '[') 
                stack.push(']'); 
            else if (stack.isEmpty() || stack.pop() != c) 
            // if the character is a closing bracket
            // if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
            // does not match the closing bracket, the string is not valid, so return false
                return false;
        }
        // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
        // so the string is valid, otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }
}


Accepted
SENTHIL
SENTHIL
submitted at Jan 24, 2024 21:54

Editorial

Solution
Runtime
1
ms
Beats
98.66%
of users with Java
