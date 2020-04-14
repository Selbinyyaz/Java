package com.syntax.class_Interface4;

public class WebDriverTest {

	public static void main(String[] args) {
		
		RemoteWebDriver[] a = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver() };
		for (RemoteWebDriver b : a) {
			b.open();
			b.close();
			b.GetScreenShot();
			b.navigate();
			System.out.println();
		}
	}

}
