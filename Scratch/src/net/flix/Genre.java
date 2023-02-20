package net.flix;

// enum is a class
public enum Genre {
    //-------------Genre Objects------------------
    // each is calling the ctor below, passing a string
    COMEDY("Comedy"),
    WESTERN("Western"),
    MYSTERY("Mystery"),
    SCI_FI("Science Fiction"),
    ACTION("Action"),
    ROMANCE("Romance"),
    DRAMA("Drama"),
    HORROR("Horror");

    //--------------------------------------------
    // everything under this line is REGULAR class definition stuff
    // namely, fields, constructors, methods
    //----------------------------------------------

    private String display;

    // constructor - called only from inside (8 times, from those listed above)
    Genre(String display){
        this.display = display;
        System.out.println("Genre ctor called......for each genre");
    }

    public String getDisplay() { // often the "get" prefix is omitted when there is no setter
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}