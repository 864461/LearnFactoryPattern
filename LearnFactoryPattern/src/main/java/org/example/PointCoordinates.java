package org.example;

public class PointCoordinates {


    public double a;
    public double b;

    @Override
    public String toString() {
        return "PointCoordinates{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    private  PointCoordinates(double a, double b){
        this.a = a;
        this.b = b;

    }


    public static class Factory{

       public static PointCoordinates  usePolarCoordinates(double a,double b){
           return new PointCoordinates(a,b);
       }
        public static PointCoordinates  useCortasianCoordinates(double a,double b){
            return new PointCoordinates(a*Math.cos(b),a* Math.sin(b));
        }

    }


}
