package MultiBracketValidation;

import java.util.Stack;

public class MultiBracketValidation {
// Creating  a function to varify brackets are balanced
    public static boolean multiBracketValidation(String input) {
        Stack<Character> bracketHolder = new Stack<>();

        char bracket;
        for (int i = 0; i < input.length(); i++) {
            bracket = input.charAt(i);
// checking for open Brackets
            if (bracket == '(')
                bracketHolder.push(bracket);
            else if (bracket == '{')
                bracketHolder.push(bracket);
            else if (bracket == '[')
                bracketHolder.push(bracket);
            // checking for Closing brackets and peeking
            else if (bracket == ')')
                if (bracketHolder.empty())
                    return false;
                else if (bracketHolder.peek() == '(')
                    bracketHolder.pop();
                else
                    return false;
            else if (bracket == '}')
                if (bracketHolder.empty())
                    return false;
                else if (bracketHolder.peek() == '{')
                    bracketHolder.pop();
                else
                    return false;
            else if (bracket == ']')
                if (bracketHolder.empty())
                    return false;
                else if (bracketHolder.peek() == '[')
                    bracketHolder.pop();
                else
                    return false;
        }
        return bracketHolder.empty();
    }
}
