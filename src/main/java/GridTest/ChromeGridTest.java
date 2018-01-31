package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {
	
	
	public static final String USERNAME = "rohanwarang1";
	  public static final String AUTOMATE_KEY = "zeRxayjBsAdqxipWefaU";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  
	  
public static void main(String args[]) throws MalformedURLException {
	
		
	
	//System.out.println(1);
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("opera");
	cap.setPlatform(Platform.MAC);
	
	ChromeOptions options=new ChromeOptions();
	options.merge(cap);
	
	//String hubUrl="http://192.168.0.100:4444/wd/hub";
	WebDriver driver=new RemoteWebDriver(new URL(URL),options);
	
	driver.get("http://www.tcs.com");
	driver.quit();
}
}
