package mainPackage;

public class Main
{
	public static void main(String[] args)
	{
		new GUI().displayGUI();
		
		/*
		 * four pillars:
		 * 		abstraction
		 * 			as of writing this, I don't have anything abstracted out
		 * 			maybe abstract out the re-writing of the table once data is coming from player classes instead of hard coding?
		 * 		encapsulation
		 * 			everything is private unless necessary to be public
		 * 		inheritance
		 * 			position-specific classes inherit from Player class
		 * 		polymorphism
		 * 			not sure where to use this yet. maybe add stats to the Player class that the position classes can override?
		 * */
	}
}