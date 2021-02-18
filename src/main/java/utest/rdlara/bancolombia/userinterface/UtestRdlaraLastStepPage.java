package utest.rdlara.bancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRdlaraLastStepPage {
    public static final Target PASSWORD = Target.the("Form where we write the password")
            .located(By.xpath("//*[@id='password']"));

    public static final Target CONFIRM_PASSWORD = Target.the("Form to write the confirmation password")
            .located(By.xpath("//*[@id='confirmPassword']"));

    public static final Target CONFIRM_TERMS = Target.the("Check where we confirm conditions of use")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target ACCEPT_PRIVACY = Target.the("Check where do we accept the terms of privacy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_SETUP = Target.the("Complete confirmation of registration")
            .located(By.xpath("//*[@id='laddaBtn']//span"));

}
