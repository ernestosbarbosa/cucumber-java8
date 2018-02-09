package br.com.ernestobarbosa.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public enum SEARCH_TYPE {
		ID, CLASS, CSS, XPATH, NAME
	};

	public synchronized static WebDriver getCurrentDriver() {
		if (driver == null) {
			try {
				driver = new ChromeDriver();
				wait = new WebDriverWait(driver, 20);
				maximizeBrowser();
				setPageLoadTimeout();
			} finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			}
		}
		return driver;
	}

	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public static void setPageLoadTimeout() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public static void loadPage(String url) {
		getCurrentDriver().get(url);
	}

	public static String getUrl() {
		return getCurrentDriver().getCurrentUrl();
	}

	private static class BrowserCleanup implements Runnable {
		@Override
		public void run() {
			close();
		}
	}

	public static void close() {
		try {
			getCurrentDriver().quit();
			driver = null;
		} catch (UnreachableBrowserException e) {
		}
	}

}