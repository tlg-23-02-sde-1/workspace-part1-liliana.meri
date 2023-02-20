package net.flix;

public class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating; // a "type" of thing "enum"
    private Genre genre;

    // constructors
    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);
        setGenre(genre);

    }

    public Movie(String title, Genre genre, Integer releaseYear, Double revenue, Rating rating) {
        this(title, genre); // delegate to ctor above
        setReleaseYear(releaseYear); // set here
        setRevenue(revenue); // set here
        setRating(rating); // set here
    }

    // business-oriented Methods/Functions-----------------------------------
    // play(), pause(), stop(), rewind(), fastForward()

    // accessor methods (get/set methods) -----------------------------------
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // ----------------- tell me about the movie --------------------------------
    public String toString() {

        return String.format("Movie: title=%s, releaseYear=%s, revenue=%,.2f, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

//        return "Movie: title=" + getTitle()
//                + ", releaseYear=" + getReleaseYear()
//                + ", revenue=" + getRevenue()
//                + ", rating=" + getRating()
//                + ", genre=" + getGenre().getDisplay();
    }

}