package com.jaya.orangehrm.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jaya.orangehrm.base.Base_OrangeHrm;
import com.jaya.orangehrm.pages.HomePage_Orangehrm;
import com.jaya.orangehrm.pages.Login_Orangehrm;

public class OrangeHrmLoginTest extends Base_OrangeHrm {
Login_Orangehrm loginorangehrm;
HomePage_Orangehrm homepage;

public OrangeHrmLoginTest()
{
	super();
}
@BeforeMethod
public void setUp()
{
	initialization();
	loginorangehrm=new Login_Orangehrm();
}
@Test
public void loginTest()
{
	loginorangehrm.login("Admin", "admin123");
}
@Test
public void loginTest1()
{
	homepage=loginorangehrm.login(pro.getProperty("Username"), pro.getProperty("Password"));
}


}
