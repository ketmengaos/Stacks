import java.util.Stack;

public class Matching {
    private String input;

    public Matching(String s) {
        input = s;
    }

    public void valid() {
        Stack stack = new Stack();

        for (int i = 0; i < input.length(); i++) {
            char j = input.charAt(i);
            switch (j) {
                case '<':
                case '[':
                case '{':
                case '(':
                    stack.push(j);
                    break;
                case '>':
                case ']':
                case '}':
                case ')':
                    if (!stack.isEmpty()) {
                        Object k = stack.pop();
                        if ((k.equals("<") && j == '>') ||
                                (k.equals("[") && j == ']') ||
                                (k.equals("{") && j == '}') ||
                                (k.equals("(") && j == ')') ) {
                            System.out.println("False 1.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.println("False.");
                        System.exit(0);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("False.");
            System.exit(0);
        }
    }
}
