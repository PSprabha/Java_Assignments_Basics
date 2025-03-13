package constructor;
import class_and_objects.MovieDto;
import java.util.*;

public class MovieController 
{

	static ArrayList<MovieDto> moviesList = new ArrayList<>();
	
	static void displayMovies()
	{
		for(MovieDto movies : moviesList)
				System.out.println(movies.getTitle());
	}
	
	public static void main(String[] args) 
	{
		moviesList.add(new MovieDto(123, "Vedhalam", "Atlee", "03-11-2002", "Fight", 2, 5.0, "Avoid Fights", "Tamil"));
		moviesList.add(new MovieDto(123, "Vidamuyarchi", "Atlee", "03-11-2002", "Fight", 2, 5.0, "Avoid Fights", "Tamil"));
		moviesList.add(new MovieDto(123, "Vaali", "Atlee", "03-11-2002", "Fight", 2, 5.0, "Avoid Fights", "Tamil"));
		moviesList.add(new MovieDto(123, "Veeram", "Atlee", "03-11-2002", "Fight", 2, 5.0, "Avoid Fights", "Tamil"));
		moviesList.add(new MovieDto(123, "Viswasam", "Atlee", "03-11-2002", "Fight", 2, 5.0, "Avoid Fights", "Tamil"));
		
		displayMovies();
	}

}
