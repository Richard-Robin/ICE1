/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 * Name: Richard Robins
 * Student No: 991722066
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        //Scanner sc = new Scanner(System.in);
        int cardVal,res=0;
        int suit;
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(12)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i]=c;
            System.out.println(c.getValue()+ c.getSuit());
        }
        // System.out.println("Enter the card Value 1-13");
        // cardVal = sc.nextInt();
        // System.out.println("Select a suit (0 for Hearts,1 for Diamonds, 2 for Spades, 3 for Clubs )");
        // suit = sc.nextInt();
        // for(int i = 0; i <magicHand.length;i++){
        //     if(cardVal==magicHand[i].getValue()&& getSuit(suit) == magicHand[i].getSuit()){
        //         res = 1;
        //         break;
        //     }
        // }

        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        for(int i = 0; i <magicHand.length; i++){
             if(luckyCard[i].getValue()==magicHand[i].getValue()&& luckyCard[i].getSuit()==magicHand[i].getSuit()){
                 res = 1;
                 break;
             }
            
        }
        
        if(res==1){
            System.out.println("The card you have selected is in the Magic Hand");
        }else{
            System.out.println("Better luck next time");
        }
         
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    
    }
    
    private static String getSuit(int suit){
            return Card.SUITS[suit];
        };
    
    
}
