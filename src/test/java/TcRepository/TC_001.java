package TcRepository;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage; 

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass{
	
	@Test
	public void lE_01Test() throws Exception {
		
		System.out.println("Test method started");
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		Assert.fail();
		String fName = eUtil.getDataFromExcel("LEADS", 1, 1);
		String lName = eUtil.getDataFromExcel("LEADS", 1, 2);
		String company = eUtil.getDataFromExcel("LEADS", 1, 3);
		CreatingNewLeadPage cnl = new CreatingNewLeadPage(driver);
		cnl.createNewLead(fName, lName, company);
		System.out.println("test method executed");
		
	}
	

}
