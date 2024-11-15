package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Pricing {
	public String runNodeScript(String scriptPath) {
		try {
			def output = ConsoleCommandBuilder.create("node ${scriptPath}").execSync();
			return output != null ? output.join("\n") : null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	TestObject accountSubscription = findTestObject('Object Repository/Pricing/p_Subscription')
	TestObject hoverOver = findTestObject('Object Repository/Dashboard/image_hover')
	TestObject changePlan = findTestObject('Object Repository/Pricing/Click_button_Downgrade')
	TestObject settingsButton = findTestObject('Object Repository/Pricing/dashboard_Account settings')
	TestObject authenticator = findTestObject('Object Repository/Beneficiaries/authenticator')
	TestObject ConfirmChangePlan = findTestObject('Object Repository/Pricing/confirm_plan_change')
	TestObject continueButton = findTestObject('Object Repository/Beneficiaries/continue')
	TestObject changeConfirmation = findTestObject('Object Repository/Pricing/div_Success')

	public void toSettingsButton() {
		WebUI.waitForElementVisible(hoverOver, 45)
		WebUI.mouseOver(hoverOver)
		WebUI.click(settingsButton)
	}
	public void toSubscription() {
		WebUI.waitForElementVisible(accountSubscription, 45)
		WebUI.click(accountSubscription)
	}
	public void toPlanChange() {
		WebUI.waitForElementVisible(changePlan, 45)
		WebUI.click(changePlan)
	}
	public void toAuthenticator() {
		String scriptPath = "javascript/token.js"
		String otp = runNodeScript(scriptPath)
		WebUI.waitForElementVisible(authenticator, 45)
		WebUI.sendKeys(authenticator, otp)
	}
	public void toConfirmChangePlan() {
		WebUI.waitForElementVisible(hoverOver, 45)
		WebUI.mouseOver(hoverOver)
		WebUI.click(ConfirmChangePlan)
	}
	public void toSuccessMessage() {
		WebUI.verifyElementPresent(changeConfirmation, 20)
	}
}
