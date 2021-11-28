package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements OlympicsTeams {
	private String name;
	private int athletes;
	private int medals;
	
	List<OlympicsTeams> teams;
	
	Composite(String name, int athletes, int medals) {
		this.name = name;
		this.athletes=athletes;
		this.medals = medals;
		teams= new ArrayList<>();
		
	}
	

	
	public void add(OlympicsTeams team) {
		teams.forEach(team::printTeam);
	}

	@Override
	public void printTeam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printAthletes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printMedals() {
		// TODO Auto-generated method stub
		
	}

   

}