package Com.TestLayer;



import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.PimPage;

public class PimPageTest extends BaseClass {
	@Test
	public void validiatePimPageFunctionality()
	{
		PimPage pimPage = new PimPage();
		pimPage.clickOnPimLink();
		
	}
	
	
	
	

}
