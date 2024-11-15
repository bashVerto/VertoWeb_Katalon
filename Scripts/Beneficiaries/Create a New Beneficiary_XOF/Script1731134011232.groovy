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
newBeneficiaries.toCurrency(newTest.xof)
newBeneficiaries.toSelectXOF()
newBeneficiaries.toIndividual()
newBeneficiaries.toContinue()
newBeneficiaries.toFirstName(newTest.first_name)
newBeneficiaries.toLastName(newTest.last_name)
newBeneficiaries.toAccountNumber(newTest.account_number_xof)
newBeneficiaries.toSwiftCode(newTest.swift_code_xof)
newBeneficiaries.toContinue()
newBeneficiaries.toXofAddress(newTest.address_line_1_xof)
newFunction.scrollToView(newBeneficiaries.xofRecepientCountry)
newBeneficiaries.toAddRecepientCountry(newTest.recepient_country_xof)
newBeneficiaries.toselectXOFRecipientCountry()
newBeneficiaries.toAddRecepientState(newTest.recepient_state_xof)
newBeneficiaries.toAddRecepientZip(newTest.recepient_zip_xof)
newBeneficiaries.toAddRecepientCity(newTest.recepient_city_xof)
newBeneficiaries.toContinue()
newBeneficiaries.toAddAccount()
toAuthenticator = newBeneficiaries.toAuthenticator()
newBeneficiaries.toContinue()
newFunction.screenshot()

WebUI.closeBrowser()