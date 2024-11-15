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

public class Wallets {

	public String runNodeScript(String scriptPath) {
		try {
			def output = ConsoleCommandBuilder.create("node ${scriptPath}").execSync();
			return output != null ? output.join("\n") : null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	//Wallet Dashboard and Add Wallet
	TestObject addFunds = findTestObject('Object Repository/Wallets/Wallets_Dashboard/CTA_AddFunds')
	TestObject addWallet = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/CTA_AddWallet')
	TestObject walletExchange = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/CTA_ExchangeNow')
	TestObject walletList = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/CTA_ListView')
	TestObject walletChart = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/CTA_ChartView')
	TestObject vPay = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/CTA_SendInstantly')
	TestObject sendMoney = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/CTA_SendMoney')
	TestObject transferNow = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/CTA_TransferNow')
	TestObject cancelAW = findTestObject ('Object Repository/Wallets/AddWallet/CTA_CancelAddWallet')
	TestObject btnAddWallet = findTestObject ('Object Repository/Wallets/AddWallet/CTA_AddWallet')
	TestObject AddWalletCcySelector = findTestObject ('Object Repository/Wallets/AddWallet/selectCurrency')
	TestObject AddWalletCcyDropdown = findTestObject ('Object Repository/Wallets/AddWallet/AWccyDropdown')
	TestObject selectionUSD = findTestObject ('Object Repository/Wallets/AddWallet/SelectUSD')
	TestObject SucessWA = findTestObject ('Object Repository/Wallets/AddWallet/SuccessWalletCreated')
	TestObject RefreshList = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/CTA_WalletListRefresh')
	TestObject SearchWallet = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/Wallet_Search')
	TestObject LookDefaultGBP = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/Default GBP Wallet')
	TestObject LookDefaultUSD = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/Default USD Wallet')
	TestObject DashWalletList = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/DashboardList')
	TestObject CurrencyColumn= findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/Currency_column')
	TestObject WalletNameColumn = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/WalletName_column')
	TestObject WalletBalColumn = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/WalletBalance_column')
	TestObject TotalBalColumn = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/TotalBalance_column')
	TestObject TypeColumn = findTestObject ('Object Repository/Wallets/Wallets_Dashboard/Wallet List and Search/Type_Column')

	//Send: V-Pay
	TestObject vPayCcySelector = findTestObject('Object Repository/Wallets/VPay/SelectCurrency')
	TestObject vPaySelectionUSD = findTestObject('Object Repository/Wallets/VPay/VpayUSD')
	TestObject vPayAmnt = findTestObject('Object Repository/Wallets/VPay/EnterAmount')
	TestObject continueStep = findTestObject('Object Repository/Wallets/VPay/CTA_ContinueFromStep1')
	TestObject vPayOption = findTestObject('Object Repository/Wallets/VPay/VPayTab')
	TestObject businessName = findTestObject('Object Repository/Wallets/VPay/EnterBusinessName')
	TestObject SelectBName = findTestObject('Object Repository/Wallets/VPay/BizName')
	TestObject vPSearchPOP = findTestObject('Object Repository/Wallets/VPay/SelectPurpose')
	TestObject selectPOP = findTestObject('Object Repository/Wallets/VPay/Select_MedicalAssistance')
	TestObject btnSend = findTestObject('Object Repository/Wallets/VPay/SendBtn')
	TestObject vPayAuth = findTestObject ('Object Repository/Wallets/VPay/ClientMFA')
	TestObject vPayAuthContinue = findTestObject ('Object Repository/Wallets/VPay/MFA_ContinueBtn')

	//Send: Wallet to Bank
	TestObject wtBCcySelector = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_ccySelector')
	TestObject wtBSelectionEUR = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_EUR')
	TestObject wtBAmnt = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_EnterAmnt')
	TestObject wtBContinueStep = findTestObject('Object Repository/Wallets/Wallet to Bank/Btn_ContinueStep')
	TestObject wtBSearchBene = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_BeneSearch')
	TestObject wtBSelectBene = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_SelectBene')
	TestObject wtBSearchPOP = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_SearchPOP')
	TestObject wtBSelectPOP = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_SelectPurpose')
	TestObject wtBListRefresh = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_Refresh')
	TestObject wtBSendBtn = findTestObject('Object Repository/Wallets/Wallet to Bank/WtB_SendBtn')
	TestObject wtBAuth = findTestObject ('Object Repository/Wallets/Wallet to Bank/WtB_AuthOTP')
	TestObject wtBAuthContinue = findTestObject ('Object Repository/Wallets/Wallet to Bank/WtB_AuthContinue')
	TestObject trxStatus = findTestObject ('Object Repository/Wallets/Wallet to Bank/Trx_Status')

	//_____________________________Wallet Dashboard_______________________________

	public void toDashAddFunds() {
		WebUI.waitForElementVisible(addFunds, 45)
		WebUI.click(addFunds)
	}

	public void toAddWallet() {
		WebUI.waitForElementVisible(addWallet, 45)
		WebUI.click(addWallet)
	}

	public void toDashWalletFX() {
		WebUI.waitForElementVisible(walletExchange, 45)
		WebUI.click(walletExchange)
	}

	public void toListWallets() {
		WebUI.waitForElementVisible(walletList, 45)
		WebUI.click(walletList)
	}

	public void toListRefresh() {
		WebUI.waitForElementVisible(RefreshList, 45)
		WebUI.click(RefreshList)
		WebUI.waitForAngularLoad(5)
	}

	public void toSendMoney() {
		WebUI.waitForElementVisible(sendMoney, 45)
		WebUI.click(sendMoney)
	}

	public void toSendVPay() {
		WebUI.waitForElementVisible(vPay, 45)
		WebUI.click(vPay)
	}

	public void toTransferBtWallets() {
		WebUI.waitForElementVisible(transferNow, 45)
		WebUI.click(transferNow)
	}

	public void toCancelAddWallet() {
		WebUI.waitForElementVisible(cancelAW, 45)
		WebUI.click(cancelAW)
	}

	public void toAWccySelect(String ccy) {
		WebUI.focus(AddWalletCcySelector)
		WebUI.click(AddWalletCcySelector)
		WebUI.sendKeys(AddWalletCcySelector, ccy)
	}

	public void toAWccyDropdown() {
		WebUI.waitForElementVisible(AddWalletCcyDropdown, 45)
		WebUI.click(AddWalletCcyDropdown)
	}

	public void toWalletSearch(String ISO) {
		WebUI.waitForElementVisible(searchWalletList, 45)
		WebUI.sendKeys(searchWalletList, ISO)
	}

	public void toSelectUSD() {
		WebUI.waitForElementVisible(selectionUSD, 45)
		WebUI.click(selectionUSD)
	}

	public void toAddWalletBtn() {
		WebUI.waitForElementVisible(btnAddWallet, 45)
		WebUI.click(btnAddWallet)
	}

	public void toWASuccess() {
		WebUI.verifyElementPresent(SucessWA, 25)
	}

	//___________________________Send V-Pay__________________________________

	public void toVPayccySelect(String ccy2) {
		WebUI.focus(vPayCcySelector)
		WebUI.click(vPayCcySelector)
		WebUI.sendKeys(vPayCcySelector, ccy2)
	}

	public void toVPaySelectUSD() {
		WebUI.waitForElementVisible(vPaySelectionUSD, 45)
		WebUI.click(vPaySelectionUSD)
	}

	public void toEnterVPayAmnt(String Amnt) {
		WebUI.waitForElementVisible(vPayAmnt, 45)
		WebUI.sendKeys(vPayAmnt, Amnt)
	}

	public void toContinueVPayStep() {
		WebUI.waitForElementVisible(continueStep, 45)
		WebUI.click(continueStep)
	}

	public void toSelectVPay() {
		WebUI.waitForElementVisible(vPayOption, 45)
		WebUI.click(vPayOption)
	}

	public void toSearchBName(String BName) {
		WebUI.focus(businessName)
		WebUI.click(businessName)
		WebUI.sendKeys(businessName, BName)
		WebUI.waitForAngularLoad(5)
	}

	public void toSelectBName() {
		WebUI.waitForElementVisible(SelectBName, 45)
		WebUI.click(SelectBName)
	}

	public void toSearchPOP(String POP) {
		WebUI.focus(vPSearchPOP)
		WebUI.click(vPSearchPOP)
		WebUI.sendKeys(vPSearchPOP, POP)
	}

	public void toSelectPOP() {
		WebUI.waitForElementVisible(selectPOP, 45)
		WebUI.click(selectPOP)
	}

	public void toSendtoBusiness() {
		WebUI.waitForElementVisible(btnSend, 45)
		WebUI.click(btnSend)
	}

	public void toVPayAuth() {
		String scriptPath = "javascript/tokenSid.js"
		String otp = runNodeScript(scriptPath)
		WebUI.waitForElementVisible(vPayAuth, 45)
		WebUI.sendKeys(vPayAuth, otp)
	}

	public void toVPayAuthContinue() {
		WebUI.waitForElementVisible(vPayAuthContinue, 45)
		WebUI.click(vPayAuthContinue)
	}

	//___________________________Send Wallet to Bank___________________________________

	public void toWtB_ccySelect(String ccy3) {
		WebUI.focus(wtBCcySelector)
		WebUI.click(wtBCcySelector)
		WebUI.sendKeys(wtBCcySelector, ccy3)
	}

	public void toWtBSelectEUR() {
		WebUI.waitForElementVisible(wtBSelectionEUR, 10)
		WebUI.click(wtBSelectionEUR)
	}

	public void toWtB_enterAmnt(String Amnt3) {
		WebUI.waitForElementVisible(wtBAmnt, 10)
		WebUI.sendKeys(wtBAmnt, Amnt3)
	}

	public void toWtBContinueStep() {
		WebUI.waitForElementVisible(wtBContinueStep, 10)
		WebUI.click(wtBContinueStep)
	}

	public void towtB_ListRefresh() {
		WebUI.waitForElementVisible(wtBListRefresh, 10)
		WebUI.click(wtBListRefresh)
		WebUI.enableSmartWait()
	}

	public void toWtB_SearchBene(String bene) {
		WebUI.focus(wtBSearchBene)
		WebUI.click(wtBSearchBene)
		WebUI.sendKeys(wtBSearchBene, bene)
	}

	public void toWtB_SelectBene() {
		WebUI.waitForElementVisible(wtBSelectBene, 20)
		WebUI.click(wtBSelectBene)
	}

	public void toWtB_SearchPOP(String vPOP) {
		WebUI.focus(wtBSearchPOP)
		WebUI.click(wtBSearchPOP)
		WebUI.sendKeys(wtBSearchPOP, vPOP)
	}

	public void toWtB_SelectPOP() {
		WebUI.waitForElementVisible(wtBSelectPOP, 20)
		WebUI.click(wtBSelectPOP)
	}

	public void toSendtoBank() {
		WebUI.waitForElementVisible(wtBSendBtn, 20)
		WebUI.click(wtBSendBtn)
	}

	public void toWtBAuth() {
		String scriptPath = "javascript/tokenSid.js"
		String otp = runNodeScript(scriptPath)
		WebUI.waitForElementVisible(wtBAuth, 20)
		WebUI.sendKeys(wtBAuth, otp)
	}

	public void toWtBAuthContinue() {
		WebUI.waitForElementVisible(wtBAuthContinue, 20)
		WebUI.click(wtBAuthContinue)
		WebUI.waitForAngularLoad(10)
	}

	public void toTrxStatus() {
		WebUI.waitForElementVisible(trxStatus, 10)
		WebUI.verifyElementPresent(trxStatus, 5)
	}

	//__________________________Wallet Listing and Search______________________________

	public void toSearchWallet(String CCode) {
		WebUI.waitForElementVisible(SearchWallet, 10)
		WebUI.sendKeys(SearchWallet, CCode)
		WebUI.waitForAngularLoad(5)
	}

	public void toDashWalletList() {
		WebUI.waitForElementVisible(DashWalletList, 45)
		WebUI.(DashWalletList)
	}
}
