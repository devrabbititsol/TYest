package web.test.testmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class TestScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"Test\",\"project_description\":\"test\",\"project_id\":415,\"module_name\":\"TestModule\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":707,\"testcase_name\":\"TC_Test\",\"testcase_id\":576,\"testset_id\":0,\"executed_timestamp\":-1104967144,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "test";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public TestScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Contact')]")	
	private WebElement	Contact_404219a;
	public String clkaContact_404219() {
		waitForExpectedElement(driver, Contact_404219a);		
		String text = Contact_404219a.getText();
		Contact_404219a.click();
		return text;
	}

}