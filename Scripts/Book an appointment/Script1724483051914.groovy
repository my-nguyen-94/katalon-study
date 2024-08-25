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

WebUI.openBrowser('')

CustomKeywords.'MyKeyword.Login'()

for (def n : (0..2)) {
    if (n == 0) {
        WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_facility'), 0)

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_facility'), 1)

        WebUI.delay(1)
    } else {
        WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_facility'), 2)

        WebUI.delay(1)
    }
    
    WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission'))

    WebUI.click(findTestObject('Page_CURA Healthcare Service/radio_None'))

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Visit Date'), date, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment'), comment)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btn_Book Appointment'))

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btn_Go to Homepage'))

    CustomKeywords.'MyKeyword.Congrats'('My Nguyen')
}

WebUI.closeBrowser()

