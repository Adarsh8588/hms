package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert_pratices {
	@Test
	public void softassert() {
		
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("a","a","fail and pass");
		System.out.println("step4");
		System.out.println("step5");
		System.out.println("step6");
		sa.assertAll();
	}
	@Test
public void test2() {
	System.out.println("step7");
	System.out.println("step8");
	
}
}
