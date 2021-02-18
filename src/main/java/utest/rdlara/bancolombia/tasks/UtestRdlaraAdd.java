package utest.rdlara.bancolombia.tasks;


import utest.rdlara.bancolombia.model.UtestUserData;
import utest.rdlara.bancolombia.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;


public class UtestRdlaraAdd implements Task {
    private UtestUserData data;

    public UtestRdlaraAdd(UtestUserData data){
        this.data = data;
    }

    public static UtestRdlaraAdd dataToRegister(UtestUserData data) {
        return Tasks.instrumented(UtestRdlaraAdd.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRdlaraJoinPage.BUTTON_JOIN),
                Enter.theValue(data.getFirstName()).into(UtestRdlaraDataPage.FIRST_NAME),
                Enter.theValue(data.getLastName()).into(UtestRdlaraDataPage.LAST_NAME),
                Enter.theValue(data.getEmail()).into(UtestRdlaraDataPage.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(data.getBirthMonth()).from(UtestRdlaraDataPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.getBirthDay()).from(UtestRdlaraDataPage.BIRHT_DAY),
                SelectFromOptions.byVisibleText(data.getYear()).from(UtestRdlaraDataPage.BIRTH_YEAR),
                Type.theValue(data.getLanguage()).into(UtestRdlaraDataPage.LANGUAGE).thenHit(Keys.ENTER),
                Click.on(UtestRdlaraDataPage.NEXT_LOCATION),
                Enter.theValue(data.getCity()).into(UtestRdlaraLocalityDataPage.CITY),
                Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(UtestRdlaraLocalityDataPage.CITY),
                Enter.theValue(data.getZip()).into(UtestRdlaraLocalityDataPage.POSTAL_CODE),
                Click.on(UtestRdlaraLocalityDataPage.BUTTON_BLUE_1),
                Click.on(UtestNewStepPage.LAST_STEP),
                Enter.theValue(data.getPassword()).into(UtestRdlaraLastStepPage.PASSWORD),
                Enter.theValue(data.getPassword()).into(UtestRdlaraLastStepPage.CONFIRM_PASSWORD),
                Click.on(UtestRdlaraLastStepPage.CONFIRM_TERMS),
                Click.on(UtestRdlaraLastStepPage.ACCEPT_PRIVACY)
        );

    }
}
