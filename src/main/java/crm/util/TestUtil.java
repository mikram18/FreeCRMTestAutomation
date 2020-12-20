package crm.util;

import crm.base.TestBase;

public class TestUtil extends TestBase {
	
	//commons methods applicable to all the test cases go here. screenshots go here. switch to frame go here
	//command+shift+o to import all imports
	
	public static  long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	public void switchtoFrame() {
		driver.switchTo().frame("mainpanel");
		
	}
	

}
