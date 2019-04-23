package test;

import org.testng.Assert;

import org.testng.annotations.Test;
import pages.HomePageobject;
import pages.Basepage;
public class HomePagetest {
	HomePageobject hp;
	Basepage bp;

	public HomePagetest() {
		hp = new HomePageobject();
		bp = new Basepage();
	}
	@Test
	public void verifytabs() {
		Assert.assertTrue(hp.elementFound(hp.getdresses()), "Failed: Dresses tab not displayed");
		
		Assert.assertTrue(hp.elementFound(hp.getwomen()), "Failed: women tab not displayed	");
		
		Assert.assertTrue(hp.elementFound(hp.gettshirts()), "Failed: tshirts tab not displayed	");
	}

}
