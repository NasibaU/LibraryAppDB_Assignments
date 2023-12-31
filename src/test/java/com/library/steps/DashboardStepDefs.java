package com.library.steps;

import com.library.pages.BorrowedBooksPage;
import com.library.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStepDefs {

    LoginPage loginPage = new LoginPage();
    BorrowedBooksPage borrowedBooksPage = new BorrowedBooksPage();

    @Given("the {string} on the home page")
    public void the_on_the_home_page(String user) {

        loginPage.login(user);
    }

    @When("the librarian gets borrowed books number")
    public void the_librarian_gets_borrowed_books_number() {

    }

    @Then("borrowed books number information must match with DB")
    public void borrowed_books_number_information_must_match_with_db() {

    }
}
