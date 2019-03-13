package com.company;

public class Main {

    public static void main(String[] args) throws StringIndexOutOfBoundsException, MyException {

        try {
            Test.myMethod();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("CATCH IS WORKS for StringIndexOutOfBoundsException!");
        } finally {
            throw new MyException("String can not be empty!");
        }
    }
}
