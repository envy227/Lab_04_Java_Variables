public class Main {
    public static void main(String[] args) {

        // Integer variables
        int intOperandA = 10;
        int intOperandB = 3;
        int intSum, intProduct, intDifference, intQuotient, intModulo;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // Double variables
        double doubleOperandA = 10.5;
        double doubleOperandB = 3.2;
        double doubleSum, doubleProduct, doubleDifference, doubleQuotient;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        // Other variables
        double myLunchCost = 12.50;
        int familySize = 4;
        boolean isRaining = false;
        double gasPrice = 3.75;
        int favoriteNumber = 7;
        double shoeSize = 7.5;
        int birthMonth = 9;
        String fullName = "Khushi Devadiga";

        System.out.println("The cost of my lunch is: " + myLunchCost);
        System.out.println("My family has " + familySize + " members.");
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of gas is $" + gasPrice);
        System.out.println("My favorite number is: " + favoriteNumber);
        System.out.println("My shoe size is: " + shoeSize);
        System.out.println("My birth month is: " + birthMonth);
        System.out.println("My full name is: " + fullName);
    }
}
