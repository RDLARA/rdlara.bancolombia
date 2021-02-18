package utest.rdlara.bancolombia.tasks;

import utest.rdlara.bancolombia.userinterface.UtestRdlaratPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class UtestRdlaraOpen implements Task {
    private UtestRdlaratPage utestPage;

    public static UtestRdlaraOpen utestPage() {
        return Tasks.instrumented(UtestRdlaraOpen.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
