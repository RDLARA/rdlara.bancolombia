package utest.rdlara.bancolombia.stepdefinitions;

import utest.rdlara.bancolombia.model.UtestUserData;
import utest.rdlara.bancolombia.questions.UtestRdlaraCheck;
import utest.rdlara.bancolombia.tasks.UtestRdlaraAdd;
import utest.rdlara.bancolombia.tasks.UtestRdlaraOpen;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Ronald enters the uTest page for and$")
    public void than_Ronald_enters_the_uTest_page_for_and() {
        OnStage.theActorCalled("Ronald").wasAbleTo(UtestRdlaraOpen.utestPage());
    }


    @When("^Fill out the following information in the forms$")
    public void fill_out_the_following_information_in_the_forms(List<UtestUserData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(UtestRdlaraAdd.dataToRegister(data.get(0)));

    }

    @Then("^Verify that registration automation is successful with the (.*) message$")
    public void verify_that_registration_automation_is_successful_with_the_Complete_Setup_message(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(UtestRdlaraCheck.successfulRegistration(message)));
    }
}
