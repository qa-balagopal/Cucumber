package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.pages.LoginPage;
import com.pages.MyAccountPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MyAccountPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private MyAccountPage myaccountsPage;


@Given("user has already logged in to application")
public void user_has_already_logged_in_to_application(DataTable credTable) {
	 List<Map<String,String>> credList =credTable.asMaps();
	 String userName =credList.get(0).get("username");
	 String password =credList.get(0).get("password");
	 
	 DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	 myaccountsPage =loginPage.doLogin(userName, password);

}

@Given("user is on Accounts page")
public void user_is_on_accounts_page() {
	 String title =  myaccountsPage.getAccountPageTitle();
	 System.out.println("Accounts Page title is:"+title);
}

@Given("user is on Order History page")
public void user_is_on_order_history_page() {
	myaccountsPage.selectOrderHistory();
}

@Given("user is on Address page")
public void user_is_on_address_page() {
    myaccountsPage.selectAddress();   
}

}
