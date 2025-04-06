package abstract_classes;

import java.time.LocalDate;
import java.util.List;

abstract class Movie 
{
    protected String title;
    protected String director;
    protected LocalDate releaseDate;
    protected double rating;
    protected int duration;
    protected List<String> cast;

    public Movie(String title, String director, LocalDate releaseDate, double rating, int duration, List<String> cast) 
    {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.duration = duration;
        this.cast = cast;
    }

    public abstract String getGenre();
    public abstract String getMovieType();

    public void displayDetails() 
    {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Cast: " + String.join(", ", cast));
        System.out.println("Genre: " + getGenre());
        System.out.println("Type: " + getMovieType());
        System.out.println("-----------------------------");
    }
}

class RomComMovie extends Movie 
{
    public RomComMovie(String title, String director, LocalDate releaseDate, double rating, int duration, List<String> cast) 
    {
        super(title, director, releaseDate, rating, duration, cast);
    }

    @Override
    public String getGenre() 
    {
        return "Romantic Comedy";
    }

    @Override
    public String getMovieType() 
    {
        return "Feel-Good & Funny";
    }
}

class ThrillerMovie extends Movie 
{
    public ThrillerMovie(String title, String director, LocalDate releaseDate, double rating, int duration, List<String> cast) 
    {
        super(title, director, releaseDate, rating, duration, cast);
    }

    @Override
    public String getGenre() 
    {
        return "Thriller";
    }

    @Override
    public String getMovieType()
    {
        return "Suspense & Mystery";
    }
}

class HorrorMovie extends Movie
{
    public HorrorMovie(String title, String director, LocalDate releaseDate, double rating, int duration, List<String> cast) 
    {
        super(title, director, releaseDate, rating, duration, cast);
    }

    @Override
    public String getGenre() 
    {
        return "Horror";
    }

    @Override
    public String getMovieType() 
    {
        return "Scary & Intense";
    }
}

public class MovieMain 
{
    public static void main(String[] args)
    {
        Movie movie1 = new RomComMovie("10 Things I Hate About You", "Gil Junger", LocalDate.of(1999, 3, 31), 7.3, 97, List.of("Heath Ledger", "Julia Stiles"));
        Movie movie2 = new ThrillerMovie("Prisoners", "Denis Villeneuve", LocalDate.of(2013, 9, 20), 8.1, 153, List.of("Hugh Jackman", "Jake Gyllenhaal"));
        Movie movie3 = new HorrorMovie("A Quiet Place", "John Krasinski", LocalDate.of(2018, 4, 6), 7.5, 90, List.of("Emily Blunt", "John Krasinski"));

        movie1.displayDetails();
        movie2.displayDetails();
        movie3.displayDetails();
    }
}

