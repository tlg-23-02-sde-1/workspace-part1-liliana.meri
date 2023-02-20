package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {

    public static void main(String[] args){
        Movie movie1 = new Movie("Shrek"); // MUST provide atleast a title
        movie1.setGenre(Genre.COMEDY);
        movie1.setReleaseYear(2005);
        movie1.setRevenue(491_800_000.03);
        movie1.setRating(Rating.PG);

        System.out.println(movie1); // toString() automatically called

        Movie movie2 = new Movie("The Labyrinth", Genre.SCI_FI, 1986, 20.0, Rating.PG);
        System.out.println(movie2);

        Movie movie3 = new Movie("Vacation in Java", Genre.HORROR);
        System.out.println(movie3);

    }

}