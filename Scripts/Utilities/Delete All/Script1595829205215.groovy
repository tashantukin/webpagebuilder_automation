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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver

//WebUI.callTestCase(findTestCase('UI/Admin/01_verify_if_installed'), [:], FailureHandling.STOP_ON_FAILURE)
//
//String xpath = '//*[@id="del"]/i'
//
//List elems = DriverFactory.getWebDriver().findElements(By.xpath(xpath))
//
////List elems2 = DriverFactory.getWebDriver().findElements(By.xpath(xpath2))
//for (WebElement elem : elems) {
//    elem.click()
//
//    //	String xpath2 = '//*[@id="popup_btnconfirm"]'
//    //	List elems2 = DriverFactory.getWebDriver().findElements(By.xpath(xpath2))
//    //for (WebElement elem2 : elems2) {
//   // WebUI.waitForElementVisible(findTestObject('actions_buttons/delete_ok'), 0)
//	WebUI.click(findTestObject('actions_buttons/delete_ok'))
//}
WebUI.callTestCase(findTestCase('UI/Admin/01_verify_if_installed'), [:], FailureHandling.STOP_ON_FAILURE)

//WebDriver driver = DriverFactory.getWebDriver()

//'Expected value from Table'
//String ExpectedValue = 'Pay Talk'
//
////'To locate table'
//WebElement Table = driver.findElement(By.xpath('//*[@id="no-more-tables1"]'))
//
////'To locate rows of table it will Capture all the rows available in the table'
//List rows_table = Table.findElements(By.tagName('tr'))
//
////'To calculate no of rows In table'
//int rows_count = rows_table.size()
//
//'Loop will execute for all the rows of the table'
//Loop: for (int row = 0; row < rows_count; row++) {
//    //    String xpath = '//*[@id="del"]/i'
//    WebUI.click(findTestObject('actions_buttons/i_Published_icon icon-delete'), FailureHandling.STOP_ON_FAILURE)
//
//    WebUI.click(findTestObject('actions_buttons/delete_ok'))
//
//    //'To locate columns(cells) of that specific row'
//    List Columns_row = rows_table.get(row).findElements(By.tagName('td'))
//
//    'To calculate no of columns(cells) In that specific row'
//    int columns_count = Columns_row.size()
//
//    println((('Number of cells In Row ' + row) + ' are ') + columns_count)
//
//    //  'Loop will execute till the last cell of that specific row'
//    for (int column = 0; column < columns_count; column++) {
//        // 'It will retrieve text from each cell'
//        String celltext = Columns_row.get(column).getText()
//
//        println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
//
//        'Checking if Cell text is matching with the expected value' //   if (celltext == ExpectedValue) {
//        //
//        //	'Getting the Country Name if cell text i.e Company name matches with Expected value'
//        //
//        //	println('Text present in row number 3 is: ' + Columns_row.get(2).getText())
//        //
//        //	'After getting the Expected value from Table we will Terminate the loop'
//        //
//        //	break Loop;
//        //
//        //   }
//    }
//}
//String xpath = '//*[@id="del"]/i'
//
////
//List elems = DriverFactory.getWebDriver().findElements(By.xpath(xpath))
//WebDriver driver = DriverFactory.getWebDriver()
////List elements = driver.findElements(By.xpath('//*[@id="del"]/i'))
//for (int i = 1; i <= elems.size(); i++) {
//    WebElement element = driver.findElement(By.xpath(('//*[@id="del"]/i[' + i) + ']'), { 
//		WebUI.click(findTestObject('actions_buttons/i_Published_icon icon-delete'))
//		WebUI.click(findTestObject('actions_buttons/delete_ok'))
//		
//        })
//
//    
//}

