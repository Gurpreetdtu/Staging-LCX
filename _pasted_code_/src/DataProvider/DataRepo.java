package DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataRepo {
	
	@DataProvider
	
	public static Object[][] getData(Method name) {
		System.out.println("Testcase which has method: " +name.getName());
		Object[][] data = new Object[3][4];
		
		
		data[0][0] = "Username";
		data[0][1] = 1234;
		data[0][2] = "Emailtest@gmail.com";
		data[0][3]	= 9894588;
		
		data[1][0] = "Username1";
		data[1][1] = 12345;
		data[1][2] = "Emailtest1@gmail.com";
		data[1][3]	= 9899388;
		
		data[2][0] = "Username2";
		data[2][1] = 12345;
		data[2][2] = "Emailtest2@gmail.com";
		data[2][3]	= 9893588;
		return data;
		
	}
	
	

}
