package Test;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import Base.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\Feature",
		glue="Step",
		tags="@productcountNegative",
		plugin= {"pretty","html:target/html/report.html"},
		dryRun=false,
		monochrome=false
		
		)

public class Testrunner  extends Baseclass {
@BeforeClass
public static void start() throws MalformedURLException {
	BrowserLaunch();
}
@AfterClass
public static void end() {
closeApp();
}
}																																																																																																																																																				
