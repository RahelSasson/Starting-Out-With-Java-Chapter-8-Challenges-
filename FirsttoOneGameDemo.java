//BS'D
/*
This game is meant for two or more players. In the game, each player starts out with 50
points, as each player takes a turn rolling the dice; the amount generated by the dice is
subtracted from the player’s points. The first player with exactly one point remaining wins.
If a player’s remaining points minus the amount generated by the dice results in a value less
than one, then the amount should be added to the player’s points. (As an alternative, the
game can be played with a set number turns. In this case, the player with the amount of
points closest to one, when all rounds have been played, wins.)
Write a program that simulates the game being played by two players. Use the Die class that
was presented in Chapter 6 to simulate the dice. Write a Player class to simulate the players.
 */

public class FirsttoOneGameDemo {
    public static void main(String[] args) {
        Player player1 = new Player("Goku");
        Player player2 = new Player("Saitama");

        boolean winner = false;
        do {
            System.out.println(player1.getPlayerName() + " " + player1.getPoints() + " " + player2.getPlayerName() + " " + player2.getPoints());
            player1.roll();
            player2.roll();

            if(player1.getPoints() == 1) {
                System.out.println(player1.getPlayerName() + " " + player1.getPoints() + " " + player2.getPlayerName() + " " + player2.getPoints());
                System.out.println("Goku beats Saitama!");
                winner = true;
            }
            if(player2.getPoints() == 1) {
                System.out.println(player1.getPlayerName() + " " + player1.getPoints() + " " + player2.getPlayerName() + " " + player2.getPoints());
                System.out.println("Saitama beats Goku");
                winner = true;
            }
        }while(!winner);


    }
}
