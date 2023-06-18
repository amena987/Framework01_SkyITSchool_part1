package Tastcases;

import Base.CommonMethords;

public class Verify_expart_teacher_appears_in_landing_page02 extends CommonMethords {

	public static void main(String[] args) throws InterruptedException {

		setup();

		navigateURL();
		
		String s = getElementText("//h3[text()='Experts Teachers']");
		// verify the Text of that
		if (s.contains("Experts Teachers"))
			System.out.println("Experts Teachers--pass");
		else
			System.out.println("Fail");
		Thread.sleep(10000);
		System.out.println("update");
		tearDown();
	}

}
