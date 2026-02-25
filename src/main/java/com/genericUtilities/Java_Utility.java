package com.genericUtilities;

import java.util.Date;

import org.testng.annotations.Test;

public class Java_Utility extends BaseTest {
	
	
	public static String getCurrentTime(){
		
		 return new Date().toString().replace(' ','_').replace(':','_');
		 
		
		
	}

	
}
