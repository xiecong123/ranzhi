import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Buban extends BaseTest {
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
	//�鿴�ҵĲ�����Ϣ
	@Test(dependsOnMethods="Mykaoqin")
	public void buban(){
		webtest.enterFrame("iframe-2");
		webtest.click("xpath=.//*[@id='mainNavbar']/ul/li[6]/a");
	}
	//����һ����ȷ�Ĳ�������
//	@Test(dependsOnMethods="buban")
//	public void addbu1(){
//		
//		webtest.click("xpath=.//*[@id='menuActions']/a[2]");
//		webtest.type("xpath=.//*[@id='begin']", "2017-10-10");
//		webtest.type("xpath=.//*[@id='end']", "2017-10-13");
//		webtest.typeAndClear("xpath=.//*[@id='hours']","");
//		webtest.type("xpath=.//*[@id='hours']","52");
//		webtest.click("xpath=.//*[@id='leave_chosen']/ul");
//		webtest.click("xpath=.//*[@id='leave_chosen']/div/ul/li");
//		webtest.click("xpath=.//*[@id='submit']");
//	}
	//����һ�����ʱ��Ϊ�����ֵĲ�������
//	@Test(dependsOnMethods="buban")
//	public void addbu2(){
//		
//		webtest.click("xpath=.//*[@id='menuActions']/a[2]");
//		webtest.type("xpath=.//*[@id='begin']", "2017-10-10");
//		webtest.type("xpath=.//*[@id='end']", "2017-10-14");
//		webtest.typeAndClear("xpath=.//*[@id='hours']","");
//		webtest.type("xpath=.//*[@id='hours']","52aaa");
//		webtest.click("xpath=.//*[@id='leave_chosen']/ul");
//		webtest.click(".//*[@id='leave_chosen']/div/ul/li[1]");
//		webtest.click("xpath=.//*[@id='submit']");
//	}
	//����һ����ټ�¼Ϊ�յĲ�������
//	@Test(dependsOnMethods="buban")
//	public void addbu3(){
//		
//		webtest.click("xpath=.//*[@id='menuActions']/a[2]");
//		webtest.type("xpath=.//*[@id='begin']", "2017-10-14");
//		webtest.type("xpath=.//*[@id='end']", "2017-10-15");
//		webtest.typeAndClear("xpath=.//*[@id='hours']","");
//		webtest.type("xpath=.//*[@id='hours']","8");
//		webtest.click("xpath=.//*[@id='submit']");
//	}
	//���һ����ʼ���ڴ��ڽ������ڵĲ�������
	@Test(dependsOnMethods="buban")
	public void addbu3(){
		
		webtest.click("xpath=.//*[@id='menuActions']/a[2]");
		webtest.type("xpath=.//*[@id='begin']", "2017-10-16");
		webtest.type("xpath=.//*[@id='end']", "2017-10-15");
		webtest.typeAndClear("xpath=.//*[@id='hours']","");
		webtest.type("xpath=.//*[@id='hours']","8");
		webtest.click("xpath=.//*[@id='submit']");
	}
	
	
	
	
	

}
