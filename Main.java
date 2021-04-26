/******************************************************************************

generate a random number
- ask user to guess
- tell user if they are too high or too low
- exit when they guess right

*******************************************************************************/

import java.util.Random;
import java.util.Scanner;
// Importing the Scanner and random
public class Main
{
  public static void main (String[]args)
  {

    int ranum = 1;
    int usernum;
// Setting ints

    Scanner reader1 = new Scanner (System.in);
    Random randy = new Random ();
// Creating the names for the scanner and the random

      ranum = randy.nextInt (1001);
      System.out.println ("What do you think the number is?");
      usernum = reader1.nextInt ();
// Asking the initial question, as well as making sure the number is less than 1000, so we don't have to guess for too long

    while (ranum != usernum)
      {
// While random number is not equal to user number

	if (usernum < ranum)
	  {
	    System.out.println ("Wrong, too low. Try again.");
	    usernum = reader1.nextInt ();
// If its too low it does this and asks
	  }

	else if (usernum > ranum)
	  {
	    System.out.println ("Wrong. too high. Try again.");
	    usernum = reader1.nextInt ();
// If its too high it does this and asks
	  }
      }

    System.out.println ("Correct! The number is indeed " + ranum);
//When the number is right it tells you the number

  }
}

