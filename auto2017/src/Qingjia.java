import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Qingjia extends BaseTest {
	LoginTest login=null;
	@BeforeTest
	public void login() throws InterruptedException{
		login=new LoginTest(webtest);
		login.Login();
		
	}
	@Test
	   public void Mykaoqin() {
		   webtest.click("xpath=.//*[@id='s-menu-2']/button");

		   }
	// 查看我的请假信息
	@Test(dependsOnMethods="Mykaoqin")
	public void qingjia(){
		webtest.enterFrame("iframe-2");
		webtest.click("xpath=.//*[@id='mainNavbar']/ul/li[5]/a");
	    
		
	}
	//添加一条请假
//	@Test(dependsOnMethods="qingjia")
//	public void addqing(){
//		
//		webtest.click("xpath=.//*[@id='menuActions']/a[2]");
//		webtest.click("xpath=.//*[@id='typesick']");
//		webtest.type("name=begin", "2017-11-11");
//		webtest.typeAndClear("name=start","");
//		webtest.type("name=start", "12:00");
//		webtest.type("xpath=.//*[@id='end']", "2017-11-13");
//	    webtest.typeAndClear("name=start","");
//		webtest.type("name=hours", "48");
//		webtest.type("xpath=.//*[@id='desc']", "感冒发烧");
//		webtest.click("id=submit");
//	}
	//通过一条请假
//	@Test(dependsOnMethods="qingjia")
//	public void accqing(){
//		webtest.click("xpath=.//*[@id='menu']/ul/li[2]/a");
//		webtest.click("xpath=.//*[@id='leaveTable']/tbody/tr/td[11]/a[3]");
//		webtest.getAlert();
//		webtest.alertAccept();
//		}
	//在我的请假里删除一条等待审核的请假信息
//	@Test(dependsOnMethods="qingjia")
//	public void delqing(){
//		webtest.click("xpath=.//*[@id='leaveTable']/tbody/tr[1]/td[12]/a[5]");
//		webtest.getAlert();
//		webtest.alertAccept();
//	
//	}
	//设置请假审核者为admin
	@Test(dependsOnMethods="qingjia")
	public void arrqing(){
		webtest.click("xpath=.//*[@id='menu']/ul/li[4]/a");
		webtest.click("xpath=.//*[@id='reviewedBy_chosen']/a");
		webtest.click("xpath=.//*[@id='reviewedBy_chosen']/div/ul/li[2]");
		webtest.click("xpath=.//*[@id='submit']");
		
	}
	
	
	
}
