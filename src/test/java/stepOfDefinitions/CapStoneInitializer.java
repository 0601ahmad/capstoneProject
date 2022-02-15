package stepOfDefinitions;

import CoreCapStone.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CapStoneInitializer extends BaseClass {
	
	
	@Before
	public void BeforeOfHooks(Scenario scenario ) {
		logger.info("scenario"+scenario.getName()+"started");
		whichbrowser();
		openUrl();
	}
	@After
	public void AfterOfHooks(Scenario scenario) {
		closeBrowser();
		logger.info("scenario"+ scenario.getName()+""+scenario.getStatus());
	}

}
