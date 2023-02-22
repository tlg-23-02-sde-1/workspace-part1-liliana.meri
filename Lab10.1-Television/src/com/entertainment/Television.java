package com.entertainment;

import java.util.Arrays;

public class Television {
    // Class "static" variables - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"}; //lab 6 - Better brand Validation

    private static int instanceCount = 0;

    public static int getInstanceCount() { // no setter required
        return instanceCount;
    }

    //----------------------OBJECTS----------------------------
    //attributes or properties, called "FIELDS" or instance variables
    private String brand = "Toshiba";
    private int volume = 1;
    private DisplayType display = DisplayType.LED; // null if we don't provide a default

    private boolean isMuted;
    private int oldVolume; // not exposed via get/set methods - internal use only


    //---------------------CONSTRUCTORS--------------------------
    public Television() {
        // no-op
        instanceCount++; // instanceCount = instanceCount + 1;
    }

    public Television(String brand) throws InvalidBrandException {
        this();
        setBrand(brand); // delegate
    }

    public Television(String brand, int volume) throws IllegalArgumentException, InvalidBrandException {
        this(brand); // delegate to ctor above me for brand
        setVolume(volume); // handle volume myself
    }

    public Television(String brand, int volume, DisplayType display)
            throws IllegalArgumentException, InvalidBrandException {
        this(brand, volume);
        setDisplay(display);

    }


    //---------FUNCTIONS or OPERATIONS, called "methods" in Java----------------
    public void turnOn() {
        //call private method
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning ON your " + brand + " television to volume " + volume);
    }

    public void turnOff() {
        System.out.println("Turning OFF your " + brand + " television to volume " + volume);
    }

    ;

    public void mute() {
        if (!isMuted()) { // not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        } else {         // are currently muted
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    // access methods - provide "controlled access" to the objects internal (private) data
    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {

        return brand;
    }

    // data constraint : must be "Samsung", "LG, "Sony", Toshiba"
    // posssible throw a checked exception (InvalidBrandException
    public void setBrand(String brand) throws InvalidBrandException {
        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else { // invalid
            throw new InvalidBrandException(String.format("Invalid brand: " + brand +
                    ", valid brands are " + Arrays.toString(VALID_BRANDS)));
        }
    }
        /*
        switch(brand){
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                    System.out.println("Invalid brand" + brand);
        }
        */

    private boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equalsIgnoreCase(brand)) { // if this is "Sony"
                this.brand = brand; // assign the brand coming in to "brand"
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    //data constraint: must be [0-100] use your class constants (MIN/MAX)
    //NOTE: possible UNCHECKED exception (IllegalArgumentException)
    // 'throws' note needed, but will be provided just in case
    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else { // invalid
            throw new IllegalArgumentException(String.format("Invalid volume: %s, valid range is %s-%s\n",
                    volume, MIN_VOLUME, MAX_VOLUME));
        }
    }

    private boolean verifyInternetConnection() {
        return true; //fake implementation of private
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    // ACCESSOR METHODS
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s",
                getBrand(), volumeString, getDisplay());

        // return "Television: brand=" + getBrand() + ", volume=" + volumeString + ", display=" + getDisplay();
    }
}
