package com.example.demo;

import org.junit.jupiter.api.Test;

public class ExerciseLuxsoft {

    public static void main(String[] args) {
        Car myCar = new Car();
        DaciaCar myDaciaCar = new DaciaCar();

        myCar.setColor("green");
        myDaciaCar.setColor("black");

        System.out.println(myCar.makeNoise());
        System.out.println(myCar.getColor());


        System.out.println(myDaciaCar.makeNoise());
        System.out.println(myDaciaCar.getColor());
    }

}
