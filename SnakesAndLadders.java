public class SnakesAndLadders {
   
        System.out.println("WELCOME TO SNAKES AND LADDERS");
        System.out.println("===================================================================================");
        int player1Index = 0;
        int turn1 = 1;
        while (player1Index != 100) {
            int dThrow = (int)Math.floor((Math.random()*6)+1);
            System.out.println("The number on the die is " + dThrow);
          
            if ((player1Index + dThrow) < 0) {
                System.out.println("\nnow you strt again on postion 0" );
            } else {
                player1Index += dThrow;
                System.out.println(" your new position is "+player1Index+".");
                  switch (player1Index) {
                    case 4:
                        System.out.println("Awright! You got the ladder on square 4! Your new position is 14. Your nearest ladder is at 16,");
                        player1Index = 14;
                        break;
                    case 16:
                        System.out.println("Awright! You got the ladder on square 16! Your new position is 82. That's a big jump!");
                        player1Index = 82;
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