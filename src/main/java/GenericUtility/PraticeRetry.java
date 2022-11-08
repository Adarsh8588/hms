package GenericUtility;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PraticeRetry {
	@Test(retryAnalyzer = GenericUtility.RetryAnalizerImplementationclass.class)
	public void retry() {
		System.out.println("test1");
		System.out.println("test2");
		Assert.fail();
		System.out.println("trst3");
	}

}
