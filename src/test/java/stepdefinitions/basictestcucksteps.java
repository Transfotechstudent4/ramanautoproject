package stepdefinitions;

import static org.junit.Assert.assertTrue;

import AllHtmlPages.Bhomepage;
import AllHtmlPages.Cregistrationpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class basictestcucksteps 
{
	Bhomepage mypage;
	Cregistrationpage myregpage;
	
@Given("^I Go to MCT Website$")
public void i_Go_to_MCT_Website() throws Throwable {
	mypage = new Bhomepage(); 
	mypage.OpenBrowserAndNavigateToApplication(); 
}

@Given("^I Start the Signup Process$")
public void i_Start_the_Signup_Process() throws Throwable {
	mypage.StartSignUpProcess(); 
}

@When("^I Enter All Registration Information$")
public void i_Enter_All_Registration_Information() throws Throwable {
	myregpage = new Cregistrationpage();
	myregpage.CompleteRegistation(); 
}

@Then("^I see My First and last Name$")
public void i_see_My_First_and_last_Name() throws Throwable {
    boolean returnresult = myregpage.validateusername();
	assertTrue("Failed to Match", returnresult);
}

@Given("^I Start the Login Process$")
public void i_Start_the_Login_Process() throws Throwable {
    
}

@Given("^I Complete Login as a SampleUser$")
public void i_Complete_Login_as_a_SampleUser() throws Throwable {
    
}

@Then("^I see MY First and last Name$")
public void i_see_MY_First_and_last_Name() throws Throwable {
    
}


}
