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

WebUI.callTestCase(findTestCase('Utilities/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('UI/Admin/01_verify_if_installed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('staging_createPage/button_createpage'))

WebUI.setText(findTestObject('staging_createPage/input_title'), GlobalVariable.title_merchantOnly)

WebUI.setText(findTestObject('iframe_body'), GlobalVariable.Body)

WebUI.click(findTestObject('add_page/label_Publish'))

WebUI.click(findTestObject('add_page/label_Merchants only'))

WebUI.click(findTestObject('staging_createPage/button_save'))

WebUI.comment('Start External Link Config')

WebUI.click(findTestObject('configure_external_links/link_configuration'))

WebUI.click(findTestObject('configure_external_links/link_externallinks'))

//if (WebUI.verifyElementVisible(findTestObject('configure_external_links/button_delete') == true)) {
//	
//	WebUI.click(findTestObject('configure_external_links/button_delete'))
//	
////}
//}
//else {
WebUI.setText(findTestObject('CONF_LINK/title'), 'Merchant Only')

WebUI.setText(findTestObject('CONF_LINK/link'), 'https://diagonalley.staging.arcadier.io/pages/merchant-only')

WebUI.click(findTestObject('CONF_LINK/button_Add'))

WebUI.click(findTestObject('CONF_LINK/button_Save'))

WebUI.comment('Login to merchant user')

WebUI.callTestCase(findTestCase('Utilities/Login Merchant'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('redirect_merchantOnly/span_()_dd-pointer dd-pointer-down'))

WebUI.click(findTestObject('redirect_merchantOnly/a_Merchant Only'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('redirect_merchantOnly/h1_Merchant Only'))

WebUI.delay(2)

WebUI.comment('Login in buyer page ')

WebUI.callTestCase(findTestCase('Utilities/Login Buyer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('redirect_merchantOnly/span_()_dd-pointer dd-pointer-down'))

WebUI.click(findTestObject('redirect_merchantOnly/a_Merchant Only'))

WebUI.verifyElementPresent(findTestObject('404_error/404_error'),  FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Verify for Guest users')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url_user)

WebUI.click(findTestObject('guess_user/span_VIEW CART_dd-pointer dd-pointer-down'))

WebUI.click(findTestObject('guess_user/a_Merchant Only'))

WebUI.verifyElementNotPresent(findTestObject('guess_user/h2_404'), 0)

WebUI.callTestCase(findTestCase('Utilities/Delete Links'), [:], FailureHandling.STOP_ON_FAILURE)

