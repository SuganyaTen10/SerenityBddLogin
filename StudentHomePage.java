package net.serenity.bdd.ui;

import net.serenity.bdd.model.Category;
import net.serenity.bdd.model.Category1;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost/WebIndividual")
public class StudentHomePage extends PageObject{

    public void selectCategory(Category category) {
            find(By.partialLinkText(category.name())).click();
    }

    public void selectCategory1(Category1 category) {
        find(By.linkText(category.name())).click();
    }


    public boolean logoffLink() {
        isElementVisible(By.linkText("Log off"));
        return true;
    }


}
