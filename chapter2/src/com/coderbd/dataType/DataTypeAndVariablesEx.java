package com.coderbd.dataType;

public class DataTypeAndVariablesEx {

    // primitive data type
    static byte byteVar = 127;// 8 Bits
    static short shortVar = 32767;// 16 Bits
    static int intVar = 2147483647;// 32 Bits
    static long longVar = 2147483648L;// 64 Bits
    static float floatVar = 2147483647.0F;// 32 Bits
    static double doubleVar = 2147483648.0;// 64 Bits
    static char charVar = 'A';
    static boolean booleanVar = true;

    // referance data type
    static String name;

    public static void main(String[] args) {

        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
    }
}
