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

public class Dashboard {

	TestObject clickBeneficiary = findTestObject('Object Repository/Dashboard/beneficiaries_limit')
	TestObject hoverOver = findTestObject('Object Repository/Dashboard/image_hover')
	TestObject clickPaymentLinks = findTestObject('Object Repository/Dashboard/payment_links_button')
	TestObject clickAccountSettings = findTestObject('Object Repository/Dashboard/account_settings_button')


	public void toBeneficiaries() {
		WebUI.waitForElementVisible(hoverOver, 45)
		WebUI.mouseOver(hoverOver)
		WebUI.click(clickBeneficiary)
	}

	public void toPaymentLinks() {
		WebUI.waitForElementVisible(hoverOver, 45)
		WebUI.mouseOver(hoverOver)
		WebUI.click(clickPaymentLinks)
	}
	public void toAccountSettings() {
		WebUI.waitForElementVisible(hoverOver, 45)
		WebUI.mouseOver(hoverOver)
		WebUI.click(clickAccountSettings)
	}
}
