
package com.alvin.pageobject;
/**
* @Title: IndexPage
* @Description: 
* @author: alvin
* @date 2022年7月27日 下午5:55:01
*/

import org.openqa.selenium.By;

import com.alvin.base.BasePage;

public class IndexPage  extends BasePage {
	
	private By myQuitBy = By.xpath("//a[text()='退出']");
	 
	public void buttonQuit() {
//		WaitElementClickable(myQuitBy).click();
		click(myQuitBy);
	}
	
	public boolean buttonQuitElementIsDisplayed() {
		return WaitElementVisible(myQuitBy).isDisplayed();
	}
}
