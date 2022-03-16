package MavenTest;

import org.testng.annotations.Test;

public class ReadDataAndTest {
	
	@Test
	public void readDataTest()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
		String URL = System.getProperty("url");
		System.out.println(URL);
		
	}
}
