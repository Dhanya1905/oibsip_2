import java.util.Random;
import java.util.Scanner;

public class Guessnumber
{
  public static void main(String[] args)
  {
    boolean game=true;
    while(game==true)
    {
      Random Random_number= new Random();
      int computer_guess=Random_number.nextInt(100);
      int turns=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
      System.out.println("best of luck!");
      int user_guess;
      int count=0;
      boolean win=false;
      while(win==false) 
      {
        user_guess=sc.nextInt();
        turns++;
        if(user_guess==computer_guess) 
        {
          win=true;
          System.out.println("YOu win!");
          System.out.println("Then number was "+computer_guess);
        }
        else if(count>8)
        {
          System.out.println("You loose! the right answer was: "+computer_guess);
        }
        else if(user_guess<computer_guess)
        {
          count++;
          System.out.println("Yor Guess is lower than the right guess! Turns left: "+(10-count));  
        }
        else if(user_guess>computer_guess) 
        {
          count++;
          System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-count));
        }
      }
    
      System.out.println("You used "+turns+" turns to guess the right number");
      System.out.println("Your score is "+((11-turns)*10)+" out of 100");
      System.out.println("Do you want play another game true for yes false for no");
      game=sc.nextBoolean();
   }
  }
}