package TcRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreateNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_008 extends BaseClass{
	
	@Test(groups="Smoke")
	public void ORG_04Test() throws Exception {
		System.out.println("Test method started");
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisationsMenu();
		OrganizationsPage lp = new OrganizationsPage(driver);
		lp.clickOnCreateNewOrganizationIcon();
		String oName = eUtil.getDataFromExcel("Organisation", 10, 1);
		String website = eUtil.getDataFromExcel("Organisation", 10, 2);
		String employees = eUtil.getDataFromExcel("Organisation", 10, 3);
		String phone = eUtil.getDataFromExcel("Organisation", 10, 4);
		String oPhone = eUtil.getDataFromExcel("Organisation", 10, 5);
		String email = eUtil.getDataFromExcel("Organisation", 10, 6);
		String billingAddress = eUtil.getDataFromExcel("Organisation", 10, 7);
		String billingCity = eUtil.getDataFromExcel("Organisation", 10, 8);
		String billingState = eUtil.getDataFromExcel("Organisation", 10, 9);
		CreateNewOrganizationPage cno = new CreateNewOrganizationPage(driver);
		cno.createNewOrganization(oName, website, employees, phone, oPhone, email, billingAddress, billingCity, billingState);
	}
	

}
