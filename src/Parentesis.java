import java.util.LinkedList;
import java.util.Stack;

public class Parentesis {

    public static boolean esBalanceado(String cadena){
        boolean balanced;
        Stack<Character> cola = new Stack<>();
        char c;

        for (int i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                cola.push(c);
            }
            else if (c == ']' || c == '}' || c == ')') {
                if (cola.isEmpty()) {
                    return false;
                }
                else {
                    Character removed = cola.pop();
                    switch (c) {
                        case '}':
                            balanced = removed == '{';
                            break;
                        case ')':
                            balanced = removed == '(';
                            break;
                        case ']':
                            balanced = removed == '[';
                            break;
                        default:
                            balanced = false;
                    }
                    if (!balanced)
                        return false;
                }
            }
        }
        return cola.isEmpty();
    }

}