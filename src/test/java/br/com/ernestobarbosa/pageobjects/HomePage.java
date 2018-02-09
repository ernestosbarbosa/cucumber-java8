package br.com.ernestobarbosa.pageobjects;

public class HomePage extends BasePage {
	
	public static void clickMenu(String menuItem) {
		element("[aria-label='" + menuItem + "']", SEARCH_TYPE.CSS).click();
	}

	public static void clickSubMenu(String menuItem) {
		element("[href='/components/" + menuItem + "']", SEARCH_TYPE.CSS).click();
	}
}
