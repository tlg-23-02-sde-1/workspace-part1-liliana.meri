package com.entertainment.client;/*
*
*
 */


import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

class TelevisionClient {
    //Starting point for any standalone Java application
    public static void main(String[] args)  {
        System.out.println(Television.getInstanceCount() + " instances");

        try {
            Television tv1 = new Television();
            tv1.setBrand("LG");
            tv1.setVolume(Television.MAX_VOLUME);
            tv1.setDisplay(DisplayType.OLED);

            // 3-arg constructor
            Television tv2 = new Television("Samsung", -1, DisplayType.CRT);

            //only brand, default values
            Television tv3 = new Television("LG");

            tv1.turnOn();
            tv2.turnOn();
            tv3.turnOn();
            System.out.println();

            tv1.turnOff();
            tv2.turnOff();
            tv3.turnOff();
            System.out.println();

            System.out.println(tv1);
            System.out.println(tv2);
            System.out.println(tv3);
        }
        catch (InvalidBrandException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Television.getInstanceCount() + " instances");
    }
}
