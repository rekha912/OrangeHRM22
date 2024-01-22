package Com.TestLayer;

import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.AddEmpPage;

public class AddEmpPageTest extends BaseClass{
	@Test
	public void validiateaddEmployeePageFunctionality()
	{
		AddEmpPage addEmpPage = new AddEmpPage();
		addEmpPage.addEmployee("Rekha", "Sukhadev", "Misal");
	}
}
