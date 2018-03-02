package net.serenity.bdd.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;

public class UserLoginPage extends PageObject {

    //private FindBy

    public void loginDetails() {
        // ContentEmail.sendKeys("user1@mail.com");
        find(By.name("ctl00$MainContent$Email")).sendKeys("user1@mail.com");
        find(By.name("ctl00$MainContent$Password")).sendKeys("P@ssw0rd");
        find(By.name("ctl00$MainContent$ctl05")).click();
    }
}
