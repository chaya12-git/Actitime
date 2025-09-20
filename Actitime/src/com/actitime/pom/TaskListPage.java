package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath = "//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath = "//div[text()='+ New Customer']")
private WebElement newCustBtn;
@FindBy(id="customerLightBox_nameField")
private WebElement custNameTbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement custDescTbx;
@FindBy(id = "customerLightBox_customerSelectorPlaceholder")
private WebElement dropdown;
@FindBy(linkText = "Our Company")
private WebElement ourCompLink;
@FindBy(id = "customerLightBox_commitBtn")
private WebElement createCustBtn;
@FindBy(className = "innerHtml")
private WebElement popupMessage;
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustBtn() {
	return newCustBtn;
}
public WebElement getCustNameTbx() {
	return custNameTbx;
}
public WebElement getCustDescTbx() {
	return custDescTbx;
}
public WebElement getDropdown() {
	return dropdown;
}
public WebElement getOurCompLink() {
	return ourCompLink;
}
public WebElement getCreateCustBtn() {
	return createCustBtn;
}
public WebElement getPopupMessage() {
	return popupMessage;
}

}
