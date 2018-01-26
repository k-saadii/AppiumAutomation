package controller;

import java.net.MalformedURLException;



public class BaseTest {
	public BaseTest() {

		try {
			AppiumController.instance.start();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
}

}
