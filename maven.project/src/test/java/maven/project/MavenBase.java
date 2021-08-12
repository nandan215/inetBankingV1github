package maven.project;


import org.testng.annotations.*;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;                                            //Note in log4j api interface Logger,class is LogManager
public class MavenBase {               //in Log 4j core iterface:1)Layout   2)Appender // class= 1)Logger 2)Console Appender
	public static Logger Log;
	
	@BeforeClass()
	public void iamFirst()
	{
		System.out.println("iam first");
		Log =LogManager.getLogger(MavenBase.class.getName());
	
		
	}
	
	@AfterClass()
	public void iamLast()
	{
		System.out.println("iam LAst");
	}

}

