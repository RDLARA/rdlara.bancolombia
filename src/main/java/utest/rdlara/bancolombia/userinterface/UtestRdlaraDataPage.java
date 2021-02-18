package utest.rdlara.bancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRdlaraDataPage {
    public static final Target FIRST_NAME = Target.the("Form where the name is written")
            .located(By.xpath("//*[@id='firstName']"));
    public static final Target LAST_NAME = Target.the("Form where the last name will be written")
            .located(By.xpath("//*[@id='lastName']"));
    public static final Target EMAIL_ADDRESS = Target.the("Form where we write the email address")
            .located(By.xpath("//*[@id='email']"));
    public static final Target BIRTH_MONTH = Target.the("Form where we choose the month of birth")
            .located(By.xpath("//*[@id='birthMonth']"));
    public static final Target BIRHT_DAY = Target.the("Form where we will choose the month of birth")
            .located(By.xpath("//*[@id='birthDay']"));
    public static final Target BIRTH_YEAR = Target.the("Form where we will choose the year of birth")
            .located(By.xpath("//*[@id='birthYear']"));
    public static final Target LANGUAGE = Target.the("Form where we write the language")
            .located(By.xpath("//*[@type='search']"));
    public static final Target NEXT_LOCATION = Target.the("Button for next page")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
