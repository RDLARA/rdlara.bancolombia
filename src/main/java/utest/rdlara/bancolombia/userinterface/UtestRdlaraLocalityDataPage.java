package utest.rdlara.bancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRdlaraLocalityDataPage {
    public static final Target CITY = Target.the("Form where the name of the city is written")
            .located(By.xpath("//*[@id='city']"));

    public static final Target POSTAL_CODE = Target.the("Form where we write the postal code")
            .located(By.xpath("//*[@id='zip']"));

    public static final Target BUTTON_BLUE_1 = Target.the("Button to choose the next section")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));
}
