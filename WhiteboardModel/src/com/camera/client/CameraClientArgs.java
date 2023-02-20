package com.camera.client;

/*
*
*  java CameraClientArgs <brand> <type> <iso>
 */

import com.camera.Camera;
import com.camera.CameraType;

import java.util.Arrays;

class CameraClientArgs {

    public static void main(String[] args) {
        // 1. Supported brands are Canon, Sony,....
        // 2. Supported types FILM, DSLR
        // 3. ISO must be between 100 and 3200
        if (args.length < 3) {
            String usage = "Usage: java CameraClientArgs <brand> <iso> <type>";
            String example = "Example: java CameraClientArgs Canon DSLR 125";

            String note1 = "Supported brands are: " + Arrays.toString(Camera.VALID_BRANDS);
            String note2 = "Supported types are: " + Arrays.toString(CameraType.values());
            String note3 = String.format("ISO must be between " + Camera.MIN_ISO + " and " + Camera.MAX_ISO);


            System.out.println(usage + "\n" + example + "\n" + note1 + "\n" + note2 + "\n" + note3);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;
        }

        //show args
        System.out.println("You provided " + args.length + " arguments");

        //convert strings to proper types
        String brand = args[0];
        CameraType type = CameraType.valueOf(args[1]);
        int iso = Integer.parseInt(args[2]);


        // camera instantiation
        Camera cam = new Camera(brand, type, iso);

        System.out.println("You created a Camera!");
        System.out.println(cam);



    }


}