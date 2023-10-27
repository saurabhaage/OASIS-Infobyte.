import java.util.Scanner; 

class Main 
{
     
        public static void main(String args[]) 
       {
           System.out.println("Let's play a game.You have to pick a number between");
           System.out.println("1 too 100, and try to guess the actual value.");
           Scanner sc1 = new Scanner(System.in); 
           boolean playAgain;
           do {
              playGame();
              System.out.println("Do u want to play again?[Y/N]");
              playAgain = sc1.nextBoolean();  
              } while (playAgain);
          System.out.println("Thanks for playing.");
        }         
        
        static void playGame() 
        {
            int computersNumber; 
            int usersGuess;      
            int guessCount;      
            computersNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println("Enter your 1'st guess and start the game!");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               usersGuess = sc.nextInt();  
               guessCount++;
               if (usersGuess == computersNumber) {
                  System.out.println("You guess it correct " + guessCount
                          + " guesses! Actual number was " + computersNumber);
                  break;  
               }
               if (guessCount == 6) {
                  System.out.println("You didn't get the number in 6 guesses.");
                  System.out.println("You lose. Actual number was " + computersNumber);
                  break;  
               }
               if (usersGuess < computersNumber)
                  System.out.println("Your guess is lower than the actual value.Let's try again");
               else if (usersGuess > computersNumber)
                  System.out.println("Your guess is higher than the actual value.Let's try agin");
            }
            System.out.println();
        } 
                    
     }