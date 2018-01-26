package controller;

import java.net.MalformedURLException;

public class BasePage {

	public BasePage() {
		try {
			AppiumController.instance.start();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}
	
	
  }


