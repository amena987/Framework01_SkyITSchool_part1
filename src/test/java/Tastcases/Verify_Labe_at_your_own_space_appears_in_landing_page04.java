package Tastcases;

import Base.CommonMethords;

public class Verify_Labe_at_your_own_space_appears_in_landing_page04 extends CommonMethords{

	public static void main(String[] args) throws InterruptedException {
		setup();
		navigateURL();
		String s = getElementText("//h2[text()='Sky IT School Popular Courses']/preceding-sibling::span");
		
		//Verify the Text is "Experts Teachers"
		if ( s.contentEquals("LEARN AT YOUR OWN PACE") )
			System.out.println("LEARN AT YOUR OWN PACE - Pass");
		else
			System.out.println("LEARN AT YOUR OWN PACE - Fail");
		
		//tearDown();
		
		

	}

}
