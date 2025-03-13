package class_and_objects;

public class MovieDto
{
    private int id;
    private String title;
    private String director;
    private String releaseDate;
    private String category;
    private int duration;
    private double rating;
    private String description;
    private String language;

    public MovieDto() 
    {
    	
    }

    public MovieDto(int id, String title, String director, String releaseDate, 
                    String category, int duration, double rating, String description, 
                    String language) 
    {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.category = category;
        this.duration = duration;
        this.rating = rating;
        this.description = description;
        this.language = language;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getDirector() 
    {
        return director;
    }

    public void setDirector(String director) 
    {
        this.director = director;
    }

    public String getReleaseDate() 
    {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public int getDuration() 
    {
        return duration;
    }

    public void setDuration(int duration) 
    {
        this.duration = duration;
    }

    public double getRating()
    {
        return rating;
    }

    public void setRating(double rating) 
    {
        this.rating = rating;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getLanguage() 
    {
        return language;
    }

    public void setLanguage(String language) 
    {
        this.language = language;
    }
}

