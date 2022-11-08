package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	@Test


public void hardassert() {
	System.out.println("step1");
	System.out.println("step2");
	System.out.println("step3");
	Assert.assertEquals("a","b","failhere");
	System.out.println("step4");
	System.out.println("step5");
}
}