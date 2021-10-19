package com.deckofcards;

import java.util.Random;

public class DeckOfCards {
	static String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	static String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
	static String[][] deck = new String[SUITS.length][RANKS.length];
	public static void main(String[] args) {

		cardsCreation();  // calling cardsCreation method to Create 52 deck of cards
		shuffle();        // calling shuffle method to shuffle the cards 
		distribute();     // calling distribute method to distribute 9 cards to 4 persons
	}
	public static void cardsCreation() {               //creating 52 deck of cards using suits and  ranks
		for(int i = 0; i< SUITS.length ; i++) {

			for(int j = 0; j< RANKS.length ; j++) {
				deck[i][j] = SUITS[i] + RANKS[j];
			}		
		}
	}
	public static void shuffle() {                  // shuffling the cards
		Random random = new Random();
		for(int i = 0; i< SUITS.length ; i++) {

			for(int j = 0; j< RANKS.length ; j++) {
				int m = random.nextInt(i + 1);
				int n = random.nextInt(j + 1);
				String temp = deck[i][j];
				deck[i][j] = deck[m][n];
				deck[m][n] = temp;
			}		
		}
	}
	public static void distribute() {               // distributing the cards to peoples

		for(int i = 0; i< SUITS.length ; i++) {
			System.out.println("");
			System.out.println("Cards recieved by player "+(i+1)+" are");
			for(int j = 0; j< 9 ; j++) {
				System.out.println("  "+deck[i][j]) ;
			}		
		}
	}
}
