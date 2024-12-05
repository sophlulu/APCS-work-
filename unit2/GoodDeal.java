//GoodDeal.java

public class GoodDeal
{
    public static boolean goodDeal(double originalPrice, double salePrice)
    {
        if (salePrice < 0.75 * originalPrice){
            return true;
        }
        return false;
    }
    
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected, boolean result)
    {
        result = goodDeal(originalPrice, salePrice);
        
        System.out.print("original: " + originalPrice +
                " sale: " + salePrice + " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("Yes!");
        else
            System.out.println("No!");

    }

     public static void main(String[] args)
     {
        System.out.println();
        
        testGoodDeal(100, 70, true, true);
        testGoodDeal(100, 80, false, false);
        testGoodDeal(100, 45.6, true, true);
        testGoodDeal(150, 145.5, false, false);
        
        System.out.println();
     }
}
