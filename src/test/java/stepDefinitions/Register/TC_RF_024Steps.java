package stepDefinitions.Register;

import io.cucumber.java.en.Given;
import pages.Register.RegisterPageElement_Sevgi;
import pages.Register.RegisterPageElements;

public class TC_RF_024Steps {
    RegisterPageElements rp = new RegisterPageElements();
    RegisterPageElement_Sevgi rps = new RegisterPageElement_Sevgi();


    @Given("Fill out all the fields without password confirm")
    public void fill_out_all_the_fields_without_password_confirm() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        rps.sendKeysMethod(rps.getRegisterFirstNameInput(),"Sam");
        rps.sendKeysMethod(rps.getRegisterLastNameInput(),"Jhonny");
        rps.sendKeysMethod(rps.getRegisterEmailInput(),"Sam123@com");
        rps.sendKeysMethod(rps.getTelephoneBtn(),"1234566");
        rps.sendKeysMethod(rps.getRegisterPasswordInput(),"123qwe");


    }
}

