public class SnakesAndLadders
{
    void snakeGame() 
    {
       
        System.out.println("WELCOME TO SNAKES AND LADDERS");
        System.out.println("===================================================================================");
        System.out.println("Press an key to start the game...");
        int player1Index=0;
        System.out.println("your current position is "+player1Index+".");
        
	int dThrow = (int)Math.floor((Math.random()*6)+1);
        System.out.println("The number on the die is "+dThrow);

     }
public static void main(String[]args) 
    {
        SnakesAndLadders s=new SnakesAndLadders();
        s.snakeGame();
    }
}





