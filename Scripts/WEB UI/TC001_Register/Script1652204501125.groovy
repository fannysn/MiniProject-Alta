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

WebUI.click(findTestObject('WEBUI-Object/HomePage/btn-Profile-login-logout'))

WebUI.verifyElementText(findTestObject('WEBUI-Object/LoginPage/LoginHeader'), 'Login')

WebUI.click(findTestObject('WEBUI-Object/LoginPage/RegisterLink'))

WebUI.verifyElementText(findTestObject('WEBUI-Object/RegisterPag/RegisterHeader'), 'Register')

WebUI.setText(findTestObject('WEBUI-Object/RegisterPag/FormNama'), GlobalVariable.Web_name)

WebUI.setText(findTestObject('WEBUI-Object/RegisterPag/FormEmail'), GlobalVariable.Web_email)

WebUI.setText(findTestObject('WEBUI-Object/RegisterPag/FormPassword'), GlobalVariable.Web_pass)

WebUI.click(findTestObject('WEBUI-Object/RegisterPag/button_Register'))

