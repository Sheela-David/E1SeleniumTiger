package TcRepository;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreateNewContactsPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplementation.class)

public class TC_009 extends BaseClass{
	
	@Test
	public void CON_Test() throws Exception {
		
		System.out.println("Test method started");
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		Assert.fail();
		String fName = eUtil.getDataFromExcel("Contacts", 1, 1);
		String lName = eUtil.getDataFromExcel("Contacts", 1, 2);
		String title = eUtil.getDataFromExcel("Contacts", 1, 3);
		CreateNewContactsPage cnc = new CreateNewContactsPage(driver);
		cnc.createNewContacts(fName, lName, title);
	}

}
