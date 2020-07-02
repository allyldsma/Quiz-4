/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackquiz;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StackQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner s = new Scanner(System.in);
         Stack <String> S \= new Stack<>( );
          System.out.println("Input a Sentence: ");
          S.push(s.nextLine());
          System.out.println("Undo? (Y/N) \n");
          s.nextLine();
          System.out.println("New Sentence: " + S.pop());   
    }
    
}
