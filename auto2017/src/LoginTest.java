

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

public class LoginTest extends BaseTest {
	WebDriverEngine webtest= null;
	public LoginTest(WebDriverEngine webtest){
		
		this.webtest=webtest;
		
	}
	
	

	public void Login() throws InterruptedException {
		// TODO Auto-generated method stub
		
		webtest.open("http://127.0.0.1/ranzhi/sys/user-login-L3JhbnpoaS9zeXMv.html");
	    webtest.type("name=account","admin");
	    webtest.type("name=password", "123456");
	    Thread.sleep(3000);
	    webtest.click("xpath=.//*[@id='submit']");
	}

	 
		
		
	}


