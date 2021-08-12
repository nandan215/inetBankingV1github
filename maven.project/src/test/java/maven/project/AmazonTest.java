package maven.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends MavenBase {
	

	
	@Test
	public void launcbrowser()
	{
		Log.info("i am Logging Log Launc");
		System.out.println("launch the browser");
	
	}
	@Test
	public void aundrfined()
	{
		System.out.println("aundrrefined");
		Log.info("i am Logging at aundfriend");
	}
	@Test(priority=2)
	public void opentheWebsite()
	{
		//driver.get("https://amazon.in");
		System.out.println("opentheWebsite");
	}
	
	@Test(priority=3)
	public void maximizeTheWindow()
	{
		//driver.manage().window().maximize();
		System.out.println("maximizeTheWindow");

	}
	@Test(priority=4)
	public void waiting()
	{
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println("waiting");

	}
	
	@Test(priority=5)
	public void closeTheBrowser()
	{
		//driver.close();
		System.out.println("closeTheBrowser");
		

	}
	
}
