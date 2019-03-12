package com.company;

public class Main {

    public static void myMethod() throws StringIndexOutOfBoundsException {
        String x = "MyString";
        for (int i = -3; i < 10; i++) {
            System.out.println(x.charAt(i));
        }
    }

    public static void main(String[] args) {

        try {
            myMethod();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("CATCH IS WORKS for StringIndexOutOfBoundsException!");
        } finally {
            throw new IllegalStateException();
        }
    }
}
