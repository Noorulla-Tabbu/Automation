package com.automation.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.generic.BaseClass;
import com.automation.generic.ListenerImplimentation;

@Listeners(ListenerImplimentation.class)
public class LoginActi extends BaseClass{
	
	@Test
	public void loginAccount() {
		Reporter.log("Noor",true);
	}
}
