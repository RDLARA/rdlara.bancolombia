package utest.rdlara.bancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestNewStepPage {
    public static final Target LAST_STEP = Target.the("Button for the last step")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
}
