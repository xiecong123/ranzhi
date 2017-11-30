import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class DayWork extends BaseTest {
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
   
   
//   @Test(dependsOnMethods="Mykaoqin")
//   public void kaoqin1(){
//	 
//	   webtest.enterFrame("iframe-2");
//	   webtest.click("xpath=.//*[@id='mainNavbar']/ul/li[4]/a");
//	   webtest.click("xpath=.//*[@id='menu']/ul/li[4]/a");
//	   webtest.leaveFrame();
//	   
//	   }
   // 搜索查看日期为2017-11月的考勤明细
   @Test(dependsOnMethods="kaoqin1")
   public void kaoqin2(){
	  webtest.enterFrame("iframe-2");
	  webtest.click("xpath=.//*[@id='account_chosen']/a");
	  webtest.selectByValue("xpath=.//*[@id='account_chosen']/a", "admin");
	  webtest.click("xpath=.//*[@id='account_chosen']/div/ul/li");
	  webtest.type("name=data", "2017-11");
	  webtest.click("xpath=.//*[@id='submit']");
	  webtest.leaveFrame();
	  
   }
   //编辑admin用户的考勤
//   @Test(dependsOnMethods="kaoqin1")
//   public void kaoqin3()
//   {
//	   webtest.enterFrame("iframe-2");
//	   webtest.click("xpath=.//*[@id='menu']/ul/li[6]/a");
//	   webtest.click("xpath=.//*[@id='attendStat']/tbody/tr[3]/td/a");
//	   webtest.typeAndClear("xpath=.//*[@id='normal[admin]']", "");
//	   webtest.type("xpath=.//*[@id='normal[admin]']","3");
//	   webtest.typeAndClear("xpath=.//*[@id='late[admin]']", "");
//	   webtest.type("xpath=.//*[@id='late[admin]']","4");
//	   webtest.typeAndClear("xpath=.//*[@id='actual[admin]']","");
//	   webtest.type("xpath=.//*[@id='actual[admin]']","25");
//	   webtest.click("id=submit");
//	   webtest.leaveFrame();
//	   }
   //公司考勤设置
   @Test(dependsOnMethods="kaoqin1")
   public void kaoqin4(){
	   webtest.enterFrame("iframe-2");
	   webtest.click("xpath=.//*[@id='menu']/ul/li[7]/a");
	   webtest.typeAndClear("xpath=.//*[@id='beginDate[company]']","");
	   webtest.type("xpath=.//*[@id='beginDate[company]']", "2017-01-10");
	   webtest.typeAndClear("name=workingHours","");
	   webtest.type("name=workingHours", "8");
	   webtest.click("xpath=.//*[@id='submit']");
	   webtest.leaveFrame();
	   }
   }
   
   







