
package com.fete.exercise;



public class Main {

    public static void main(String[] args) {
        double area = calculateCircleArea(-1);
        System.out.println(area);
    }

    private static double calculateCircleArea(double v) {
        if(v < 0){
            return v;
        }
        else{
            return ((v*v)*Math.PI);
        }

    }


}
