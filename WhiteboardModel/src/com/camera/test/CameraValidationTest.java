package com.camera.test;

import com.camera.Camera;

class CameraValidationTest {
    public static void main (String[] args){

        Camera cam = new Camera();

        //------------TEST ISO--------------
        System.out.println("TESTING ISO......");
        cam.setIso(40); // error, under min
        System.out.println("ISO: " + cam.getIso());

        cam.setIso(250); // pass
        System.out.println("ISO: " + cam.getIso());

        cam.setIso(3300); // error, over max
        System.out.println("ISO: " + cam.getIso());

        //-------------TEST BRAND------------------

        System.out.println("TESTING BRAND.....");
        cam.setBrand("Samsonite"); // error, invalid brand
        System.out.println("brand: " + cam.getBrand());

        cam.setBrand("Sony"); // pass
        System.out.println("brand: " + cam.getBrand());

        cam.setBrand("Canon"); // pass
        System.out.println("brand: " + cam.getBrand());

        cam.setBrand("Minolta"); // pass
        System.out.println("brand: " + cam.getBrand());

        cam.setBrand("Fujifilm"); // pass
        System.out.println("brand: " + cam.getBrand());



    }

}