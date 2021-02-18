package utest.rdlara.bancolombia.questions;

import utest.rdlara.bancolombia.userinterface.UtestRdlaraLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class UtestRdlaraCheck implements Question<Boolean> {
    private String message;

    public UtestRdlaraCheck(String message) {
        this.message = message;

    }

    public static UtestRdlaraCheck successfulRegistration(String message) {
        return new UtestRdlaraCheck(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcomeMessage = Text.of(UtestRdlaraLastStepPage.COMPLETE_SETUP).viewedBy(actor).asString();

        if (message.equals(welcomeMessage)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
