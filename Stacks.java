//**********************************************************************************
//******** || Ket-Meng Jimmy Cheng    ~    March 18, 2016    ~    Stacks || ********
//******** || ---------------------------------------------------------- || ********
//******** || This program takes an input String and returns true or     || ********
//******** || false, depending on whether or not the String is properly  || ********
//******** || formatted in terms of its delimiters.                      || ********
//**********************************************************************************

public class Stacks {

    public static void main(String[] args) {
        String input = "{}{}{}{}{}[4]35<4366({})4>"; //Add input here
        Matching match = new Matching(input);
        match.valid();
        System.out.println("True.");
    }
}
