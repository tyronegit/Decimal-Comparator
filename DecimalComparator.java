public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Multiply by 1000 to move three decimal places to the left
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        // Check if the scaled numbers are equal
        return scaledNum1 == scaledNum2;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
    }
}

