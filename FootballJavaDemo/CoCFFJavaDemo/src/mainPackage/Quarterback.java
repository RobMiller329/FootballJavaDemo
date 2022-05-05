package mainPackage;

public class Quarterback extends Player
{
	int passingYards, passingTDs, interceptions;
	int rushingYards, rushingTDs, fumbles;

	Quarterback(String firstName, String lastName, String position, int passingYards, int passingTDs, int rushingYards, int rushingTDs, int interceptions, int fumbles)
	{
		super(firstName, lastName, position);
		
		this.passingYards = passingYards;
		this.passingTDs = passingTDs;
		this.interceptions = interceptions;
		this.rushingYards = rushingYards;
		this.rushingTDs = rushingTDs;
		this.fumbles = fumbles;
	}
}