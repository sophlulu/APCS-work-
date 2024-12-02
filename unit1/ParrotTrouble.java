public class ParrotTrouble {
    // Function to check if we're in trouble based on the parrot talking and the hour
    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    // Function to test parrotTrouble with multiple test cases
    public static void testParrotTrouble() {
        System.out.println(parrotTrouble(true, 6) == true ? "Pass" : "Fail");
        System.out.println(parrotTrouble(true, 7) == false ? "Pass" : "Fail");
        System.out.println(parrotTrouble(false, 6) == false ? "Pass" : "Fail");
        System.out.println(parrotTrouble(true, 21) == true ? "Pass" : "Fail");
        System.out.println(parrotTrouble(false, 22) == false ? "Pass" : "Fail");
    }

    // Main method
    public static void main(String[] args) {
        testParrotTrouble();
    }
}
