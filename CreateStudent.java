package net.serenity.bdd.features.navigation;

import net.serenity.bdd.model.Category;
import net.serenity.bdd.model.Category1;
import net.serenity.bdd.steps.NavigatingUser;
import net.serenity.bdd.steps.StudentAdmin;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
@WithTag("StudentAdmin")
public class CreateStudent {

        @Steps
        NavigatingUser user;
       // StudentAdmin user;

        @Managed
        WebDriver browser;

        @Test
        public void CreateStudent() {
            //Given
            user.isOnHomePage();
            user.whenClickLogInLink(Category.Log);
            user.entersLoginDetails();
            user.shouldBeLoggedIn();

            // WHEN
            user.clickStudentsLink(Category1.Students);

            //Then
            //user.shouldSeeAddNewStudentLink();
        }
}
