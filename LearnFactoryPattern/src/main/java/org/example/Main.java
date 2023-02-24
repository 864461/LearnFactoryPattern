package org.example;

public class Main {
    public static void main(String[] args) {
    PointCoordinates test = PointCoordinates.Factory.useCortasianCoordinates(3.0,1.2);
    PointCoordinates test2 = PointCoordinates.Factory.usePolarCoordinates(3.0,1.2);
        System.out.println("this is  cortasian " + test.toString());
        System.out.println("this is polar" + test2.toString());
    }
}