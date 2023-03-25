package stepDefinitions.stepDefinitions;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.RegisterPageElements;

public class TC_RF_20 {

    RegisterPageElements elements=new RegisterPageElements();
    @And("Validate Privacy Policy Button Is Selected")
    public void validatePrivacyPolicyButtonIsSelected() {
        elements.scrollToElement(elements.getRegisterCheckBox());

        Assert.assertFalse(elements.getRegisterCheckBox().isSelected(),"Test Failed");
    }
}
