package com.jaya.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jaya.orangehrm.base.Base_OrangeHrm;

public class Login_Orangehrm extends Base_OrangeHrm {
	
@FindBy(name="username")
WebElement username;

@FindBy(name="password")
WebElement pass;

@FindBy(xpath="//button[@type=\"submit\"]")
WebElement loginbtn;

@FindBy(xpath="//span[@class=\"oxd-topbar-header-breadcrumb\"]")
WebElement dashboard;

public Login_Orangehrm()
{
	PageFactory.initElements(driver, this);
}

/*
 * public void login(String un, String pas) { username.sendKeys(un);
 * pass.sendKeys(pas); loginbtn.click(); }
 */

public HomePage_Orangehrm login(String un, String pwd)
{
	username.sendKeys(un);
	pass.sendKeys(pwd);
	loginbtn.click();
	return new HomePage_Orangehrm();
}

}

