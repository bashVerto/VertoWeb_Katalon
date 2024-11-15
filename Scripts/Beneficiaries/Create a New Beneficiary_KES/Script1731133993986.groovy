import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData1
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import pages.Dashboard
import pages.Beneficiaries
import api.Login
import data.TestDataManish as TestData
import data.InBuiltFunction

Login loginAPI = new Login()
Login landing_url = new Login()
Dashboard newDashboard = new Dashboard()
Beneficiaries newBeneficiaries = new Beneficiaries()
TestData newTest = new TestData()
InBuiltFunction newFunction = new InBuiltFunction()

String token = loginAPI.getToken()
String url = landing_url.landingPage()

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(url + '?jwt=' + token)

newDashboard.toBeneficiaries()
newBeneficiaries.toBankAccount()
newBeneficiaries.toCurrency(newTest.kes)
newBeneficiaries.toSelectKES()
newBeneficiaries.toIndividual()
newBeneficiaries.toContinue()
newBeneficiaries.toFirstName(newTest.first_name)
newBeneficiaries.toLastName(newTest.last_name)
newBeneficiaries.toAccountNumber(newTest.account_number_kes)
newBeneficiaries.toSwiftCode(newTest.swift_code_kes)
newBeneficiaries.toAddbankAddress(newTest.bank_address)
newBeneficiaries.toContinue()
newBeneficiaries.toAddAccount()
toAuthenticator = newBeneficiaries.toAuthenticator()
newBeneficiaries.toContinue()
newFunction.screenshot()

WebUI.closeBrowser()