package net.serenity.bdd.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class StudentAdminPage extends PageObject{

    public void addNewStudentLink() {
        find(By.partialLinkText("Add")).isCurrentlyVisible();
    }
}
