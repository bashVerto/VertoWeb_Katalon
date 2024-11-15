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

	TestObject myAccount = findTestObject('Object Repository/Beneficiaries/account_number')
	TestObject inputAccountNumber = findTestObject('Object Repository/Beneficiaries/account_number')
	TestObject addBankAccountButton = findTestObject('Object Repository/Beneficiaries/add_bank_account')
	TestObject authenticator = findTestObject('Object Repository/Beneficiaries/authenticator')
	TestObject bankName = findTestObject('Object Repository/Beneficiaries/bank_name')
	TestObject cancelButton = findTestObject('Object Repository/Beneficiaries/cancel_button')
	TestObject continueButton = findTestObject('Object Repository/Beneficiaries/continue')
	TestObject currency = findTestObject('Object Repository/Beneficiaries/currency')
	TestObject export = findTestObject('Object Repository/Beneficiaries/export')
	TestObject individual = findTestObject('Object Repository/Beneficiaries/individual_beneficiary')

	TestObject paymentMethodLocalBank = findTestObject('Object Repository/Beneficiaries/p_Local Bank')
	TestObject paymentMethodInternationalBank = findTestObject('Object Repository/Beneficiaries/p_International Bank Transfer')

	TestObject firstName = findTestObject('Object Repository/Beneficiaries/first_name')
	TestObject lastName = findTestObject('Object Repository/Beneficiaries/last_name')
	TestObject recipients = findTestObject('Object Repository/Beneficiaries/recipients')
	TestObject refresh = findTestObject('Object Repository/Beneficiaries/refresh')
	TestObject search = findTestObject('Object Repository/Beneficiaries/search')
	TestObject selectAccess = findTestObject('Object Repository/Beneficiaries/select_access')
	TestObject selectKES = findTestObject('Object Repository/Beneficiaries/select_KES_1')
	TestObject selectNGN = findTestObject('Object Repository/Beneficiaries/select_NGN')
	TestObject selectUSD = findTestObject('Object Repository/Beneficiaries/div_USD')
	TestObject selectXOF = findTestObject('Object Repository/Beneficiaries/select_XOF')
	TestObject selectXOFRecipientCountry = findTestObject('Object Repository/Beneficiaries/span_Senegal')

	TestObject addAccount = findTestObject('Object Repository/Beneficiaries/add_account')
	TestObject selectedBeneficiary = findTestObject('Object Repository/Beneficiaries/selected_beneficiary')
	TestObject deleteIcon = findTestObject('Object Repository/Beneficiaries/delete_icon')
	TestObject confirmButton = findTestObject('Object Repository/Beneficiaries/confirm_button')
	TestObject rountingNumber= findTestObject('Object Repository/Beneficiaries/input_ABA CodeRouting Number_USD')
	TestObject bankAddress = findTestObject ('Object Repository/Beneficiaries/input_Bank address')
	TestObject beneficiaryMode = findTestObject ('Object Repository/Beneficiaries/input_Payment Method_beneficiaryMode')
	TestObject recipientAddress = findTestObject ('Object Repository/Beneficiaries/input_Recipient_address_line')
	TestObject swiftCode = findTestObject ('Object Repository/Beneficiaries/input_SWIFT code_swap-input')
	TestObject routingCode = findTestObject ('Object Repository/Beneficiaries/input_ABA CodeRouting Number_USD')

	TestObject xofRecepientCountry = findTestObject ('Object Repository/Beneficiaries/xof_Recepient_country_input')
	TestObject xofRecepientState = findTestObject ('Object Repository/Beneficiaries/xof_Recipient State')
	TestObject xofRecepientZip = findTestObject ('Object Repository/Beneficiaries/xof_Recipient zipcode')
	TestObject xofRecepientCity = findTestObject ('Object Repository/Beneficiaries/xof_Recipient city')
	TestObject xofAddressLine = findTestObject ('Object Repository/Beneficiaries/xof_Recipient_address_line_1')

	TestObject usdAddressLine = findTestObject ('Object Repository/Beneficiaries/xof_Recipient_address_line_1')
	TestObject usdRecepientCountry = findTestObject ('Object Repository/Beneficiaries/xof_Recepient_country_input')
	TestObject selectUSDRecipientCountry = findTestObject('Object Repository/Beneficiaries/span_United States')
	TestObject selectUSDRecipientState = findTestObject('Object Repository/Beneficiaries/span_Alabama')
	TestObject usdRecepientState = findTestObject ('Object Repository/Beneficiaries/usd_Recipient State')
	TestObject usdRecepientCity = findTestObject ('Object Repository/Beneficiaries/xof_Recipient city')
	TestObject usdRecepientZip = findTestObject ('Object Repository/Beneficiaries/xof_Recipient zipcode')

	//Beneficiary Send Money and convert and PayObjects
	TestObject selectBeneficiary = findTestObject ('Object Repository/Beneficiaries/Select_beneficiary_from_myAccount')
	TestObject selectMakePayment = findTestObject ('Object Repository/Beneficiaries/button_Make Payment_toBeneficiary')
	TestObject enterAmount = findTestObject ('Object Repository/Beneficiaries/Enter_amount_to_Send_toBeneficiary')
	TestObject purposeOfPaymentSelection = findTestObject ('Object Repository/Beneficiaries/div_Select Purpose of Payment')
	TestObject purposeOfPayment = findTestObject ('Object Repository/Beneficiaries/Click_Purpose_of_Payment')
	TestObject selectPurpose = findTestObject ('Object Repository/Beneficiaries/select_Purchase of Good(s)')
	TestObject sendToBankAccount = findTestObject ('Object Repository/Beneficiaries/Send to bank account')
	TestObject selectConvertAndPay = findTestObject ('Object Repository/Beneficiaries/button_Convert and Send Money')
	TestObject enterCovertAndPayAmount = findTestObject ('Object Repository/Beneficiaries/input_Make Payment_swap-input')


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
		String scriptPath = "javascript/tokenManish.js"
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

	public void toSelectPaymentMethod() {
		WebUI.waitForElementVisible(paymentMethodLocalBank, 45)
		WebUI.click(paymentMethodLocalBank)
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

	public void toSelectKES() {
		WebUI.waitForElementVisible(selectKES, 45)
		WebUI.click(selectKES)
	}
	public void toSelectUSD() {
		WebUI.waitForElementVisible(selectUSD, 45)
		WebUI.click(selectUSD)
	}

	public void toSelectXOF() {
		WebUI.waitForElementVisible(selectXOF, 45)
		WebUI.click(selectXOF)
	}
	public void toselectXOFRecipientCountry() {
		WebUI.waitForElementVisible(selectXOFRecipientCountry, 45)
		WebUI.click(selectXOFRecipientCountry)
	}

	public void toAddAccount() {
		WebUI.waitForElementVisible(addAccount, 45)
		WebUI.click(addAccount)
	}
	public void toAddrountingNumber() {
		WebUI.waitForElementVisible(rountingNumber, 45)
		WebUI.click(rountingNumber)
	}
	public void toAddbankAddress(String bankAddressValue) {
		WebUI.waitForElementVisible(bankAddress, 45)
		WebUI.sendKeys(bankAddress, bankAddressValue)
	}
	public void toSelectBeneficiaryMode() {
		WebUI.waitForElementVisible(beneficiaryMode, 45)
		WebUI.click(beneficiaryMode)
	}
	public void toAddRecipientAddress() {
		WebUI.waitForElementVisible(recipientAddress, 45)
		WebUI.click(recipientAddress)
	}
	public void toSwiftCode(String swiftCodevalue) {
		WebUI.waitForElementVisible(swiftCode, 2000)
		WebUI.sendKeys(swiftCode, swiftCodevalue)
	}

	public void toRoutingCode(String routingCodevalue) {
		WebUI.waitForElementVisible(routingCode, 2000)
		WebUI.sendKeys(routingCode, routingCodevalue)
	}
	public void toAddRecepientCountry (String recCntry) {
		//		WebUI.focus(xofRecepientCountry)
		WebUI.click(xofRecepientCountry)
		WebUI.sendKeys(xofRecepientCountry, recCntry)
	}
	public void toAddRecepientState(String recState) {
		WebUI.waitForElementVisible(xofRecepientState, 45)
		WebUI.sendKeys(xofRecepientState, recState)
	}
	public void toAddRecepientZip(String recZip) {
		WebUI.waitForElementVisible(xofRecepientZip, 45)
		WebUI.sendKeys(xofRecepientZip, recZip)
	}
	public void toAddRecepientCity(String recCity) {
		WebUI.waitForElementVisible(xofRecepientCity, 45)
		WebUI.sendKeys(xofRecepientCity,recCity )
	}
	public void toXofAddress(String recAddress) {
		WebUI.waitForElementVisible(xofAddressLine, 45)
		WebUI.sendKeys(xofAddressLine, recAddress)
	}

	public void toUsdAddress(String recAddressUsd) {
		WebUI.waitForElementVisible(usdAddressLine, 45)
		WebUI.sendKeys(usdAddressLine, recAddressUsd)
	}
	public void toUsdRecepientCountry (String recCntryUsd) {
		//		WebUI.focus(xofRecepientCountry)
		WebUI.click(usdRecepientCountry)
		WebUI.sendKeys(usdRecepientCountry, recCntryUsd)
	}

	public void toselectUsdRecipientCountry() {
		WebUI.waitForElementVisible(selectUSDRecipientCountry, 45)
		WebUI.click(selectUSDRecipientCountry)
	}
	public void toAddUsdRecepientState() {
		WebUI.waitForElementVisible(usdRecepientState, 45)
		WebUI.click(usdRecepientState)
	}
	public void toAddUsdRecepientZip(String recZipUsd) {
		WebUI.waitForElementVisible(usdRecepientZip, 45)
		WebUI.sendKeys(usdRecepientZip, recZipUsd)
	}
	public void toAddUsdRecepientCity(String recCityUsd) {
		WebUI.waitForElementVisible(usdRecepientCity, 45)
		WebUI.sendKeys(usdRecepientCity,recCityUsd)
	}
	public void toselectUsdRecipientState() {
		WebUI.waitForElementVisible(selectUSDRecipientState, 45)
		WebUI.click(selectUSDRecipientState)
	}
	//Beneficiary Send Money function
	public void toselectBeneficiary() {
		WebUI.waitForElementVisible(selectBeneficiary, 45)
		WebUI.click(selectBeneficiary)
	}
	public void toselectMakePayment() {
		WebUI.waitForElementVisible(selectMakePayment, 45)
		WebUI.click(selectMakePayment)
	}
	public void toenterAmount(String amount) {
		WebUI.waitForElementVisible(enterAmount, 45)
		WebUI.sendKeys(enterAmount,amount)
	}
	public void toEnterPurposeOfPayment() {
		WebUI.waitForElementVisible(purposeOfPayment, 45)
		WebUI.click(purposeOfPayment)
	}
	public void toSelectPurposeOfPayment() {
		//WebUI.waitForElementVisible(selectPurpose, 45)
		WebUI.waitForElementVisible(selectPurpose, 10)
		WebUI.click(selectPurpose)
	}
	public void tosendToBankAccount() {
		WebUI.waitForElementVisible(sendToBankAccount, 45)
		WebUI.click(sendToBankAccount)
	}
	public void toselectConvertAndPay() {
		WebUI.waitForElementVisible(selectConvertAndPay, 45)
		WebUI.click(selectConvertAndPay)
	}
	public void toenterCovertAndPayAmount(String amount1) {
		WebUI.waitForElementVisible(enterCovertAndPayAmount, 45)
		WebUI.sendKeys(enterCovertAndPayAmount,amount1)
	}
}