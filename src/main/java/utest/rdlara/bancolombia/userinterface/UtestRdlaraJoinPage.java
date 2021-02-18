package utest.rdlara.bancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRdlaraJoinPage {
    public static final Target BUTTON_JOIN = Target.the("Button to go to the registration form page")
            .located(By.linkText("Join Today"));
}
