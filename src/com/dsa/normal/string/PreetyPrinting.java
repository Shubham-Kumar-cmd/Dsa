package com.dsa.normal.string;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a=134.12345f;
        System.out.printf("Formatted number is %.2f",a);

        System.out.printf("\npie is: %.3f",Math.PI);

        System.out.printf("\nMy name is %s and I am %s","shubham","cool");
    }
}
//    There are many format specifiers we can use. Here are some common ones:
//
//        %c - Character
//        %d - Decimal number (base 10)
//        %e - Exponential floating-point number
//        %f - Floating-point number
//        %i - Integer (base 10)
//        %o - Octal number (base 8)
//        %s - String
//        %u - Unsigned decimal (integer) number
//        %x - Hexadecimal number (base 16)
//        %t - Date/time
//        %n - Newline