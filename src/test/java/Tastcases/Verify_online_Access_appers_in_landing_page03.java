package Tastcases;

import Base.CommonMethords;

public class Verify_online_Access_appers_in_landing_page03 extends CommonMethords {

	public static void main(String[] args) throws InterruptedException {

		setup();
		navigateURL();
		
		String s =  getElementText("//h3[text()='Online 24/7 Access']");
		// verify the Text of that
		if (s.contains("Online 24/7 Access"))
			System.out.println("Online 24/7 Access--pass");
		else
			System.out.println("Fail");
		Thread.sleep(10000);
		//tearDown();//close driver
	}

}
