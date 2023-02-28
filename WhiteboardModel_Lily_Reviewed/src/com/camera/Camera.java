package com.camera;

/**
 * JR: Demonstrates basic understanding of program concepts.
 * Modeled very closely to the Television labs, and flawed in several areas.
 * Validation testing is incomplete, ClientArgs works as intended, but improvements needed.
 * Better error messages needed in validating setter methods.
 *
 * Make better use of your accessor (get/set) methods from the other methods.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted, with minor improvements needed.
 *  Remove extraneous blank lines inside methods (down near the closing brace).
 *
 * Class participation is adequate, and has improved recently, keep it up.
 *
 * Class names, package names, and overall structure are correct.
 */
public class Camera {
    //static variables
    public static final int MIN_ISO = 100;
    public static final int MAX_ISO = 3200;

    // JR: use enum here, e.g., Brand
    public static final String[] VALID_BRANDS = {"Canon", "Fujifilm", "Nikon", "Sony", "Panasonic", "Olympus", "Minolta", "Pentax", "Instax" };


    //properties/fields
    private String brand;
    private CameraType type;
    private int iso;

    // JR: better to provide a default value, or use Integer (otherwise it's 0, biblical times).
    private int modelYear;
    private int shutterSpeed = 500;  // JR: another good candidate for data validation


    //constructors
    public Camera(){
        //no-op
    }

    public Camera(String brand, CameraType type, int iso){ // 3-arg ctor
        setBrand(brand);
        setType(type);
        setIso(iso);
    }

    // JR: bug - nothing is done with the 'iso' value coming in from the client call
    // This ctor is incorrectly passing the incoming modelYear to the 3-arg ctor, for its iso
    public Camera(String brand, CameraType type, int iso, int modelYear, int shutterSpeed) { // all args
        this(brand, type, modelYear);

        setShutterSpeed(shutterSpeed);
    }

    /*
     * JR: generally better to call your own get/set methods instead of direct field access.
     */

    //methods/functions
    public void turnOn(){
        System.out.println("Turning your " + modelYear + " " + brand + " Camera ON.");

    }

    public void turnOff() {
        System.out.println("Turning your " + brand + " Camera OFF.");
    }

    public void takePicture() {
        System.out.println(brand + ": Taking a picture at iso: " + iso + ", shutter speed: " + shutterSpeed);
    }

    public void startVideo() {
        System.out.println("Video recording STARTED on your " + type + " " + brand);

    }

    public void stopVideo() {
        System.out.println("Video recording STOPPED on your " + type + " " + brand);
    }

    //getters/setters
    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    // JR: better error message needed
    public void setBrand(String brand) {

        if(isValidBrand(brand)){
            this.brand = brand;
        }
        else {
            System.out.println("Invalid or Unknown Brand");
        }
    }

    // JR: unnecessary if enum were used for brand
    private boolean isValidBrand(String brand){
        boolean valid = false;

        for (String validBrand : VALID_BRANDS) {
            if(validBrand.equalsIgnoreCase(brand)){
                this.brand = brand;
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getIso() {
        return iso;
    }

    // JR: better error message needed
    public void setIso(int iso) {
        if(iso >= MIN_ISO && iso <= MAX_ISO) {
            this.iso = iso;
        }
        else {
            System.out.println("Invalid: iso out of range");
        }

    }

    public int getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(int shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public void setType(CameraType type) {
        this.type = type;
    }

    public CameraType getType() {
        return type;
    }

    public String toString() {
        return "Camera: brand=" + getBrand() +
                ", iso=" + getIso() +
                ", type=" + getType() +
                ", modelYear=" + getModelYear() +
                ", shutterSpeed=" + getShutterSpeed();
    }

}
