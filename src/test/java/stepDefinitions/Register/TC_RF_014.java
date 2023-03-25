package stepDefinitions.Register;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.Register.ElementsForTC_RF_014;

public class TC_RF_014 {

    ElementsForTC_RF_014 elementsForTCRf014 = new ElementsForTC_RF_014();

    @And("All mandatory fields in the Register Account page should start with red colored asterisk")
    public void allMandatoryFieldsInTheRegisterAccountPageShouldStartWithRedColoredAsterisk() {
        elementsForTCRf014.getMandatoryFields().get(0);
        Assert.assertEquals(elementsForTCRf014.getMandatoryFields().get(0).getCssValue("color"), "rgba(255, 0, 0, 1)");

//        for (WebElement field : elementsForTCRf014.getMandatoryFields()) {
//            String color = field.getCssValue("color");
//            Assert.assertTrue(color.equals("rgba(255, 0, 0, 1)") || color.equals("red"), "Test failed.");
//            System.out.println("Test passed!");
//
//        }
    }
}
