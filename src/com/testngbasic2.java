package com;

import org.testng.annotations.Test;

public class testngbasic2 {
	   
	    @Test //5    //Testcase starting with @Test
	    public void googleTitleText() {
	    	System.out.println("googleTitleText");
	    }
	    
	    @Test
	    public void Search() {
	    	System.out.println("Search function");
	    	//int i = 10/0;
	    }
	    
	    @Test(dependsOnMethods="Search")
	    public void logocheck() {
	    	System.out.println("logocheck");
	    }
	    
	    @Test(dependsOnMethods="Search")
	    public void urlcheck() {
	    	System.out.println("urlcheck");
	    }
}
