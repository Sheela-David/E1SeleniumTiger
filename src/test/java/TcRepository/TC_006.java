package TcRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreateNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_006 extends BaseClass {
	
	@Test(groups= {"Smoke", "Regression"})
	public void ORG_02Test() throws Exception {
		System.out.println("Test method started");
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganizationsPage lp = new OrganizationsPage(driver);
		lp.clickOnCreateNewOrganizationIcon();
		String oName = eUtil.getDataFromExcel("Organisation", 4, 1);
		String website = eUtil.getDataFromExcel("Organisation", 4, 2);
		String employees = eUtil.getDataFromExcel("Organisation", 4, 3);
		String phone = eUtil.getDataFromExcel("Organisation", 4, 4);
		String oPhone = eUtil.getDataFromExcel("Organisation", 4, 5);
		String email = eUtil.getDataFromExcel("Organisation", 4, 6);
		CreateNewOrganizationPage cno = new CreateNewOrganizationPage(driver);
		cno.createNewOrganization(oName, website, employees, phone, oPhone, email);
	}

}
