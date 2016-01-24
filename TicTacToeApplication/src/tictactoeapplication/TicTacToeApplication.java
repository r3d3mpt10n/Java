/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeapplication;

import java.util.Scanner;

/**
 *
 * @author shep
 */
public class TicTacToeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Getting input
        Scanner sc = new Scanner(System.in);
        // Allows for cont. games
        boolean doYouWantToPlay = true;
        
        while (doYouWantToPlay) {
            System.out.println("Welcome to tic tac toe\n Pick which character you will be");
            System.out.println();
            System.out.println("Enter a Character to represent you");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a charater to represent me\n");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();
            
            // Set up the game
            System.out.println();
            System.out.println("Now we can start the game. Enter a number to place your token\nNumbers from 1-9, left to right");
            TicTacToe.printIndexBoard();
            System.out.println();
            
            //Let's play
            
            while (game.gameOver().equals("notOver")) {
                if (game.currentMarker == game.userMarker) {
                    // User turn
                    System.out.println("It's your turn!");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again " + spot + " is invalid. Spot already taken");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " +spot + "!");
                } else {
                    // AI TURN
                    System.out.println("It's my turn!");
                    //Pick spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + " !");
                }
                
                //Reprint board
                System.out.println();
                game.printBoard();
                
            }
            System.out.println(game.gameOver());
            System.out.println();
            
            //New game
            
            System.out.println("Want to play again? Enter Y or N");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
                    
                         
                    }
                }
                    
            }
               
  
        // TODO code application logic here
    
    

