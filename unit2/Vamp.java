public class VampireCheck {

    // Function to determine if the person is a vampire
    public static boolean isVampire(float hour, boolean awake) {
        // Waking hours are between 6:00 (6.0) and 22:00 (22.0)
        boolean isWakingHours = hour >= 6.0 && hour <= 22.0;

        // A person is a vampire if they are awake during sleeping hours or asleep during waking hours
        return (awake && !isWakingHours) || (!awake && isWakingHours);
    }

    // Function to test isVampire with multiple test cases
    public static void testIsVampire() {
        System.out.println(isVampire(5.5f, true) == true ? "Pass" : "Fail");  // Awake before 6:00
        System.out.println(isVampire(6.5f, false) == true ? "Pass" : "Fail"); // Asleep during waking hours
        System.out.println(isVampire(21.5f, false) == true ? "Pass" : "Fail"); // Asleep during waking hours
        System.out.println(isVampire(23.0f, true) == true ? "Pass" : "Fail"); // Awake after 22:00
        System.out.println(isVampire(10.0f, true) == false ? "Pass" : "Fail"); // Awake during waking hours
        System.out.println(isVampire(2.0f, false) == false ? "Pass" : "Fail"); // Asleep during sleeping hours
    }

    // Main method
    public static void main(String[] args) {
        testIsVampire();
    }
}
