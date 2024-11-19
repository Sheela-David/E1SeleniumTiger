package TcRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass{
	
	@Test
	public void LE_03()  throws Exception{
		
		System.out.println("Test method started");
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String fName = eUtil.getDataFromExcel("Leads", 7, 1);
		String lName = eUtil.getDataFromExcel("Leads", 7, 2);
		String company = eUtil.getDataFromExcel("Leads", 7, 3);
		String title = eUtil.getDataFromExcel("Leads", 7, 4);
		String phone = eUtil.getDataFromExcel("Leads", 7, 5);
		String mobile = eUtil.getDataFromExcel("Leads", 7, 6);
		String email = eUtil.getDataFromExcel("Leads", 7, 7);
		String noOfEmployees = eUtil.getDataFromExcel("Leads", 7, 8);
		CreatingNewLeadPage cnl = new CreatingNewLeadPage(driver);
		cnl.createNewLead(fName, lName, company, title, mobile, phone, email, noOfEmployees);
		System.out.println("Test method executed");

	}

}
