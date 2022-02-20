import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
    public static void main (String[] args) {
        String playerPlay;
        String botPlay = null;
        int randomInt;

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        System.out.println("Lets start!");

        randomInt = rm.nextInt(3);
        if (randomInt==0)
            botPlay="r";
        else if (randomInt==1)
            botPlay="s";
        else if (randomInt==2)
            botPlay="p";

        System.out.println("Choose: Rock, paper or scissors? \n (to select use letters r, p, s)");
        playerPlay = sc.nextLine();
        playerPlay = playerPlay.toLowerCase();
        System.out.println("Ai choose "+ botPlay);

        if (playerPlay.equals("r") & botPlay.equals("s"))
            System.out.println("Rock beats scissors. You win!");

        if (playerPlay.equals("s") & botPlay.equals("p"))
            System.out.println("Scissors cut paper. You win!");

        if (playerPlay.equals("p") & botPlay.equals("s"))
            System.out.println("Scissors cut paper. You lose.");    
            
        if (playerPlay.equals("p") & botPlay.equals("r"))
            System.out.println("Paper defeats rock. You win!");
            
        if (playerPlay.equals("r") & botPlay.equals("p"))
            System.out.println("Paper defeats rock. You lose.");

        if (playerPlay.equals("s") & botPlay.equals("r"))
            System.out.println("Rock beats scissors. You lose.");

        else if (botPlay.equals(playerPlay))
        System.out.println("It`s a tie!");
    }
}