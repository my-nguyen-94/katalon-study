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

WebUI.callTestCase(findTestCase('Common/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://mcdev.ubteam.co.uk/inspire-home')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/input_Inspire Home search portal test search_q'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/btn_enter_at_inspire_banner'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/div_Pick of the week'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/text_Pick of the week'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/div_Most viewed'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/img_inspire_home_logo (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/link_Inspire Vision'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Inspire Vision'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/link_Video Library'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Video Library'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/link_Downloads'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Downloads'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/link_Blog'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Blog'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/link_Favourites'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Favourites'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/link_My Videos'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_My Videos'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/div_footer_inspire_home'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/div_footer_ubt'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/div_search_topic_section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/div_ubt_header'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Inspire home/div_inspire_home_header'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/img_inspire_home_logo'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/span_Video library_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Downloads_header'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Blog_header'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Favourites_header'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_My videos_header'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Inspire vision_header'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Inspire home/link_Search Index_header'))

WebUI.closeBrowser()

