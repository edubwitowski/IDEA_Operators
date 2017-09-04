package com.company;

    class Arithmetic {

    public static void main (String[] args) {

        boolean success = true;


        int result = 1 + 11;
        //result is now 12
        System.out.println("11 + 1 = " + result);
        int first_result =  result;
        System.out.println(success);
        // true

        result = result - 1;
        // result is now 11
        System.out.println(first_result + " - 1 = " + result);
        first_result = result;
        System.out.println(success);

        result = result * 2;
        // result is now 22
        System.out.println(first_result + " * 2 = " + result);
        first_result = result;
        System.out.println(success);

        result = result / 2;
        // result is now 11
        System.out.println(first_result + " / 2 = " + result);
        first_result = result;
        System.out.println(success);

        result = result + 10;
        // result is now 21
        System.out.println(first_result + " + 10 = " + result);
        first_result = result;
        System.out.println(success);

        result = result % 4;
        // result is now
        System.out.println(first_result + " % 4 = " + result);
        System.out.println(!success);

        //boolean (success) = True;


}
}
