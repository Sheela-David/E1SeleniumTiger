package TcRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass{

	@Test(groups = {"Smoke", "Regression"})
	public void lE_02Test() throws Exception {
		
		System.out.println("Test method started");
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
		String fName = eUtil.getDataFromExcel("Leads", 4, 1);
		String lName = eUtil.getDataFromExcel("Leads", 4, 2);
		String company = eUtil.getDataFromExcel("Leads", 4, 3);
		String title = eUtil.getDataFromExcel("Leads", 4, 4);
		String phone = eUtil.getDataFromExcel("Leads", 4, 5);
		String mobile = eUtil.getDataFromExcel("Leads", 4, 6);
		String email = eUtil.getDataFromExcel("Leads", 4, 7);
		String noOfEmployees = eUtil.getDataFromExcel("Leads", 4, 8);
		String street = eUtil.getDataFromExcel("Leads", 4, 9);
		String poBox = eUtil.getDataFromExcel("Leads", 4, 10);
		String postalCode = eUtil.getDataFromExcel("Leads", 4, 11);
		String city = eUtil.getDataFromExcel("Leads", 4, 12);
		String country = eUtil.getDataFromExcel("Leads", 4, 13);
		String state = eUtil.getDataFromExcel("Leads", 4, 14);
		Thread.sleep(2000);
		CreatingNewLeadPage cnl = new CreatingNewLeadPage(driver);
		cnl.createNewLead(fName, lName, company, title, phone, mobile, email,noOfEmployees, street, poBox, postalCode, city, country, state);
		Thread.sleep(2000);
		System.out.println("Test method executed");
	}

}
