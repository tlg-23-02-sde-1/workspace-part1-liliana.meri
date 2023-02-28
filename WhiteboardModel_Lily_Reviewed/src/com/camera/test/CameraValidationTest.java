package com.camera.test;

import com.camera.Camera;

/*
 * JR: not thorough enough.
 *
 * For proper BVT (Boundary Value Testing) of 'iso', you need to check
 *  99, 100  and  3200, 3201
 *
 * For brand (which should have been an enum), you need to check every valid + one invalid.
 *  "Canon", "Fujifilm", "Nikon", "Sony", "Panasonic", "Olympus", "Minolta", "Pentax", "Instax"
 *  "INVALID"
 */
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