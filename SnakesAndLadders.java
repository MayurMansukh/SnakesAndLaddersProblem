public class SnakesAndLadders {
    public static void snakeGame()  {
        System.out.println("===================================================================================");
        int player1Index = 0, player2Index = 0;
        int turn1 = 1, turn2 = 1;
        while((player1Index!=100)||(player2Index!=100))
        {
            System.out.println();
            System.out.println("Player1 turn");
            int dThrow = (int)Math.floor((Math.random()*6)+1);
            System.out.println("The number on the die is " + dThrow);

            if((player1Index+dThrow)>100)
            {
                System.out.println("You will have to wait for the next turn, you have exceeded 100.");
            }
            else if((player1Index+dThrow)==100)
            {
                System.out.println("Congratulations player 1, you have won the game! Better luck next time, Player 2.");
                break;
            }
            else
            {
                player1Index+=dThrow;
                System.out.println("your new position is "+player1Index+".");
                switch (player1Index) {
                    case 4:
                        System.out.println("Awright! You got the ladder on square 4! you play again");
                        dThrow = (int)Math.floor((Math.random()*6)+1);
                        player1Index+=dThrow;
                        System.out.println(" number of dice is "+dThrow+" your new position is "+player1Index+".");
                        break;
                    case 16:
                        System.out.println("Awright! You got the ladder on square 16! you play again");
                        dThrow = (int)Math.floor((Math.random()*6)+1);
                        player1Index+=dThrow;
                        System.out.println(" number of dice is "+dThrow+" your new position is "+player1Index+".");
                        break;
                    case 17:
                        System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                        player1Index = 8;
                        break;
                    case 54:
                        System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                        player1Index = 28;
                        break;

                    default:
                        System.out.println("No snakes or ladders here.");
                }
                System.out.println();
                System.out.println("Player2 turn");
                turn1++;
                dThrow = (int)Math.floor((Math.random()*6)+1);
                System.out.println("The number on the die is " + dThrow);

                if((player2Index+dThrow)>100)
                {
                    System.out.println("You will have to wait for the next turn, you have exceeded 100.");
                }
                else if((player2Index+dThrow)==100)
                {
                    System.out.println("Congratulations player 2, you have won the game! Better luck next time, Player 1.");
                    break;
                }
                else
                {
                    player2Index+=dThrow;
                    System.out.println("your new position is "+player1Index+".");
                    switch (player2Index) {
                        case 4:
                            System.out.println("Awright! You got the ladder on square 4! you play again");
                            dThrow = (int)Math.floor((Math.random()*6)+1);
                            player2Index+=dThrow;
                            System.out.println(" number of dice is "+dThrow+" your new position is "+player2Index+".");
                            break;
                        case 16:
                            System.out.println("Awright! You got the ladder on square 16! you play again");
                            dThrow = (int)Math.floor((Math.random()*6)+1);
                            player2Index+=dThrow;
                            System.out.println(" number of dice is "+dThrow+" your new position is "+player2Index+".");
                            break;
                        case 17:
                            System.out.println("Whoops! You were caught by the snake at square 17. You're now down to square 8. :(");
                            player1Index = 8;
                            break;
                        case 54:
                            System.out.println("Whoops! You were caught by the snake at square 54! You're now down to square 28. :(");
                            player1Index = 28;
                            break;

                        default:
                            System.out.println("No snakes or ladders here.");
                    }
                }

            }
            turn1++;
            turn2++;
        }

    }
    public static void main(String[]args)
    {
        SnakesAndLadders s=new SnakesAndLadders();
        s.snakeGame();
    }
}




