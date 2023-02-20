package gov.abacus;

class CalculatorClient {

    public static void main(String[] args){
        double sum = Calculator.add(3.1, 5.1);
        System.out.println("The sum: " + sum);

        System.out.println("The difference is: " + Calculator.subtract(3, 5)); // OK to pass int // upcast

        System.out.println("10 is even? " + Calculator.isEven(10));
        System.out.println(); // blank line

        int winner = Calculator.randomInt();
        System.out.println("The winner is: " + winner);
        System.out.println();

        // int[] inputs = { 2, 6, 6, 5}; // not necessary to store in variable
        double average = Calculator.average(2, 6, 6, 5);
        System.out.println(average);


    }
}
