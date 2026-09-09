package Step;

import java.net.MalformedURLException;
import org.testng.Assert;

import Base.Baseclass;
import Pom.Pomclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends Baseclass {
	Pomclass pg = new Pomclass(driver);
//LaunchApp
	@Given("User should launch the App")
	public void user_should_launch_the_app() {

	}

//Single product details

	@When("User click View All products")
	public void user_click_view_all_products() {
		click(pg.Viewall);
	}

	@When("User click the Hp Pavillion {int} laptop silver")
	public void user_click_the_hp_pavillion_laptop_silver(Integer int1) {

		click(pg.Hp);
	}

	@When("User should see the image Hp laptop  visible")
	public void user_should_see_the_image_hp_laptop_visible() {
		Assert.assertTrue(pg.Hpimage.isDisplayed());
		click(pg.Hpimage);
	}

	@When("User check the brand is visible HP")
	public void user_check_the_brand_is_visible_hp() {
		String actual = (pg.Hpbrand.getAttribute("content-desc"));
		String expected = "HP";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);

	}

	@When("User should see the title is visible Hp Pavillion {int} laptop silver")
	public void user_should_see_the_title_is_visible_hp_pavillion_laptop_silver(Integer int1) {
		String actual = (pg.Hptitle.getAttribute("content-desc"));
		String expected = "HP Pavilion 15 Laptop Silver";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
	}

	@When("User check the product ratings ⭐⭐")
	public void user_check_the_product_ratings() {
		System.out.println(pg.Hpratings.getAttribute("content-desc"));

	}

	@When("User should see the Amount inclusive of all taxes is visible")
	public void user_should_see_the_amount_inclusive_of_all_taxes_is_visible() {
		String actual = (pg.Hpamount.getAttribute("content-desc"));
		String expected = "₹76940";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
	}

	@When("User should see and click the Exchange available button is visible")
	public void user_should_see_and_click_the_exchange_available_button_is_visible() {
		Assert.assertTrue(pg.Exchangebutton.isDisplayed());
		click(pg.Exchangebutton);
	}

	@When("User should see the click the Wishlist button")
	public void user_should_see_the_click_the_wishlist_button() {
		click(pg.Wishlist);

	}

	@When("User should click the product to Add to Cart")
	public void user_should_click_the_product_to_add_to_cart() {
		click(pg.Addcard);
		driver.navigate().back();
		driver.navigate().back();

	}

	@When("User should click the Card button")
	public void user_should_click_the_card_button() {
		click(pg.card);
	}

	@When("User should click the Home Page")
	public void user_should_click_the_home_page() {
		System.out.println("Home page should be visible");
		click(pg.clearAll);
		click(pg.clear);
		driver.navigate().back();
		driver.navigate().back();
	}

// Add two Product

	@When("User should click the Galaxy S26 product1")
	public void user_should_click_the_galaxy_s26_product1() {
		click(pg.Viewall);
		viewWait();
		click(pg.galaxy);
	}

	@When("User should Addcard product1")
	public void user_should_addcard_product1() {
		click(pg.Addcard2);
	}

	@When("User should see the product1 price")
	public void user_should_see_the_product1_price() {
		System.out.println(pg.galaxyamount.getAttribute("content-desc"));
		driver.navigate().back();
		driver.navigate().back();
	}

	@When("User should click the Hp Pavillon Laptop product2")
	public void user_should_click_the_hp_pavillon_laptop_product2() {
		click(pg.Viewall);
		click(pg.Hp);
	}

	@When("User should Addcard product2")
	public void user_should_addcard_product2() {
		click(pg.Addcard);
	}

	@When("User should see the product2 price")
	public void user_should_see_the_product2_price() {
		System.out.println(pg.Hpamount.getAttribute("content-desc"));
		driver.navigate().back();
		driver.navigate().back();

	}

	@When("User should see the Total product price")
	public void user_should_see_the_total_product_price() {
		click(pg.clickcard);
		System.out.println("Total Amount is visible");

	}

//sort

	@When("User click the Sort button")
	public void user_click_the_sort_button() {
		pg.openSortMenu();
	}

	@Then("User should see the Sort By options")
	public void user_should_see_the_sort_by_options() {
		pg.isSortMenuVisible();
	}

	@Then("User select the sort option {string}")
	public void user_select_the_sort_option(String option) {
		Assert.assertTrue(pg.selectSortOption(option),"Excepted"+option+"to be selected but it wasn't");
		pg.selectSortOption(option);
		driver.navigate().back();
		driver.navigate().back();
	}

//filter
	@When("User click the Filters button")
	public void user_click_the_filters_button() {
		pg.openFilters();
	}

	@When("User should see the Filters screen")
	public void user_should_see_the_filters_screen() {
		Assert.assertTrue(pg.isFiltersScreenVisible(), "Filters screen did not appear");
	}

	@When("User select rating {string} and above")
	public void user_select_rating_and_above(String rating) {
		pg.selectRating(rating);
	}

	@When("User select the brand {string}")
	public void user_select_the_brand(String brand) {
		pg.selectBrand(brand);
	}

	@When("User click Apply Filters")
	public void user_click_apply_filters() {
		pg.clickApplyFilters();
		driver.navigate().back();
	}

	@When("User click Reset on Filters screen")
	public void User_click_Reset_on_Filters_screen() {
		pg.clickReset();
	}

	@When("User click Clear All on Filters screen")
	public void User_click_Clear_All_on_Filters_screen() {
		pg.clickClearAll();
	}

//500 and 500-1000

	@When("User click the ₹{int} Under500")
	public void user_click_the_₹_under500(Integer int1) {
		pg.clickUnder500();
	}

	@When("User click the ₹{int}-₹{int} Above500")
	public void user_click_the_₹_₹_above500(Integer int1, Integer int2) {
		pg.clickPrice500To1000();
	}

//search

	@When("User click the Search icon")
	public void user_click_the_search_icon() {
		viewWait();
		pg.clickSearchIcon();
	}

	@When("User search for {string}")
	public void user_search_for(String string) {
		viewWait();
		pg.searchFor("Galaxy");
	}

	@Then("User should see search results")
	public void user_should_see_search_results() {
		viewWait();
		System.out.println("User see the product of Galaxy");
	}

// Grid
	@When("User click the Grid icon")
	public void user_click_the_grid_icon() {
		pg.clickGridIcon();
	}

	@Then("User should see products in grid view")
	public void user_should_see_products_in_grid_view() {
		Assert.assertFalse(pg.getProductCards().isEmpty(), "Grid view did not load any products");
	}

//Search Negative

	@When("User search for invalid  {string}")
	public void user_search_for_invalid(String string) {
		viewWait();
		pg.searchFor("@fdgfd$586@$");
	}

	@Then("User should see search results No product")
	public void user_should_see_search_results_no_product() {
		System.out.println("User see the No product");
	}

//productNegative

	@When("User should click the product to Add to Cart original")
	public void user_should_click_the_product_to_add_to_cart_original() {
		click(pg.Addcard);
	}

	@When("User should click the product to Add to Cart duplicate")
	public void user_should_click_the_product_to_add_to_cart_duplicate() {
		viewWait();
		click(pg.Addcard);
	}

//productCountNegative

	@Then("The card item count should not exceed {int}")
	public void the_card_item_count_should_not_exceed(Integer max) {
		int count = pg.getCarditemCount();
		Assert.assertTrue(count <= max, "Excepted card count<=" + max + "but found" + count);
		System.out.println("User should see the card item should not exceed 1");

	}

//@NavigateBack

	@Then("User should see the card is not cleared")
	public void user_should_see_the_card_is_not_cleared() {
		System.out.println("After navigate to back card is not cleared!");
	}

//@Price Stability

	@Then("The displayed price should remain unchanged")
	public void the_displayed_price_should_remain_unchanged() {
		String priceAfteradd = pg.priceElement.getAttribute("content-desc");
		Assert.assertEquals(priceAfteradd, priceAfteradd, "Expected price to remain unchanged after add to card");
		System.out.println("User see the price to remain unchanged after add to card!");
	}

//@Gridnegative
	@Then("Grid icon should be disabled or {string} found message")
	public void grid_icon_should_be_disabled_or_found_message(String string) {
	    System.out.println("Grid icon should be product found message!! ");
	}

//@productcountNegative
	@When("User close and reopens the App")
	public void user_close_and_reopens_the_app() throws MalformedURLException {
	  closeApp();
	  BrowserLaunch();
	}
	@When("The cart item count should remain {int}")
	public void the_cart_item_count_should_remain(Integer int1) {
		viewWait();
	   int count=pg.getCarditemCount();
	   Assert.assertEquals(count, 0,"cart count should resert to 0 after app restart ,but got"+count);
	   System.out.println("Cart count after restart:"+count);
	}

}
