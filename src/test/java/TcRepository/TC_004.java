package TcRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_004 extends BaseClass{
	@Test
public void LE_04()  throws Exception{
		
		System.out.println("Test method started");
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String fName = eUtil.getDataFromExcel("Leads", 10, 1);
		String lName = eUtil.getDataFromExcel("Leads", 10, 2);
		String company = eUtil.getDataFromExcel("Leads", 10, 3);
		String street = eUtil.getDataFromExcel("Leads", 10, 4);
		String poBox = eUtil.getDataFromExcel("Leads", 10, 5);
		String postalCode = eUtil.getDataFromExcel("Leads", 10, 6);
		String city = eUtil.getDataFromExcel("Leads", 10, 7);
		String country = eUtil.getDataFromExcel("Leads", 10, 8);
		String state = eUtil.getDataFromExcel("Leads", 10, 9);
		CreatingNewLeadPage cnl = new CreatingNewLeadPage(driver);
		cnl.createNewLead(fName, lName, company, street, poBox, postalCode, city, country, state);
		System.out.println("Test method executed");
}

}
