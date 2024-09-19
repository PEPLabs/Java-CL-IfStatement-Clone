// This file is optional to edit and can be used for manual testing.

public class Main {

    /**
     * The entry point of the application.
     * 
     * This method creates an IfStatements object and manually tests its
     * methods by calling them and printing out the results.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        System.out.println("The IfStatements.ifExample method should return value a if bool is true, and value b if bool is false.");
        IfStatements ifLab = new IfStatements();

        System.out.println("Given the values true, a=2, b=4, the lab should return 2 and it returns the following: ");
        boolean bool1 = true;
        int a1 = 2;
        int b1 = 4;
        int output1 = ifLab.ifExample(bool1, a1, b1);
        System.out.println(output1);

        System.out.println("Given the values false, a=1, b=5, the lab should return 5 and it returns the following: ");
        boolean bool2 = false;
        int a2 = 1;
        int b2 = 5;
        int output2 = ifLab.ifExample(bool2, a2, b2);
        System.out.println(output2);
    }
}
