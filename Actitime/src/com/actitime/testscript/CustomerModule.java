package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
public void createCustomer() throws EncryptedDocumentException, IOException {
		String customerName = f.readExcelData("createCustomer", 1, 1);
		String custdescription = f.readExcelData("createCustomer", 1, 2);
		HomePage h=new HomePage(driver);
		h.setTasks();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		t.getCustNameTbx().sendKeys(customerName);
		t.getCustDescTbx().sendKeys(custdescription);
		t.getDropdown().click();
		t.getOurCompLink().click();
		t.getCreateCustBtn().click();
		String msg = t.getPopupMessage().getText();
		Reporter.log(msg,true);
		Assert.assertEquals(msg, "Customer HDFC-01 has been created");
	}
}
