package br.com.ernestobarbosa.pageobjects;

public class DialogPage extends BasePage {
	
	public static String input = "[placeholder=\"What's your name?\"]";
	public static String pickOne = "[class='mat-raised-button']";
	public static String dialogTitle = "h1.mat-dialog-title";
	
	public static void fillInput(String text) {
		waitElement(input, SEARCH_TYPE.CSS);
		element(input, SEARCH_TYPE.CSS).sendKeys(text);
	}

	public static void clickPickOne() {
		waitElement(pickOne, SEARCH_TYPE.CSS);
		element(pickOne, SEARCH_TYPE.CSS).click();
	}
	
	public static String getDialogTitle() {
		return element(dialogTitle, SEARCH_TYPE.CSS).getText();
	}
	
}
