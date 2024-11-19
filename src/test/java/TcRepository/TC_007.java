package TcRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreateNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_007 extends BaseClass {
	
	@Test
	public void ORG_03Test() throws Exception {
		System.out.println("Test method started");
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganizationsPage lp = new OrganizationsPage(driver);
		lp.clickOnCreateNewOrganizationIcon();
		String oName = eUtil.getDataFromExcel("Organisation", 7, 1);
		String website = eUtil.getDataFromExcel("Organisation", 7, 2);
		String billingAddress = eUtil.getDataFromExcel("Organisation", 7, 3);
		String billingCity = eUtil.getDataFromExcel("Organisation", 7, 4);
		String billingState = eUtil.getDataFromExcel("Organisation", 7, 5);
		CreateNewOrganizationPage cno = new CreateNewOrganizationPage(driver);
		cno.createNewOrganization(oName, website, billingAddress, billingCity, billingState);
	}
	
}


