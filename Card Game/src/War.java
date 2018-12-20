import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class War
	{
		static ArrayList<Card> playerHand = new ArrayList<Card>();
		static ArrayList<Card> computerHand = new ArrayList<Card>();

		public static void main(String[] args)
			{
				Deck.fillDeck();
				Deck.shuffle();
				createHands();
				compare();
			}

		public static void listCards()
			{
				for (int i = 0; i < 52; i++)
					{
						System.out.println(Deck.deck.get(i).getRank() + " of " + Deck.deck.get(i).getSuit());
					}
			}

		public static void createHands()
			{
				System.out.println("Player's hand is:");
				for (int i = 0; i < 52; i = i + 2)
					{
						playerHand.add(Deck.deck.get(i));
						System.out.println(Deck.deck.get(i).getRank() + " of " + Deck.deck.get(i).getSuit());
					}
				System.out.println();
				System.out.println("Computer's hand is:");
				for (int i = 1; i < 52; i = i + 2)
					{
						computerHand.add(Deck.deck.get(i));
						System.out.println(Deck.deck.get(i).getRank() + " of " + Deck.deck.get(i).getSuit());
					}
			}

		public static void playWar()
			{
				// You want to grab the top card off of each of the hands
				// Compare the 2 cards to each other
				// Make some if and if else statements for the different
				// scenarios
				// Once the hand is over remove the card from the losing
				// player's deck and add the card to the winning player's deck

			}

		public static void compare()
			{
				boolean playWar = true;
				while (playWar)
					{
						int compare1 = playerHand.get(0).getValue();
						int compare2 = computerHand.get(0).getValue();
						int compareWar1 = playerHand.get(4).getValue();
						int compareWar2 = computerHand.get(4).getValue();
						System.out.println();
						if (compare1 > compare2)
							{
								System.out.println("You won this hand with a " + playerHand.get(0).getRank() + " of "
										+ playerHand.get(0).getSuit() + " vs the computer's "
										+ computerHand.get(0).getRank() + " of " + computerHand.get(0).getSuit());
								playerHand.add(computerHand.get(0));
								computerHand.remove(computerHand.get(0));
								playerHand.add(playerHand.get(0));
								playerHand.remove(0);
								System.out.println("The new size of your hand is " + playerHand.size()
										+ " and the size of the computer's hand is " + computerHand.size());
								if (playerHand.size() == 0 || computerHand.size() == 0)
									{
										playWar = false;
									}
							} else if (compare2 > compare1)
							{
								System.out.println("The computer won this hand with a " + computerHand.get(0).getRank()
										+ " of " + computerHand.get(0).getSuit() + " vs your "
										+ playerHand.get(0).getRank() + " of " + playerHand.get(0).getSuit());
								computerHand.add(playerHand.get(0));
								playerHand.remove(playerHand.get(0));
								computerHand.add(computerHand.get(0));
								computerHand.remove(0);
								System.out.println("The new size of your hand is " + playerHand.size()
										+ " and the size of the computer's hand is " + computerHand.size());
								if (playerHand.size() == 0 || computerHand.size() == 0)
									{
										playWar = false;
									}
							}

						else if (compare1 == compare2)
							{
								System.out.println("War!!");
								if (playerHand.size() > 4 && computerHand.size() > 4)
									{
										if (compareWar1 > compareWar2)
											{
												System.out.println(
														"You won this hand with a " + playerHand.get(4).getRank()
																+ " of " + playerHand.get(4).getSuit()
																+ " vs the computer's " + computerHand.get(4).getRank()
																+ " of " + computerHand.get(4).getSuit());
												playerHand.add(computerHand.get(0));
												playerHand.add(computerHand.get(1));
												playerHand.add(computerHand.get(2));
												playerHand.add(computerHand.get(3));
												playerHand.add(computerHand.get(4));
												computerHand.remove(0);
												computerHand.remove(1);
												computerHand.remove(2);
												computerHand.remove(3);
												computerHand.remove(4);
												playerHand.add(playerHand.get(0));
												playerHand.add(playerHand.get(1));
												playerHand.add(playerHand.get(2));
												playerHand.add(playerHand.get(3));
												playerHand.add(playerHand.get(4));
												playerHand.remove(0);
												playerHand.remove(1);
												playerHand.remove(2);
												playerHand.remove(3);
												playerHand.remove(4);
												System.out.println("The new size of your hand is " + playerHand.size()
														+ " and the size of the computer's hand is "
														+ computerHand.size());
												if (playerHand.size() == 0 || computerHand.size() == 0)
													{
														playWar = false;
													}
											} else if (compareWar2 > compareWar1)
											{
												System.out.println("The computer won this hand with a "
														+ computerHand.get(4).getRank() + " of "
														+ computerHand.get(4).getSuit() + " vs your "
														+ playerHand.get(4).getRank() + " of "
														+ playerHand.get(4).getSuit());
												computerHand.add(playerHand.get(0));
												computerHand.add(playerHand.get(1));
												computerHand.add(playerHand.get(2));
												computerHand.add(playerHand.get(3));
												computerHand.add(playerHand.get(4));
												playerHand.remove(0);
												playerHand.remove(1);
												playerHand.remove(2);
												playerHand.remove(3);
												playerHand.remove(4);
												computerHand.add(computerHand.get(0));
												computerHand.add(computerHand.get(1));
												computerHand.add(computerHand.get(2));
												computerHand.add(computerHand.get(3));
												computerHand.add(computerHand.get(4));
												computerHand.remove(0);
												computerHand.remove(1);
												computerHand.remove(2);
												computerHand.remove(3);
												computerHand.remove(4);
												System.out.println("The new size of your hand is " + playerHand.size()
														+ " and the size of the computer's hand is "
														+ computerHand.size());
												if (playerHand.size() == 0 || computerHand.size() == 0)
													{
														playWar = false;
													}
											}
									}
								else if (computerHand.size() == 4)
									{
										if (compareWar1 > compareWar2)
											{
												System.out.println(
														"You won this hand with a " + playerHand.get(4).getRank()
																+ " of " + playerHand.get(4).getSuit()
																+ " vs the computer's " + computerHand.get(4).getRank()
																+ " of " + computerHand.get(4).getSuit());
												playerHand.add(computerHand.get(0));
												playerHand.add(computerHand.get(1));
												playerHand.add(computerHand.get(2));
												playerHand.add(computerHand.get(3));
												computerHand.remove(0);
												computerHand.remove(1);
												computerHand.remove(2);
												computerHand.remove(3);
												playerHand.add(playerHand.get(0));
												playerHand.add(playerHand.get(1));
												playerHand.add(playerHand.get(2));
												playerHand.add(playerHand.get(3));
												playerHand.add(playerHand.get(4));
												playerHand.remove(0);
												playerHand.remove(1);
												playerHand.remove(2);
												playerHand.remove(3);
												playerHand.remove(4);
												System.out.println("The new size of your hand is " + playerHand.size()
														+ " and the size of the computer's hand is "
														+ computerHand.size());
												if (playerHand.size() == 0 || computerHand.size() == 0)
													{
														playWar = false;
													}
											} else if (compareWar2 > compareWar1)
											{
												System.out.println("The computer won this hand with a "
														+ computerHand.get(4).getRank() + " of "
														+ computerHand.get(4).getSuit() + " vs your "
														+ playerHand.get(4).getRank() + " of "
														+ playerHand.get(4).getSuit());
												computerHand.add(playerHand.get(0));
												computerHand.add(playerHand.get(1));
												computerHand.add(playerHand.get(2));
												computerHand.add(playerHand.get(3));
												computerHand.add(playerHand.get(4));
												playerHand.remove(0);
												playerHand.remove(1);
												playerHand.remove(2);
												playerHand.remove(3);
												playerHand.remove(4);
												computerHand.add(computerHand.get(0));
												computerHand.add(computerHand.get(1));
												computerHand.add(computerHand.get(2));
												computerHand.add(computerHand.get(3));
												computerHand.remove(0);
												computerHand.remove(1);
												computerHand.remove(2);
												computerHand.remove(3);
												System.out.println("The new size of your hand is " + playerHand.size()
														+ " and the size of the computer's hand is "
														+ computerHand.size());
												if (playerHand.size() == 0 || computerHand.size() == 0)
													{
														playWar = false;
													}
											}
									}
								else if (playerHand.size() == 4)
									{
										if (compareWar1 > compareWar2)
											{
												System.out.println(
														"You won this hand with a " + playerHand.get(4).getRank()
																+ " of " + playerHand.get(4).getSuit()
																+ " vs the computer's " + computerHand.get(4).getRank()
																+ " of " + computerHand.get(4).getSuit());
												playerHand.add(computerHand.get(0));
												playerHand.add(computerHand.get(1));
												playerHand.add(computerHand.get(2));
												playerHand.add(computerHand.get(3));
												playerHand.add(computerHand.get(4));
												computerHand.remove(0);
												computerHand.remove(1);
												computerHand.remove(2);
												computerHand.remove(3);
												computerHand.remove(4);
												playerHand.add(playerHand.get(0));
												playerHand.add(playerHand.get(1));
												playerHand.add(playerHand.get(2));
												playerHand.add(playerHand.get(3));
												playerHand.remove(0);
												playerHand.remove(1);
												playerHand.remove(2);
												playerHand.remove(3);
												System.out.println("The new size of your hand is " + playerHand.size()
														+ " and the size of the computer's hand is "
														+ computerHand.size());
												if (playerHand.size() == 0 || computerHand.size() == 0)
													{
														playWar = false;
													}
											} else if (compareWar2 > compareWar1)
											{
												System.out.println("The computer won this hand with a "
														+ computerHand.get(4).getRank() + " of "
														+ computerHand.get(4).getSuit() + " vs your "
														+ playerHand.get(4).getRank() + " of "
														+ playerHand.get(4).getSuit());
												computerHand.add(playerHand.get(0));
												computerHand.add(playerHand.get(1));
												computerHand.add(playerHand.get(2));
												computerHand.add(playerHand.get(3));
												playerHand.remove(0);
												playerHand.remove(1);
												playerHand.remove(2);
												playerHand.remove(3);
												computerHand.add(computerHand.get(0));
												computerHand.add(computerHand.get(1));
												computerHand.add(computerHand.get(2));
												computerHand.add(computerHand.get(3));
												computerHand.add(computerHand.get(4));
												computerHand.remove(0);
												computerHand.remove(1);
												computerHand.remove(2);
												computerHand.remove(3);
												computerHand.remove(4);
												System.out.println("The new size of your hand is " + playerHand.size()
														+ " and the size of the computer's hand is "
														+ computerHand.size());
												if (playerHand.size() == 0 || computerHand.size() == 0)
													{
														playWar = false;
													}
											}
									}
							}
					}
			}
	}
