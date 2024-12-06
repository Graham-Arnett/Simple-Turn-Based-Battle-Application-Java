package fight;
import java.util.Scanner;
import java.util.Random;

public class Turnbased {

	public static void main(String[] args) {
		System.out.println("Hello and welcome to my simple turnbased battle application"
				+ "\nYou are a young adventurer investigating a local mine when an undead sorcerer accosts you. Steel yourself for battle!\n\n");
		
		Scanner scanner = new Scanner(System.in);
		String choice;
		Random random = new Random();
		
		do {
			int playerHealth = 100; //initialize at 100
			int enemyHealth = 100;
			int enemyChoice = random.nextInt(1,3);
			int heal;
			int damage;
			while(playerHealth > 0 && enemyHealth > 0) 
			{
				System.out.print("It is your turn. Will you slash or heal? ");
				String action = scanner.next();
				switch(action) 
				{
				case "slash":
					damage = 30;
					enemyHealth -= damage;
					System.out.println("You put your weight behind a vicious slash against your foe."
							+ "\nYour enemy takes " + damage + " points of damage, they have " + enemyHealth + " hitpoints remaining.");
					break;
				case "heal":
					heal = 25;
					playerHealth += heal;
					System.out.println("A golden glow emanates from your hands, you heal for " + heal + "hitpoints and now have " + playerHealth + " hitpoints.");
					break;
			}
				System.out.println("It is the enemy's turn.");
				switch(enemyChoice) 
				{
				case 1:
					damage = 35;
					playerHealth -= damage;
					System.out.println("The sorcerer shoots you with a ball of lightning."
							+ "\nYou take " + damage + "and have " + playerHealth + " hitpoints remaining.");
					break;
				case 2:
					heal = 20;
					enemyHealth += heal;
					System.out.println("A foul necrotic odor flows around the sorcerer. They regain " + heal + " hitpoints.");
					break;
				}
			}
			if(enemyHealth == 0) 
			{
				System.out.print("You win! You vanquished the evil sorcerer and are free to keep exploring deeper into the mines.");
			}
			else 
			{
				System.out.print("Your vision fades as you fall to the ground. Your journey ends here.");
			}
			
			System.out.print("Would you like to play again? (y/n): ");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
		
	}

}
