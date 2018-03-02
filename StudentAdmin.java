package net.serenity.bdd.steps;

import net.serenity.bdd.model.Category;
import net.serenity.bdd.model.Category1;
import net.serenity.bdd.ui.StudentAdminPage;
import net.serenity.bdd.ui.StudentHomePage;
import net.serenity.bdd.ui.UserLoginPage;
import net.thucydides.core.annotations.Step;



public class StudentAdmin {

    StudentAdminPage studentAdminPage;
    StudentHomePage studentHomePage;

    @Step
    public void clickStudentsLink(Category1 category) {
        studentHomePage.selectCategory1(category);
    }

    @Step
    public void shouldSeeAddNewStudentLink() {
        studentAdminPage.addNewStudentLink();
    }



}
