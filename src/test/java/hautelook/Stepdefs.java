package hautelook;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Stepdefs {
    private Cart cart = new Cart();

    @Given("^I have an empty cart$")
    public void iHaveAnEmptyCart() throws Throwable {
        this.cart = new Cart();
    }

    @Then("^My subtotal should be \"([^\"]*)\" dollars$")
    public void mySubtotalShouldBeDollars(int subtotal) throws Throwable {
        Assert.assertTrue("Total is " + this .cart.subtotal(), this.cart.subtotal() == subtotal);
    }

    @When("^I add a \"([^\"]*)\" dollar item named \"([^\"]*)\"$")
    public void iAddADollarItemNamed(int itemCost, String productName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a cart with a \"([^\"]*)\" dollar item named \"([^\"]*)\"$")
    public void iHaveACartWithADollarItemNamed(int itemCost, String productName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^My quantity of products named \"([^\"]*)\" should be \"([^\"]*)\"$")
    public void myQuantityOfProductsNamedShouldBe(String productName, int itemCount) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I apply a \"([^\"]*)\" percent coupon code$")
    public void iApplyAPercentCouponCode(int percentOff) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I add a \"([^\"]*)\" dollar \"([^\"]*)\" lb item named \"([^\"]*)\"$")
    public void iAddADollarItemWithWeight(int itemCost, int itemWeight, String productName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^My total should be \"([^\"]*)\" dollars$")
    public void myTotalShouldBeDollars(int total) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
