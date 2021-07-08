package leetCode;

import java.util.Scanner;



public class CobraKaiQuizz {




	public static void main(String [] args) {


		String q1 = "What stuffed animal becomes a symbol of Miguel and Sam’s relationship??\n"
				+ "(a)/Monkey\n(b)Octupus\n(c)Cat\n";


		String q2 = "Who is the stunt coordinator of the Cobra Kai series???\n"
				+ "(a)/Hayden Schlossberg\n(b)Hiro Koda\n(c)William Zabka\n";



		String q3 = "Which of the following is something Tory doesn’t do in her first episode????\n"
				+ "(a)/Throw Sam through a table full of cakes.\n(b)Steal Amanda’s wallet.\n(c)Beat Miguel on the mat.\n";




		String q4 = "Who hosts the party where both the teams get drunk?\n"
				+ "(a)/Hawk.\n(b)Moon.\n(c)Miguel.\n";



		String q5 = "What was Johnny’s job before reopening the Cobra Kai?\n"
				+ "(a)/Handyman\n(b)Fixing Motorcycles.\n(c)Car Mechanic\r\n"
				;

		Preguntas [] questions = {

				new Preguntas(q1, "b"),
				new Preguntas(q2, "b"),
				new Preguntas(q3 , "b"),
				new Preguntas(q4, "b"),
				new Preguntas(q5, "a") 

		} ; // Questions array
		
		takeTest(questions) ; 



	} // Main
	
	
	public static void takeTest(Preguntas [] questions) {
		
		int score = 0 ; // contador 
		
		Scanner input = new Scanner(System.in) ; 
		
		
		for(int i = 0 ; i < questions.length ; i++) {
			
			
			System.out.println(questions[i].prompt);
			String answer = input.next()  ; 
			
			if(answer.equals(questions[i].answer)) {
				
				score++ ; 
				
				
			} // if
			
			
		} // for loop
			

		System.out.println("You got "+ score + "/" + questions.length);
		
		
		
	} // takeQuestions








} // class
