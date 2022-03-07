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

WebUI.callTestCase(findTestCase('CB2/Common/Browser open'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('CB2/Homepage/homepage_banner_2'))

WebUI.verifyElementVisible(findTestObject('CB2/Homepage/search_input_homepage'))

WebUI.verifyElementVisible(findTestObject('CB2/Homepage/hompage_logo'))

WebUI.verifyElementVisible(findTestObject('CB2/Homepage/profile_wishlist_cart_block'))

WebUI.click(findTestObject('CB2/Common/main_navigation_burger_menu'))

WebUI.verifyElementVisible(findTestObject('CB2/Homepage/homepage_leftside_navigation'))

WebUI.verifyElementPresent(findTestObject('CB2/Homepage/homepage_promotion'), 0)

WebUI.verifyElementVisible(findTestObject('CB2/Homepage/homepage_banner_1'))

WebUI.scrollToElement(findTestObject('CB2/Homepage/homepage_banner_2'), 0)

WebUI.scrollToElement(findTestObject('CB2/Homepage/homepage_banner_3'), 0)

WebUI.verifyElementVisible(findTestObject('CB2/Homepage/homepage_banner_3'))

WebUI.scrollToElement(findTestObject('CB2/Homepage/our_radar_section'), 0)

WebUI.verifyElementVisible(findTestObject('CB2/Homepage/our_radar_section'))

WebUI.closeBrowser()

