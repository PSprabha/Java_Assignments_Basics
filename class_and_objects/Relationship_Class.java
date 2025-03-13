package class_and_objects;

import java.util.*;

public class Relationship_Class 
{
	public static void main(String[] args) 
	{
		Team team = new Team("MFC", "Muppuliiyoor", "A", "Kabaddi", "Selflearn");
		Team mfc = new Team();
		
		mfc.setPlayersList(new Player("Prabha", "Defender", 33, "Kabaddi"));
		mfc.setPlayersList(new Player("kumaran", "Defender", 512, "Kabaddi"));
		mfc.setPlayersList(new Player("kaski", "Defender", 22, "Kabaddi"));
		mfc.setPlayersList(new Player("sanjay", "Defender", 96, "Kabaddi"));
		mfc.setPlayersList(new Player("naveen", "Raider", 9, "Kabaddi"));
		
		for(Player p : mfc.getPlayersList())
				System.out.println(p.getName());
	}
}

class Team
{
	private String name;
	private String city;
	private String division;
	private String playGame;
	private String coach;
	private List<Player> playersList;
	
	Team(String name, String city, String division, String playGame, String coach)
	{
		this.name = name;
		this.city = city;
		this.division = division;
		this.playGame = playGame;
		this.coach = coach;
	}
	
	public Team() 
	{
		playersList = new ArrayList<Player>();		
	}

	public String getName()
	{
		return name;
	}

	public String getCity()
	{
		return city;
	}

	public String getDivision() 
	{
		return division;
	}

	public String playGame()
	{
		return this.playGame;
	}

	public String getCoach() 
	{
		return coach;
	}

	public List<Player> getPlayersList() 
	{
		return playersList;
	}

	public void setPlayersList(Player player) 
	{
		this.playersList.add(player);
	}
}

class Player
{
	private String name;
	private String position;
	private int jersyNumber;
	private String playGame;
	
	Player(String name, String position, int jersyNumber, String playGame)
	{
		this.name = name;
		this.position = position;
		this.jersyNumber = jersyNumber;
		this.playGame = playGame;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position) 
	{
		this.position = position;
	}
	public int getJersyNumber() 
	{
		return jersyNumber;
	}
	public void setJersyNumber(int jersyNumber) 
	{
		this.jersyNumber = jersyNumber;
	}
	public String getPlayGame()
	{
		return playGame;
	}
	public void setPlayGame(String playGame)
	{
		this.playGame = playGame;
	}
}