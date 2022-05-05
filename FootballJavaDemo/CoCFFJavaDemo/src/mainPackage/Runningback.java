package mainPackage;

public class Runningback extends Player
{
	int rushingYards, rushingTDs, fumbles;
	int receivingYards, receivingTDs;

	Runningback(String firstName, String lastName, String position, int rushingYards, int rushingTDs, int receivingYards, int receivingTDs, int fumbles)
	{
		super(firstName, lastName, position);
		
		this.rushingYards = rushingYards;
		this.rushingTDs = rushingTDs;
		this.receivingYards = receivingYards;
		this.receivingTDs = receivingTDs;
		this.fumbles = fumbles;
	}
}