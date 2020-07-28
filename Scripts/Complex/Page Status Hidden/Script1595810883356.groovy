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

WebUI.callTestCase(findTestCase('UI/Admin/01_verify_if_installed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('staging_createPage/button_createpage'))

WebUI.setText(findTestObject('staging_createPage/input_title'), GlobalVariable.Title)

WebUI.setText(findTestObject('iframe_body'), GlobalVariable.Body)

WebUI.click(findTestObject('add_page/label_Hide'))

WebUI.click(findTestObject('staging_createPage/button_save'))

WebUI.click(findTestObject('actions_buttons/img'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('404_error/404_error'), 0)

WebUI.verifyElementPresent(findTestObject('404_error/404_error'), 0)

