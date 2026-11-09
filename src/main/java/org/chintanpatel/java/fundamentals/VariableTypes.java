package org.chintanpatel.java.fundamentals;

public class VariableTypes {

    // Static Variable
    static String collegeName = "IIT Bombay";

    // Instance Variable
    int rollNumber = 101;

    public static void main(String[] args) {
        VariableTypes variableTypes = new VariableTypes();

        // Local Variable
        String studentName = "Chintan Patel";

        // Print all the variable types
        System.out.println("College Name       : " + VariableTypes.collegeName);
        System.out.println("Roll Number        : " + variableTypes.rollNumber);
        System.out.println("Student Name       : " + studentName);
    }
}
