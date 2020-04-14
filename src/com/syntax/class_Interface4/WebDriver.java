package com.syntax.class_Interface4;

public interface WebDriver {
	
	void open();

	void close();

	String getTitle();// interfaces can have static and default methods

}

interface TakeScreenShot {
	
	void GetScreenShot();
}
interface RemoteWebDriver extends WebDriver,TakeScreenShot {//interface extends interface

	void navigate();//method
}
class ChromeDriver implements RemoteWebDriver {//class implements interface

	@Override
	public void open() {
		
		System.out.println("We can open browser in "+this.getTitle());
		
	}

	@Override
	public void close() {
		System.out.println("We can close browser in "+this.getTitle());
		
	}

	@Override
	public String getTitle() {
		String getName="Chrome";
		return getName;
	}

	@Override
	public void GetScreenShot() {
		System.out.println("We can get screen shot in "+this.getTitle());
		
	}

	@Override
	public void navigate() {
		System.out.println("We can navigate in "+this.getTitle());
		
		
	}

	
	
}
class FirefoxDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("We can open browser in "+this.getTitle());
		
	}

	@Override
	public void close() {
		System.out.println("We can close browser in "+this.getTitle());
		
	}

	@Override
	public String getTitle() {
		String getName="FireFox";
		return getName;
	
	}

	@Override
	public void GetScreenShot() {
		System.out.println("We can get screen shot in "+this.getTitle());
		
	}

	@Override
	public void navigate() {
		System.out.println("We can navigate in "+this.getTitle());
		
		
	}
	
}
class SafariDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("We can open browser in "+this.getTitle());
		
		
	}

	@Override
	public void close() {
		System.out.println("We can close browser in "+this.getTitle());
		
		
	}

	@Override
	public String getTitle() {
		String getName="FireFox";
		return getName;
	}

	@Override
	public void GetScreenShot() {
		System.out.println("We can get screen shot in "+this.getTitle());
		
	}

	@Override
	public void navigate() {
		System.out.println("We can navigate in "+this.getTitle());
		
	}
	
}

