import java.util.*;
import java.io.*;
public class InheritanceQuizzer
	{
	static int i;
	static int randomPickOne;
	static int randomPickTwo;
	static int questionPick;
	static int answer;
	static int counter = 0;
	static int turns;
	public static void main(String[] args)
		{
		startQuiz();
		}

	private static void startQuiz()
		{
		System.out.println("How many Questions would you like to be asked?");
		java.util.Scanner userInput = new Scanner(System.in);
		turns = userInput.nextInt();
		for (i = 0; i < turns; i++)
			{
			runQuiz();
			System.out.println("");
			}
		finalScore();
		}

	private static void finalScore()
		{
		System.out.println("You have gotten " + counter + " out of " + turns + " correct.");
		}

	private static void runQuiz()
		{
		randomPickOne = (int)(Math.random()* 2);
		randomPickTwo = (int)(Math.random()* 2);
		
		if (randomPickOne == 0)
			{
			Planet x;
			if (randomPickTwo == 0)
				{
				x = new Planet();
				System.out.println((i + 1) + "). If the code runs:");
				System.out.println("     Planet x = new Planet();");
				resultQuestion();
				}
			else 
				{
				x = new Earth();
				System.out.println((i + 1) + "). If the code runs:");
				System.out.println("     Planet x = new Earth();");
				resultQuestion();
				}
			}
		else
			{
			Earth x;
			if (randomPickTwo == 0)
				{
				//x = new Planet();
				System.out.println((i + 1) + "). If the code runs:");
				System.out.println("     Earth x = new Planet();");
				resultQuestion();
				}
			else 
				{
				x = new Earth();
				System.out.println((i + 1) + "). If the code runs:");
				System.out.println("     Earth x = new Earth();");
				resultQuestion();
				}
			}
		}

	private static void resultQuestion()
		{
		questionPick = (int)(Math.random()* 3);
		if (questionPick == 0)
			{
			System.out.println("     x.orbit();");
			questioning();
			}
		else if (questionPick == 1)
			{
			System.out.println("     x.supportLife();");
			questioning();
			}
		else 
			{
			System.out.println("     x.meteorStrike");
			questioning();
			}
		}

	private static void questioning()
		{
		System.out.println("");
		System.out.println("What will the result be?");
		System.out.println("  1). KABOOM!");
		System.out.println("  2). IT'S ALIVEEE");
		System.out.println("  3). And it only took 365 days!");
		System.out.println("  4). We go around and around and around");
		System.out.println("  5). Error");
		java.util.Scanner userInput = new Scanner(System.in);
		answer = userInput.nextInt();
		checkAnswer();
		}

	private static void checkAnswer()
		{
		if ((randomPickOne == 0 && randomPickTwo == 0) && questionPick == 0)
			{
			if (answer == 4)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 0 && randomPickTwo == 0) && questionPick == 1)
			{
			if (answer == 5)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 0 && randomPickTwo == 0) && questionPick == 2)
			{
			if (answer == 1)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 0 && randomPickTwo == 1) && questionPick == 0)
			{
			if (answer == 3)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 0 && randomPickTwo == 1) && questionPick == 1)
			{
			if (answer == 5)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 0 && randomPickTwo == 1) && questionPick == 2)
			{
			if (answer == 1)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 1 && randomPickTwo == 0))
			{
			if (answer == 5)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 1 && randomPickTwo == 1) && questionPick == 0)
			{
			if (answer == 3)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 1 && randomPickTwo == 1) && questionPick == 1)
			{
			if (answer == 2)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		else if ((randomPickOne == 1 && randomPickTwo == 1) && questionPick == 2)
			{
			if (answer == 5)
				{
				System.out.println("Correct!");
				counter++;
				}
			else 
				{
				System.out.println("Sorry, that is incorrect");
				}
			}
		}

	}
