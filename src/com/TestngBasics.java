package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*setup
launchBrowser
login
Enter URl
googleTitleText
LogoutFrom app
closeBrowser
deleteallcookies*/



/*@BeforeMethod
@Test 1
@AfterMethod

*@BeforeMethod
@Test 2
@AfterMethod
*
*@BeforeMethod
@Test 3
@AfterMethod
*
*/

public class TestngBasics {

    @BeforeSuite //1  //Preconditions-- starting with @Before 
public void setup() {
		System.out.println("setup");
	}
    
    @BeforeTest//2
public void launchBrowser() {
		System.out.println("launchBrowser");
	}
    
	@BeforeClass//3
	public void login() {
		System.out.println("login");
	}
	
	@BeforeMethod//4
	public void enterURl() {
		System.out.println("Enter URl");
	}
	
    
    @Test //5    //Testcase starting with @Test
    public void googleTitleText() {
    	System.out.println("googleTitleText");
    }
    
    @Test
    public void Search() {
    	System.out.println("Search function");
    	int i = 10/0;
    }
    
    @Test(dependsOnMethods="Search")
    public void logocheck() {
    	System.out.println("logocheck");
    }
   
    @Test
    public void url() {
    	System.out.println("urlcheck");
    }
   
    @Test
    public void printcheck() {
    	System.out.println("printcheck");
    }
    
    
    @AfterMethod//6  //Post conditions starting with @After
    public void Logout() {
    	System.out.println("LogoutFrom app");
    }

    @AfterClass//7
    public void closeBrowser() {
    	System.out.println("closeBrowser");
    }
   
    @AfterTest//8
    public void deleteallcookies() {
    	System.out.println("deleteallcookies");
    }
    @AfterSuite//9
    public void generatetestreport() {
    	System.out.println("generatetestreport");
    }
    
}
