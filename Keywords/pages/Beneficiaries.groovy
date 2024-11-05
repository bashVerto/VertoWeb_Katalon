package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.ConsoleCommandBuilder
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

public class Beneficiaries {

	public String runNodeScript(String scriptPath) {
		try {
			def output = ConsoleCommandBuilder.create("node ${scriptPath}").execSync();
			return output != null ? output.join("\n") : null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	TestObject myAccount = findTestObject('Object Repository/Beneficiaries/my_accounts')
	TestObject inputAccountNumber = findTestObject('Object Repository/Beneficiaries/account_number')
	TestObject addBankAccountButton = findTestObject('Object Repository/Beneficiaries/add_bank_account')
	TestObject authenticator = findTestObject('Object Repository/Beneficiaries/authenticator')
	TestObject bankName = findTestObject('Object Repository/Beneficiaries/bank_name')
	TestObject cancelButton = findTestObject('Object Repository/Beneficiaries/cancel_button')
	TestObject continueButton = findTestObject('Object Repository/Beneficiaries/continue')
	TestObject currency = findTestObject('Object Repository/Beneficiaries/currency')
	TestObject export = findTestObject('Object Repository/Beneficiaries/export')
	TestObject individual = findTestObject('Object Repository/Beneficiaries/individual_beneficiary')
	TestObject firstName = findTestObject('Object Repository/Beneficiaries/first_name')
	TestObject lastName = findTestObject('Object Repository/Beneficiaries/last_name')
	TestObject recipients = findTestObject('Object Repository/Beneficiaries/recipients')
	TestObject refresh = findTestObject('Object Repository/Beneficiaries/refresh')
	TestObject search = findTestObject('Object Repository/Beneficiaries/search')
	TestObject selectAccess = findTestObject('Object Repository/Beneficiaries/select_access')
	TestObject selectNGN = findTestObject('Object Repository/Beneficiaries/select_NGN')
	TestObject addAccount = findTestObject('Object Repository/Beneficiaries/add_account')
	TestObject selectedBeneficiary = findTestObject('Object Repository/Beneficiaries/selected_beneficiary')
	TestObject deleteIcon = findTestObject('Object Repository/Beneficiaries/delete_icon')
	TestObject confirmButton = findTestObject('Object Repository/Beneficiaries/confirm_button')


	public void toAccount() {
		WebUI.waitForElementVisible(myAccount, 45)
		WebUI.click(myAccount)
	}

	public void toSelectedBeneficiary() {
		WebUI.waitForElementVisible(selectedBeneficiary, 45)
		WebUI.click(selectedBeneficiary)
	}

	public void toDelete() {
		WebUI.waitForElementVisible(deleteIcon, 45)
		WebUI.click(deleteIcon)
	}

	public void toConfirm() {
		WebUI.waitForElementVisible(confirmButton, 45)
		WebUI.click(confirmButton)
	}

	public void toAccountNumber(String accNum) {
		WebUI.waitForElementVisible(inputAccountNumber, 45)
		WebUI.sendKeys(inputAccountNumber, accNum)
	}

	public void toBankAccount() {
		WebUI.waitForElementVisible(addBankAccountButton, 45)
		WebUI.click(addBankAccountButton)
	}

	public void toAuthenticator() {
		String scriptPath = "javascript/token.js"
		String otp = runNodeScript(scriptPath)
		WebUI.waitForElementVisible(authenticator, 45)
		WebUI.sendKeys(authenticator, otp)
	}

	public void toBankName(String bank) {
		WebUI.waitForElementVisible(bankName, 45)
		WebUI.sendKeys(bankName, bank)
	}

	public void toCancel() {
		WebUI.waitForElementVisible(cancelButton, 45)
		WebUI.click(cancelButton)
	}

	public void toContinue() {
		WebUI.waitForElementVisible(continueButton, 45)
		WebUI.click(continueButton)
	}

	public void toCurrency(String currencies) {
		WebUI.waitForElementVisible(currency, 45)
		WebUI.sendKeys(currency, currencies)
	}

	public void toExport() {
		WebUI.waitForElementVisible(export, 45)
		WebUI.click(export)
	}

	public void toIndividual() {
		WebUI.waitForElementVisible(individual, 45)
		WebUI.click(individual)
	}

	public void toFirstName(String fname) {
		WebUI.waitForElementVisible(firstName, 45)
		WebUI.sendKeys(firstName, fname)
	}

	public void toLastName(String lname) {
		WebUI.waitForElementVisible(lastName, 45)
		WebUI.sendKeys(lastName, lname)
	}

	public void toRecipients() {
		WebUI.waitForElementVisible(recipients, 45)
		WebUI.click(recipients)
	}

	public void toRefresh() {
		WebUI.waitForElementVisible(refresh, 45)
		WebUI.click(refresh)
	}

	public void toSearch(String item) {
		WebUI.waitForElementVisible(search, 45)
		WebUI.sendKeys(search, item)
	}

	public void toSelectAccess() {
		WebUI.waitForElementVisible(selectAccess, 45)
		WebUI.click(selectAccess)
	}

	public void toSelectNGN() {
		WebUI.waitForElementVisible(selectNGN, 45)
		WebUI.click(selectNGN)
	}

	public void toAddAccount() {
		WebUI.waitForElementVisible(addAccount, 45)
		WebUI.click(addAccount)
	}
}
