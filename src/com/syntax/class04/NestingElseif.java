package com.syntax.class04;

public class NestingElseif {

	public static void main(String[] args) {
		/*if student completed a a quiz we will check for a score
		 * if score > 90 --->great job
		 * if score > 80 ---> well done
		 * if score >70----->You could have done better 
		 */
		//else if" is known as if else ladder, if you want to check one condition from many alternatives on one variable, then you use else if,
		//she was using more than one variables, that is why she used "if"statement.
		boolean quizCompleted = true;
		int score= 85;
		
		if(quizCompleted) {
			System.out.println("Lets check your score");
			 
			if(score>90) {
				System.out.println("Great job, you study a lot");
			}else if(score>80) {
				System.out.println("well done");
			}else if(score >70) {
				System.out.println("you could have done better");
			}else {
				System.out.println("You failed");
			}
			}else {
			System.out.println("Please do hw on time");
		}

	}

}
