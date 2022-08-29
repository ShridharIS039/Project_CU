package CreateAccountTest;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cu.genericutility.BaseClass2;
import com.cu.genericutility.ExcelUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.cu.genericutility.ListenerImplementationClass.class)

public class VerifyToAdmissionReportPageTest extends BaseClass1 {
	@Test(priority = 1)
	public void VerifyToAdmissionReportPage1Test() throws Throwable {

			System.out.println("Login is done");
		Reporter.log("VerifyToAdmissionReportPageTest is pass", true);
	}
}
