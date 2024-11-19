package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	@Test(priority = 1, invocationCount = 4)
	public void createUser() {
		System.out.println("User Created");
	}
	
	@Test(priority = -1, dependsOnMethods = {"createUser"}, invocationCount = 0)
	public void modifyUser() {
		System.out.println("User Modified");	
	}
	
	
	@Test(priority = 2)
	public void deleteUser() {
		System.out.println("User Deleted");	
	}
	

}
