package br.com.ernestobarbosa.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Element extends Browser {
	public static WebElement element(String selector, SEARCH_TYPE searchType) {
		switch (searchType) {
		case ID:
			return driver.findElement(By.id(selector));
		case CLASS:
			return driver.findElement(By.className(selector));
		case CSS:
			return driver.findElement(By.cssSelector(selector));
		case XPATH:
			return driver.findElement(By.xpath(selector));
		case NAME:
			return driver.findElement(By.name(selector));
		default:
			return null;
		}
	}

	public static List<WebElement> elements(String selector, SEARCH_TYPE searchType) {
		switch (searchType) {
		case ID:
			return driver.findElements(By.id(selector));
		case CLASS:
			return driver.findElements(By.className(selector));
		case CSS:
			return driver.findElements(By.cssSelector(selector));
		case XPATH:
			return driver.findElements(By.xpath(selector));
		case NAME:
			return driver.findElements(By.name(selector));
		default:
			return null;
		}
	}

	public static boolean exist(String selector, SEARCH_TYPE searchType) {
		switch (searchType) {
		case ID:
			return driver.findElement(By.id(selector)).isDisplayed();
		case CLASS:
			return driver.findElement(By.className(selector)).isDisplayed();
		case CSS:
			return driver.findElement(By.cssSelector(selector)).isDisplayed();
		case XPATH:
			return driver.findElement(By.xpath(selector)).isDisplayed();
		case NAME:
			return driver.findElement(By.name(selector)).isDisplayed();
		default:
			return false;
		}
	}

	public static void waitElement(String selector, SEARCH_TYPE searchType) {
		switch (searchType) {
		case ID:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(selector)));
			break;
		case CLASS:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(selector)));
			break;
		case CSS:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(selector)));
			break;
		case XPATH:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selector)));
			break;
		case NAME:
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(selector)));
			break;
		}
	}
}
