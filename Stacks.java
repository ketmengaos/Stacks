public class Stacks {

    public static void main(String[] args) {
        String input = "[[]}{]";
        Matching match = new Matching(input);
        match.valid();
        System.out.println("True.");
    }
}