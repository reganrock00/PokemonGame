import java.util.ArrayList;
import java.util.Scanner;

public class PlayPokemon
	{
	    {
	    	battlePokemon();
	    	
	    }
		public static void main(String[] args)
			{
			ArrayList<Moves> charizardmoves = new ArrayList<Moves>();
			   charizardmoves.add(new Moves ("fire fang", 65, .95));
			   charizardmoves.add(new Moves ("flamethrower", 90, 1.0));
			   charizardmoves.add(new Moves ("slash", 70, 1.0));
			ArrayList<Moves> blastoisemoves = new ArrayList<Moves>();
			   blastoisemoves.add(new Moves ("skull bash", 130, 1.0));
			   blastoisemoves.add(new Moves ("aqua tail", 90, .9));
			   blastoisemoves.add(new Moves ("hydro pump", 110, .8));
			ArrayList<Moves> venasaurmoves = new ArrayList<Moves>();
			   venasaurmoves.add(new Moves ("solar beam", 120, 1.0));
			   venasaurmoves.add(new Moves ("vine whip", 45, 1.0));
			   venasaurmoves.add(new Moves ("razor leaf", 55, .95));
			ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
			   pokedex.add(new Pokemon ("Charizard", "Fire", 78, charizardmoves.get(0), charizardmoves.get(1), charizardmoves.get(2), true));
			   pokedex.add(new Pokemon ("Venusaur", "Grass", 80, venasaurmoves.get(0), venasaurmoves.get(1), venasaurmoves.get(2), true));
			   pokedex.add(new Pokemon ("Blastoise", "Water", 79, blastoisemoves.get(0), blastoisemoves.get(1), blastoisemoves.get(2), true));
			for(Pokemon p : pokedex)
				{
					System.out.println(p.getName());
				}
			
			int randomNumber1 = (int)(Math.random()*3)-1;
			System.out.println("Prepare to battle! Who do you choose?");
			Scanner userInput =new Scanner (System.in);
			String choice = userInput.nextLine();
			System.out.println("You chose " + choice + "!");
			System.out.println("Your opponent chooses " + pokedex.get(randomNumber1).getName());
			String opponent = pokedex.get(randomNumber1).getName();
			}
		public static void battlePokemon()	
		     {
		    	 
		     }

	}
