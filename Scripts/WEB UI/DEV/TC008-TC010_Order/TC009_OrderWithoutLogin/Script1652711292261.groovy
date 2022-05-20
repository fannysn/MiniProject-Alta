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
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('WEB UI/Dummy/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('WEBUI-Object/HomePage/SelectCategory'), 0)

def name = WebUI.getText(findTestObject('WEBUI-Object/HomePage/SelectCategory-Name'))

def price = WebUI.getText(findTestObject('WEBUI-Object/HomePage/SelectCategory-Price'))

WebUI.click(findTestObject('WEBUI-Object/HomePage/button_Beli'))

WebUI.verifyElementVisible(findTestObject('WEBUI-Object/HomePage/CartBadge'), FailureHandling.STOP_ON_FAILURE)

GlobalVariable.Web_verifyName = name

GlobalVariable.Web_verifyPrice = price

WebUI.click(findTestObject('WEBUI-Object/HomePage/Page_frontend-web/Cart_Button'))

WebUI.verifyElementText(findTestObject('WEBUI-Object/Cart/ProductName'), GlobalVariable.Web_verifyName)

WebUI.click(findTestObject('WEBUI-Object/Cart/Btn-Bayar'))

WebUI.verifyElementText(findTestObject('WEBUI-Object/LoginPage/LoginHeader'), 'Login')

WebUI.callTestCase(findTestCase('WEB UI/Dummy/FillLoginForm'), [:], FailureHandling.STOP_ON_FAILURE)

