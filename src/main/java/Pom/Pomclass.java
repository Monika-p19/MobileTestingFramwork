package Pom;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Base.Baseclass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Pomclass extends Baseclass {
	public AndroidDriver driver;

	public Pomclass(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

// User verify the Shopping
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"View All\"]")
	public WebElement Viewall;
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'HP Pavilion 15 Laptop Silver')]")
	public WebElement Hp;
	@AndroidFindBy(xpath = "//android.widget.ImageView")
	public WebElement Hpimage;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"HP\"]")
	public WebElement Hpbrand;

	public WebElement brand(String Brand) {
		return Hpbrand;
	}

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"HP Pavilion 15 Laptop Silver\"]")
	public WebElement Hptitle;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"0 ratings\"]")
	public WebElement Hpratings;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"₹76940\"]")
	public WebElement Hpamount;
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'17% OFF')]")
	public WebElement Hpoffer;
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'About this HP Pavilion 15 Laptop Silver')]")
	public WebElement Abouthp;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Exchange available for size/color\"]")
	public WebElement Exchange;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[4]")
	public WebElement Wishlist;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Add to Cart\"]")
	public WebElement Addcard;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[2]")
	public WebElement card;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[3]")
	public WebElement Exchangebutton;
//pricedetails
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"HP Pavilion 15 Laptop Silver\r\n" + "₹76940\r\n"
			+ "₹92328\r\n" + "1\"]")
	public WebElement Productdetails;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Price Details\"]")
	public WebElement Pricedetails;
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"HP Pavilion 15 Laptop Silver\r\n" + "₹76940\r\n"
			+ "₹92328\r\n" + "1\"]/android.view.View[1]")
	public WebElement delete;
//Add two product
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Galaxy S26')]")
	public WebElement galaxy;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Add to Cart\"]")
	public WebElement Addcard2;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"₹126\"]")
	public WebElement galaxyamount;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Clear All\"]")
	public WebElement clearAll;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Clear\"]")
	public WebElement clear;
	@AndroidFindBy(xpath = "(//android.widget.ScrollView/android.view.View[contains(@content-desc='₹77066'])]")
	public WebElement totalAmount;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[2]")
	public WebElement clickcard;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Cancel\"]")
	public WebElement cancel;
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Galaxy S26 ₹126')]")
	public WebElement price1;
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'HP Pavilion 15 Laptop Silver ₹76940')]")
	public WebElement price2;
	@AndroidFindBy(xpath = "(//android.widget.ScrollView/android.view.View[contains(@content-desc,\"₹77066\")])[2]")
	public WebElement Totalamount;
//Under500
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Under ₹500\")")
	public WebElement clickunder;
	@AndroidFindBy(xpath = "//android.view.View[start-with(@content-desc,'₹')]")
	public List<WebElement> underprice;
//Grid
	@AndroidFindBy(xpath = "//android.view[@content-desc='Products']/following-slibling::andriod.widget.Button[2]")
	public WebElement grid;
//sort
	@AndroidFindBy(xpath = "//*[@content-desc='Sort' or contains(@content-desc,'Sort')]")
	public WebElement sortButton;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Relevance'] | //*[@content-desc='Relevance']")
	public WebElement relevanceOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price: Low to High'] | //*[@content-desc='Price: Low to High']")
	public WebElement priceLowToHighOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price: High to Low'] | //*[@content-desc='Price: High to Low']")
	public WebElement priceHighToLowOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rating'] | //*[@content-desc='Rating']")
	public WebElement ratingOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Newest'] | //*[@content-desc='Newest']")
	public WebElement newestOption;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Discount'] | //*[@content-desc='Discount']")
	public WebElement discountOption;

	public void openSortMenu() {
		wait.until(ExpectedConditions.elementToBeClickable(sortButton)).click();
	}

	public boolean selectSortOption(String option) {
		WebElement target;

		switch (option.toLowerCase()) {
		case "relevance":
			target = relevanceOption;
			break;
		case "price: low to high":
			target = priceLowToHighOption;
			break;
		case "price: high to low":
			target = priceHighToLowOption;
			break;
		case "rating":
			target = ratingOption;
			break;
		case "newest":
			target = newestOption;
			break;
		case "discount":
			target = discountOption;
			break;
		default:
			throw new IllegalArgumentException("Unknown sort option: " + option);
		}

		wait.until(ExpectedConditions.elementToBeClickable(target)).click();
		return true;
	}

	public boolean isSortMenuVisible() {
		try {
			return wait.until(ExpectedConditions.visibilityOf(relevanceOption)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

//filter
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Filters\")")
	public WebElement filterEntryButton;
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Filters')]")
	public WebElement filtersHeader;
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Clear All')]")
	public WebElement clearAllButton;
	@AndroidFindBy(xpath = "//*[@content-desc='Price Range']")
	public WebElement priceRangeLabel;
// Rating filter chips
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'4') and contains(@content-desc,'above')]")
	public WebElement rating4AndAbove;
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'3') and contains(@content-desc,'above')]")
	public WebElement rating3AndAbove;
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'2') and contains(@content-desc,'above')]")
	public WebElement rating2AndAbove;
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'1') and contains(@content-desc,'above')]")
	public WebElement rating1AndAbove;
	@AndroidFindBy(xpath = "//*[@content-desc='Brands']")
	public WebElement brandsLabel;
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Reset')]")
	public WebElement resetButton;
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Apply Filters')]")
	public WebElement applyFiltersButton;

	public WebElement brandChip(String brandName) {
		return driver.findElement(AppiumBy.xpath("//*[@content-desc='" + brandName + "']"));
	}

	public void selectRating(String rating) {
		WebElement target;
		switch (rating) {
		case "4":
			target = rating4AndAbove;
			break;
		case "3":
			target = rating3AndAbove;
			break;
		case "2":
			target = rating2AndAbove;
			break;
		case "1":
			target = rating1AndAbove;
			break;
		default:
			throw new IllegalArgumentException("Unsupported rating: " + rating);
		}
		wait.until(ExpectedConditions.elementToBeClickable(target)).click();

	}

	public void selectBrand(String brandName) {
		WebElement chip = brandChip(brandName);
		wait.until(ExpectedConditions.elementToBeClickable(chip)).click();
	}

	public void clickApplyFilters() {
		wait.until(ExpectedConditions.elementToBeClickable(applyFiltersButton)).click();
	}

	public void clickReset() {
		wait.until(ExpectedConditions.elementToBeClickable(resetButton)).click();
	}

	public void clickClearAll() {
		wait.until(ExpectedConditions.elementToBeClickable(clearAllButton)).click();
	}

	public boolean isFiltersScreenVisible() {
		try {
			return wait.until(ExpectedConditions.visibilityOf(filtersHeader)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void openFilters() {
		wait.until(ExpectedConditions.elementToBeClickable(filtersHeader)).click();

	}

	// Under500 and 500-1000
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Under ₹500\")")
	public WebElement under500;
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"₹500-₹1000\")")
	public WebElement price500To1000;

	public void clickUnder500() {
		wait.until(ExpectedConditions.elementToBeClickable(under500)).click();
	}

	public void clickPrice500To1000() {
		wait.until(ExpectedConditions.elementToBeClickable(price500To1000)).click();
	}

	public boolean isUnder500Selected() {
		try {
			return under500.isSelected();
		} catch (Exception e) {
			return false;
		}
	}

// search
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]")
	public WebElement searchIcon;

	@AndroidFindBy(className = "android.widget.EditText")
	public WebElement searchInput;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Products']/following-sibling::android.widget.Button[2]")
	public WebElement gridIcon;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'₹')]")
	public List<WebElement> productCards;

	public void clickSearchIcon() {
		wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
	}

	public void searchFor(String keyword) {
		WebElement input = wait
				.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.className("android.widget.EditText")));
		input.sendKeys(keyword);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

	}

	public void clickGridIcon() {
		try {
			wait.until(
					ExpectedConditions.invisibilityOfElementLocated(AppiumBy.className("android.widget.ProgressBar")));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(gridIcon)).click();
	}

	public List<WebElement> getProductCards() {
		return driver.findElements(AppiumBy.xpath("//android.view.View[contains(@content-desc,'₹')]"));
	}

	public boolean isSearchResultsVisible() {
		try {
			return !getProductCards().isEmpty();
		} catch (Exception e) {
			return false;
		}
	}

	public int getCarditemCount() {
		List<WebElement> cards = driver
				.findElements(AppiumBy.xpath("//android.view.View[contains(@content-desc,'₹')]"));
		return cards.size();
	}

	@AndroidFindBy(xpath = "//*[contains(@content-desc,'₹')]")
	public WebElement priceElement;

}
