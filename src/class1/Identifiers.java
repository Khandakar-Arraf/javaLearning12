public class Identifiers {
    public static void main(String[] args) {
        //Rule:1 identifiers can contain [a-z][A-Z][0-9]$_
        String an_input= "testing java";
        Double $balance = 9.02;

        //Rule:2 identifiers cannot start with numbers
        // 9var = "a variable";

        //Rule:3 Identifiers cannot have a space in-between
        // String bank data = "PCI-DSS";

        //Rule:4 Identifiers cannot have Java reserved keyword
        // String class = "class";

        //Rule:5 Identifiers are case-sensitive
        String Axioms = "This is Axioms";
        String axioms = "This is axioms";

        //printing valid identifiers
        System.out.println("Valid Identifiers:");
        System.out.printf(an_input+"\n"+$balance+"\n"+axioms+"\n"+Axioms);
    }
}
