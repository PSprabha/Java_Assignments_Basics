package methodOverRidding;

import java.time.LocalDate;
import java.util.List;


class Movie 
{
    protected String title;
    protected String genre;
    protected String director;
    protected LocalDate releaseDate;
    protected double rating;
    protected int durationMinutes;
    protected List<String> actors;

    public Movie(String title, String genre, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors)
    {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
        this.actors = actors;
    }

    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Actors: " + actors);
    }
}

class RomComMovie extends Movie 
{
    public RomComMovie(String title, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors)
    {
        super(title, "Romantic Comedy", director, releaseDate, rating, durationMinutes, actors);
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Special Feature: Light-hearted romantic moments with humor.");
    }
}



class ThrillerMovie extends Movie 
{
    public ThrillerMovie(String title, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) 
    {
        super(title, "Thriller", director, releaseDate, rating, durationMinutes, actors);
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Special Feature: Intense suspense and unexpected twists.");
    }
}



class HorrorMovie extends Movie 
{
    public HorrorMovie(String title, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) 
    {
        super(title, "Horror", director, releaseDate, rating, durationMinutes, actors);
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Special Feature: Scary scenes and eerie atmosphere.");
    }
}



public class MovieMain
{
    public static void main(String[] args) 
    {
    	Movie movie1 = new RomComMovie("10 Things I Hate About You", "Gil Junger", LocalDate.of(1999, 3, 31), 7.3, 97, List.of("Heath Ledger", "Julia Stiles"));
    	Movie movie2 = new ThrillerMovie("Prisoners", "Denis Villeneuve", LocalDate.of(2013, 9, 20), 8.1, 153, List.of("Hugh Jackman", "Jake Gyllenhaal"));
    	Movie movie3 = new HorrorMovie("A Quiet Place", "John Krasinski", LocalDate.of(2018, 4, 6), 7.5, 90, List.of("Emily Blunt", "John Krasinski"));

    	
    	Movie[] movies = {movie1, movie2, movie3};
    	
        for (Movie movie : movies) 
        {
            movie.displayDetails();
            System.out.println("----------------------");
        }
    }
}
