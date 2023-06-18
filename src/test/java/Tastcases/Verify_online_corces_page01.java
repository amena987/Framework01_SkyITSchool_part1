package Tastcases;

import Base.CommonMethords;

public class Verify_online_corces_page01 extends CommonMethords {

	public static void main(String[] args) throws InterruptedException {
		setup();
		navigateURL();
		
		String s = getElementText("//h3[text()='Online Courses']");
		// verify the Text of that
		if (s.contains("Online Courses"))
			System.out.println("pass");
		else
			System.out.println("Fail");

		Thread.sleep(10000);
		// tearDown();
	}

}
