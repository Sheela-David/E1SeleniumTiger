package TcRepository;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreateNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_005 extends BaseClass {
	
	@Test(groups="Smoke")
	public void ORG_01Test() throws Exception {
		System.out.println("Test method started");
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		Assert.fail();
		OrganizationsPage lp = new OrganizationsPage(driver);
		lp.clickOnCreateNewOrganizationIcon();
		String oName = eUtil.getDataFromExcel("Organisation", 1, 1);
		String website = eUtil.getDataFromExcel("Organisation", 1, 2);
		String employees = eUtil.getDataFromExcel("Organisation", 1, 3);
		CreateNewOrganizationPage cno = new CreateNewOrganizationPage(driver);
		cno.createNewOrganization(oName, website, employees);
	}
	
}


