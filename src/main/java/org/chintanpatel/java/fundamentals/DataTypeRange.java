package org.chintanpatel.java.fundamentals;

public class DataTypeRange {
    public static void main(String[] args) {

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println("Byte Range: " + minByte + " to " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        System.out.println("Short Range: " + minShort + " to " + maxShort);

        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;

        System.out.println("Char Range: " + (int)minChar + " to " + (int)maxChar);

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        System.out.println("Int Range: " + minInt + " to " + maxInt);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("Long Range: " + minLong + " to " + maxLong);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        System.out.println("Float Range: " + minFloat + " to " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("Double Range: " + minDouble + " to " + maxDouble);
    }
}
