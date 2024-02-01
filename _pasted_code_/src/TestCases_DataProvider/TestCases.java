package TestCases_DataProvider;

import org.testng.annotations.Test;

import DataProvider.DataRepo;

public class TestCases {
	
	@Test(dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void launchurl(String username, int Mobile, String Email_id, int Employ_Code) {
	}
	@Test(dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void entercredentionals(String username, int Mobile, String Email_id, int Employ_Code) {
	}
	@Test(dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void validateLoginPage(String username, int Mobile, String Email_id, int Employ_Code) {
	}
	@Test(dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void logout(String username, int Mobile, String Email_id, int Employ_Code) {
			
	}

}

