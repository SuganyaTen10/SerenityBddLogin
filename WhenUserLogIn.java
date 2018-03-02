package net.serenity.bdd.features.navigation;

import net.serenity.bdd.model.Category;
import net.serenity.bdd.model.Category1;
import net.serenity.bdd.steps.NavigatingUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


//@UseTestDataFrom("testdata/login.csv")
//@RunWith(SerenityParameterizedRunner.class)
@RunWith(SerenityRunner.class)
@WithTag("StudentAdmin")
public class WhenUserLogIn {

    @Steps
    NavigatingUser user;

    @Managed
    WebDriver browser;

    @Title("User finds LogIn link")
    @Test
    public void shouldBeAbleToNavigateToLogIn() {
        //Given
        user.isOnHomePage();

        // WHEN
        user.whenClickLogInLink(Category.Log);

        //Then
        user.shouldSeePageTitleContaining("Log in - Contoso University");
    }

    @Test
        public void userShouldBeAbleToLogIn() {
        //Given
        user.isOnHomePage();
        user.whenClickLogInLink(Category.Log);

        // WHEN
        user.entersLoginDetails();

        //Then
        user.shouldBeLoggedIn();
    }


}
