package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args){

        Television tv = new Television();
        //--------------Volume------------------
        System.out.println("TESTING VOLUME... ");
        tv.setVolume(0); // pass, log tv
        System.out.println("volume: " + tv.getVolume());

        tv.setVolume(100); // pass, log tv
        System.out.println("volume: " + tv.getVolume());


        tv.setVolume(-1); // error
        tv.setVolume(101); // error
        System.out.println("volume: " + tv.getVolume());

        //--------------Brand------------------
        System.out.println("TEST BRANDS..... ");
        tv.setBrand("Samsung"); // pass
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("LG"); // pass
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Toshiba"); // pass
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Toshiba"); // pass
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("INVALID"); // error
        System.out.println("volume: " + tv.getBrand());



    }
}