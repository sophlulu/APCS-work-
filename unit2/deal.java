public class GoodDealCheck {

    // Function to check if the sale price is a good deal (more than 25% discount)
    public static boolean goodDeal(double originalPrice, double salePrice) {
        return salePrice < 0.75 * originalPrice;
    }

    // Function to test goodDeal with multiple test cases
    public static void testGoodDeal() {
        System.out.println(goodDeal(100.0, 70.0) == true ? "Pass" : "Fail");  // 30% discount, good deal
        System.out.println(goodDeal(100.0, 75.0) == false ? "Pass" : "Fail"); // Exactly 25%, not a good deal
        System.out.println(goodDeal(200.0, 150.0) == false ? "Pass" : "Fail"); // 25% discount, not a good deal
        System.out.println(goodDeal(150.0, 100.0) == true ? "Pass" : "Fail");  // 33% discount, good deal
        System.out.println(goodDeal(50.0, 37.0) == true ? "Pass" : "Fail");   // 26% discount, good deal
        System.out.println(goodDeal(100.0, 80.0) == false ? "Pass" : "Fail"); // 20% discount, not a good deal
    }

    // Main method
    public static void main(String[] args) {
        testGoodDeal();
    }
}
