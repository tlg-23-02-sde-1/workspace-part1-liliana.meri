package com.camera.client;/*

 */


import com.camera.Camera;
import com.camera.CameraType;

/*
 * JR: adequate, but more careful inspection of the output would have revealed
 * the bug in Camera's 5-arg ctor.  See comments below.
 */
class CameraClient {

    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setBrand("Fujifilm");
        cam1.setType(CameraType.MIRRORLESS);
        cam1.setModelYear(2020);
        cam1.setIso(250);
        cam1.setShutterSpeed(600);

        Camera cam2 = new Camera();
        cam2.setBrand("Canon");
        cam2.setType(CameraType.DSLR);
        cam2.setModelYear(2019);
        cam2.setIso(Camera.MAX_ISO);
        cam2.setShutterSpeed(300);

        /*
         * JR: the bug in the 5-arg ctor is on display here, but not detected.
         * More careful examination of the output would have revealed this.
         * An iso of 100 was specified, with a modelYear of 2023.
         * In the print statements at the bottom of main(), and in the turnOn() calls,
         * you can see that this Camera actually has an iso of 2023 and a modelYear of 0.
         */
        Camera cam3 = new Camera("Sony", CameraType.DSLR, Camera.MIN_ISO, 2023,  800); // 5-arg ctor

        Camera cam4 = new Camera("Instax", CameraType.INSTANT, 200); // 3-arg ctor

        cam1.turnOn();
        cam2.turnOn();
        cam3.turnOn();
        cam4.turnOn();
        System.out.println(); // blank line

        cam1.takePicture(); // picture
        cam2.takePicture();
        cam3.takePicture();
        cam4.takePicture();
        System.out.println(); // blank line

        cam1.turnOff();
        cam2.turnOff();
        cam3.turnOff();
        cam4.turnOff();
        System.out.println(); // blank line

        cam3.startVideo(); // video
        cam3.stopVideo();
        System.out.println(); // blank line

        System.out.println(cam1);
        System.out.println(cam2);
        System.out.println(cam3);
        System.out.println(cam4);
    }
}
