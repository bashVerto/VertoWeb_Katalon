package data

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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TestDataManish {

	String kes = "KES"
	String first_name = "Manish"
	String last_name = "Inamdar"
	String account_number_kes = "565222522"
	String swift_code_kes = "BARCKENXMDR"
	String bank_address = "Test"

	String ngn = "NGN"
	String account_number_ngn = "0057778435"
	String bank_name = "Access"

	String usd = "USD"
	String account_number_usd = "86522522"
	String routing_number_usd = "322271627"
	String address_line_1_usd = "Test Automation"
	String recepient_country_usd = "United States"
	String recepient_state_usd = "Alabama"
	String recepient_city_usd = "Tuscony"
	String recepient_zip_usd = "411021"

	String xof = "XOF"
	String account_number_xof = "655252522252111525555545"
	String swift_code_xof = "ECOCCIABXXX"
	String address_line_1_xof = "Test"
	String recepient_country_xof = "Senegal"
	String recepient_state_xof = "Test"
	String recepient_city_xof = "Dakar"
	String recepient_zip_xof = "411021"

	//Send money test data
	String amount_to_send = "100"
	String purpose_of_payment = "Wallet Top Up"
}