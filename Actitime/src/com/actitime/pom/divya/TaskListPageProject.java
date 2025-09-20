package com.actitime.pom.divya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPageProject {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy (xpath = "//div[text()='+ New Project']")
	private WebElement newProjBtn;
	
	@FindBy (id = "projectPopup_projectNameField")
	private WebElement projNameTbx;
	
	@FindBy(id = "projectPopup_customerSelectorPlaceholder")
	private WebElement projDropdown;
	
	@FindBy(linkText = "Our Company")
	private WebElement ourCompLink;
	
	@FindBy(id = "projectPopup_projectDescriptionField")
	private WebElement projDescrTbx;
	
	@FindBy(id = "projectPopup_commitBtn")
	private WebElement createProjBtn;
	
	@FindBy(className = "innerHtml")
	private WebElement projPopUpMsg;
	
	//Below elements are to Delete Project 
	@FindBy(xpath = "//input[@placeholder='Start typing name ...']")
	private WebElement delProjNameTbx;
	
	@FindBy(xpath = "//span[@class='highlightToken']/../../div[@class='editButton available']")
	private WebElement projSettingsBtn;
	
	@FindBy(xpath = "//div[contains(@class, 'edit_project')]//div[text()='ACTIONS']")
	private WebElement projActionsBtn;
	
	@FindBy(xpath = "//div[contains(@class, 'edit_project')]//div[text()='Delete']")
	private WebElement projDelBtn;	
	
	@FindBy(id = "projectPanel_deleteConfirm_submitBtn")
	private WebElement projDelCnfmBtn;
	
	public TaskListPageProject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewProjBtn() {
		return newProjBtn;
	}

	public WebElement getProjNameTbx() {
		return projNameTbx;
	}

	public WebElement getProjDropdown() {
		return projDropdown;
	}

	public WebElement getOurCompLink() {
		return ourCompLink;
	}

	public WebElement getProjDescrTbx() {
		return projDescrTbx;
	}

	public WebElement getCreateProjBtn() {
		return createProjBtn;
	}

	public WebElement getProjPopUpMsg() {
		return projPopUpMsg;
	}

	public WebElement getDelProjNameTbx() {
		return delProjNameTbx;
	}

	public WebElement getProjSettingsBtn() {
		return projSettingsBtn;
	}

	public WebElement getProjActionsBtn() {
		return projActionsBtn;
	}

	public WebElement getProjDelBtn() {
		return projDelBtn;
	}

	public WebElement getProjDelCnfmBtn() {
		return projDelCnfmBtn;
	}
}
