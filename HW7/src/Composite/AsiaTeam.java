package Composite;

public class AsiaTeam implements OlympicsTeams {
	OlympicsTeams team;
	String name;
	int athletes;
	int medals;
	
	AsiaTeam() {
		this.team = team;
		System.out.println(team);
	}

	@Override
	public void printTeam() {
		team.printTeam();
		
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