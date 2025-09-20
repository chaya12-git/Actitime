package com.actitime.testscript.divya;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.divya.TaskListPageProject;

public class ProjectModule extends BaseClass {
	@Test
	public void createProject() throws InterruptedException, EncryptedDocumentException, IOException {
		String projName = f.readExcelData("createProject", 1, 1);
		String projDescr = f.readExcelData("createProject", 1, 2);
		HomePage hp=new HomePage(driver);
		hp.setTasks();
		TaskListPageProject tlpp=new TaskListPageProject(driver);
		tlpp.getAddNewBtn().click();
		tlpp.getNewProjBtn().click();
		tlpp.getProjNameTbx().sendKeys(projName);
		tlpp.getProjDropdown().click();
		tlpp.getOurCompLink().click();
		tlpp.getProjDescrTbx().sendKeys(projDescr);
		tlpp.getCreateProjBtn().click();
		String msg = tlpp.getProjPopUpMsg().getText();
		Reporter.log(msg, true);
		Assert.assertEquals(msg, "Project '"+projName+"' has been created");
	}
	
	@Test
	public void deletePorject() throws InterruptedException, EncryptedDocumentException, IOException {
		String projName = f.readExcelData("createProject", 1, 1);
		HomePage hp=new HomePage(driver);
		hp.setTasks();
		TaskListPageProject tlpp=new TaskListPageProject(driver);
		tlpp.getDelProjNameTbx().sendKeys(projName);
		tlpp.getProjSettingsBtn().click();
		Thread.sleep(2000);
		tlpp.getProjActionsBtn().click();
		tlpp.getProjDelBtn().click();
		tlpp.getProjDelCnfmBtn().click();
		String msg = tlpp.getProjPopUpMsg().getText();
		Reporter.log(msg, true);
		Assert.assertEquals(msg, "Project '"+projName+"' has been deleted");
	}
}
