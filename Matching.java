import java.util.Stack;

public class Matching {
    private String input;

    public Matching(String s) {
        input = s;
    }

    public void valid() {
        Stack<Character> stack = new Stack<Character>();

	System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            char j = input.charAt(i);
	    //System.out.println("Push J: " + j);  //-- Used this to test values.
            switch (j) {
                case '<':
                case '[':
                case '{':
                case '(':
                    stack.push(j);
			//System.out.println("Push J: " + j); 
                    break;
                case '>':
                case ']':
                case '}':
                case ')':
                    if (!stack.isEmpty()) {
                        Character chara = (Character) stack.pop();
			//System.out.println("Pop k = " + chara + j);  //	-- Used this to test values.
                        if (j == '>' && chara != '<') {
				System.out.println("False.");
				System.exit(0);
			}
                        if (j == ']' && chara != '[') {
				System.out.println("False.");
				System.exit(0); 
			}
                        if (j == '}' && chara != '{') {
				System.out.println("False.");
				System.exit(0);
			}
                        if (j == ')' && chara != '(') {
				System.out.println("False.");
				System.exit(0); 
			}
		    }
                    else {
                        System.out.println("False.");
                        System.exit(0);
                    }
                    break;
                default:
			//System.out.println("Number: " + j);
                    break;
            }
        }
    }
}
