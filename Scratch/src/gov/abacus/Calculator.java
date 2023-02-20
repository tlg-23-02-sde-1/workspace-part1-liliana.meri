package gov.abacus;
/*
*
* This is an "all-static" class i.e., a class definition with nothing but
* static methods. These are called from the client as Calculator.methodName()
* no new calcs, no need for new calc
*/


class Calculator {
    // pass in one and a list of numbers
    public static double average(int first, int... rest){ // 2, 6, 6, 5 (sum is 19)
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum+= value; // sum = sum + value
        }

        result = sum / (rest.length + 1);
        return result;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


    /**
     * Returns a random integer between 1 and 14
     *
     * HINT: see a class called Math in the Java API (package java. lang).
     * look for a helpful method here to get you started
     * NOTE: these methods in the Math class are all "Static", which means you call them as so:
     *  Math.methodName()
     *
     *  getRandomNum()
     *  randNum()
     *  randInt()
     *  rand()
     *
     */
//    public static int randomInt() {
//        // declare the return value (as a local variable)
//        int result = 0;
//
//        // use a few "local" variables to get the job done
//        double rand = Math.random(); // 0.000000 to 0.999999
//        double scaled = (rand * 14) + 1; // 1.000000 to 14.999999
//
//        //explicit downcast from 64-bit double to 32-bit int
//        result = (int) scaled;          // 1 to 14
//        return result;
//    }

    public static int randomInt() {
        return randomInt(1, 14); // delegate to the min-max
   }

    //    public static int randomInt(int max){
    //        return randomInt(1, max);
    //    }
    /*
    * Returns a random integer between 'min' and 'max' (inclusive).
    * We use the same method name as above for simplicity from the client perspective
    * That is, the client has two "flavors" of randomInt to choose from.
    * That is called method "overloading"
    */
    public static int randomInt(int min, int max) { // e.g., 5 to 75
        int result = 0;
        double rand = Math.random(); // 0.00000 to 0.999999
        double scaled = (rand * (max - min + 1)) + min; // 5.00000 tp 74.999999

        return result;
    }

}
