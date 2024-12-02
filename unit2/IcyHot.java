public class IcyHot {

    // Method to check if one temperature is less than 0 and the other is greater than 100
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    // Test method to validate the function with different cases
    public void testIcyHot() {
        System.out.println("icyHot(120, -1) → " + icyHot(120, -1) + " (Expected: true)");
        System.out.println("icyHot(-1, 120) → " + icyHot(-1, 120) + " (Expected: true)");
        System.out.println("icyHot(2, 120) → " + icyHot(2, 120) + " (Expected: false)");
        System.out.println("icyHot(-5, 150) → " + icyHot(-5, 150) + " (Expected: true)");
        System.out.println("icyHot(101, -10) → " + icyHot(101, -10) + " (Expected: true)");
    }

    // Main method to run the test cases
    public static void main(String[] args) {
        IcyHot tester = new IcyHot();
        tester.testIcyHot();
    }
}
