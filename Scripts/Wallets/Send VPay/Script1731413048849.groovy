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
import pages.Dashboard as Dashboard
import pages.Wallets as Wallets
import api.Login as Login
import data.TestDataSid as TestData
import data.InBuiltFunction as InBuiltFunction

Login loginAPI = new Login()
Login landing_url = new Login()
Dashboard newDashboard = new Dashboard()
Wallets newWallet = new Wallets()
TestData newTest = new TestData()
InBuiltFunction newFunction = new InBuiltFunction()
String token = loginAPI.getToken()
String url = landing_url.landingPage()

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(url+'?jwt='+token)

newDashboard.toWallets()
newWallet.toSendVPay()
newWallet.toVPayccySelect(newTest.usd)
newWallet.toVPaySelectUSD()
newWallet.toEnterVPayAmnt(newTest.amnt)
newWallet.toContinueVPayStep()
newWallet.toSelectVPay()
newWallet.toSearchBName(newTest.businessName)
newWallet.toSelectBName()
newWallet.toSearchPOP(newTest.purposeOfPayment)
newWallet.toSelectPOP()
newWallet.toSendtoBusiness()
newWallet.toVPayAuth()
newWallet.toVPayAuthContinue()
newFunction.screenshot()

WebUI.closeBrowser()