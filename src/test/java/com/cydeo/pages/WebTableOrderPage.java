package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage{

    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="product")
    public WebElement productTypeDropdown;

    @FindBy(name="quantity")
    public WebElement inputQuantity;

    @FindBy(name="name")
    public WebElement inputName;

    @FindBy(name="street")
    public WebElement inputStreet;

    @FindBy(name="city")
    public WebElement inputCity;

    @FindBy(name="state")
    public WebElement inputState;

    @FindBy(name="zip")
    public WebElement inputZip;

    @FindBy(name="card")
    public List<WebElement> cardType;

    @FindBy(name="cardNo")
    public WebElement inputCardNo;

    @FindBy(name="cardExp")
    public WebElement inputCardExp;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;





}
