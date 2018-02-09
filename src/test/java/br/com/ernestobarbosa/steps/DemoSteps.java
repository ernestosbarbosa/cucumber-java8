package br.com.ernestobarbosa.steps;

import static org.junit.Assert.assertTrue;

import br.com.ernestobarbosa.pageobjects.DialogPage;
import br.com.ernestobarbosa.pageobjects.HomePage;

public class DemoSteps extends BaseStep {
	public DemoSteps() {
		Given("^I went to menu (.*), submenu (.*)$", (String menu, String subMenu) -> {
			HomePage.clickMenu(menu);
			HomePage.clickSubMenu(subMenu);
		});
		When("^I fill the input field with (.*)$", (String text) -> {
			DialogPage.fillInput(text);
		});
		And("^select the Pick one option$", () -> {
			DialogPage.clickPickOne();
		});
		Then("^should display a modal with the message (.*)$", (String text) -> {
			assertTrue(DialogPage.getDialogTitle().contains(text));
		});
	}

}
