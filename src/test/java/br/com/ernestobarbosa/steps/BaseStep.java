package br.com.ernestobarbosa.steps;

import br.com.ernestobarbosa.utils.Browser;
import cucumber.api.java8.En;

public class BaseStep implements En {
	public BaseStep() {
		Before(() -> {
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
			Browser.loadPage("https://material.angular.io/components/categories");
		});
		After(() -> {
//			Browser.close();
		});
	}

}
